# 🗳️ Online Voting System using Blockchain (Spring Boot)

This project is a secure Online Voting System built using **Java Spring Boot** and implements **Blockchain** to ensure transparency and tamper-proof voting. It allows voters to cast their votes for candidates, and each vote is securely recorded as a block in a blockchain ledger.

---

## 📌 Features

- ✅ Secure vote casting
- ✅ Vote once per voter validation
- ✅ Blockchain-powered vote tracking
- ✅ Vote result visualization
- ✅ RESTful API for vote management
- ✅ Auto-redirect after voting (Frontend)
- ✅ Bootstrap-styled UI

---

## 🧱 Tech Stack

| Layer       | Technology                     |
|-------------|--------------------------------|
| Backend     | Java, Spring Boot              |
| 
| Database    | MySQL                          |
| Blockchain  | Custom implementation in Java  |
| Tools       | IntelliJ / Eclipse, Postman, Git, Maven |

---

src/
├── main/
│ ├── java/com/example/voting/
│ │ ├── controller/
│ │ ├── model/
│ │ ├── repository/
│ │ ├── service/
│ │ └── VotingApplication.java
│ ├── resources/
│ │ ├── static/
│ │ ├── templates/
│ │ ├── application.properties
│ │ └── data.sql

## 🔌 API Endpoints

| Method | Endpoint                | Description             |
|--------|-------------------------|-------------------------|
| GET    | `/api/candidates`       | Get list of candidates  |
| POST   | `/api/vote`             | Submit a vote           |
| GET    | `/api/results`          | Get voting results      |

2. Build and Run the Backend
 Make sure MySQL is configured in application.properties or use H2 for testing

3. API Testing (Optional)
Use Postman to test:

POST /api/vote

GET /api/results

4. 🧱 Blockchain Functionality
  vote is recorded as a block

  block stores:

 Voter ID (hashed or encoded)

 Candidate ID

Timestamp

Hash of previous block

📸 Screenshots
(Add screenshots of your voting UI, blockchain ledger view, etc.)



| GET    | `/api/blockchain`       | View blockchain ledger  |

