package com.example.voting.controller;

import com.example.voting.entity.Candidate;
import com.example.voting.service.VotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vote")
public class VotingController {

    @Autowired
    private VotingService votingService;

    @PostMapping("/cast")
    public String castVote(@RequestParam Long voterId, @RequestParam Long candidateId) {
        return votingService.castVote(voterId, candidateId);
    }


    @GetMapping("/results")
    public List<Candidate> getResults() {
        return votingService.getResults();
    }

    @GetMapping("/chain")
    public Object getBlockchain() {
        return votingService.getBlockchain();
    }
}
