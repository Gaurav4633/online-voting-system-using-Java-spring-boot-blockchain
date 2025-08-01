package com.example.voting.service;


import com.example.voting.blockchain.Blockchain;
import com.example.voting.entity.Candidate;
import com.example.voting.entity.Voter;
import com.example.voting.repository.CandidateRepository;
import com.example.voting.repository.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotingService {

    @Autowired
    private VoterRepository voterRepo;

    @Autowired
    private CandidateRepository candidateRepo;

    private final Blockchain blockchain = new Blockchain();

    public String castVote(Long voterId, Long candidateId) {
        Voter voter = voterRepo.findById(voterId).orElse(null);
        if (voter == null || voter.isHasVoted()) {
            return "Invalid voter or already voted";
        }
        Candidate candidate = candidateRepo.findById(candidateId).orElse(null);
        if (candidate == null) {
            return "Invalid candidate";
        }

        candidate.setVoteCount(candidate.getVoteCount() + 1);
        voter.setHasVoted(true);
        blockchain.addBlock("VoterID:" + voterId + " voted for CandidateID:" + candidateId);

        candidateRepo.save(candidate);
        voterRepo.save(voter);

        return "Vote cast successfully!";
    }

    public List<Candidate> getResults() {
        return candidateRepo.findAll();
    }

    public Object getBlockchain() {
        return blockchain.getChain();
    }
}