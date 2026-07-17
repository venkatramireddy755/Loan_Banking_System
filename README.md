# 🏦 Loan Banking System POC (Java OOP Project)

A console-based **Loan Banking System** developed in **Java** using **Object-Oriented Programming (OOP)** concepts. 
This project validates customer details, checks loan eligibility based on salary, age, and CIBIL score, calculates the applicable rate of interest (ROI), 
and verifies loan-specific documents.

---

## 📌 Features

- ✅ Aadhar Number Validation
- ✅ PAN Card Validation
- ✅ Phone Number Validation
- ✅ Customer Salary Verification
- ✅ Age Validation
- ✅ CIBIL Score Validation
- ✅ Loan Eligibility Check
- ✅ Rate of Interest (ROI) Calculation
- ✅ Address Collection
- ✅ Home Loan Document Verification
- ✅ Personal Loan Document Verification

---

## 🛠️ Technologies Used

- Java
- Eclipse IDE
- Object-Oriented Programming (OOP)
- Regular Expressions (Regex)
- Scanner Class

---

## 📂 Project Structure

```
LoanBanking/
│
├── Loan.java              // Interface containing loan operations
├── LoanImpl.java          // Common implementation for validation methods
├── HomeLoan.java          // Home Loan module
└── PersonalLoan.java      // Personal Loan module
```

---

## 📖 OOP Concepts Used

### 1. Interface
`Loan.java` defines the common methods required for all loan types.

Examples:
- validateAadhar()
- validatePAN()
- validatePhone()
- getCustomerSalary()
- getCustomerAge()
- getCibilScore()
- getRoIinfo()
- getAddressInfo()

---

### 2. Inheritance

Both loan modules inherit common functionality from `LoanImpl`.

```
Loan
   ↑
LoanImpl
   ↑
 ┌───────────────┐
 │               │
HomeLoan   PersonalLoan
```

---

### 3. Code Reusability

All common validation methods are written once in `LoanImpl` and reused by both loan modules.

---

### 4. Abstraction

The interface hides implementation details and exposes only required operations.

---

### 5. Method Organization

Each class performs a single responsibility:

- Loan → Method declarations
- LoanImpl → Common validations
- HomeLoan → Home loan processing
- PersonalLoan → Personal loan processing

---

## 🔍 Validation Rules

### Aadhar Validation

- Must contain exactly **12 digits**

Example:

```
123456789012
```

Regex:

```
\\d{12}
```

---

### PAN Validation

Format:

```
ABCDE1234F
```

Regex:

```
[A-Z]{5}[0-9]{4}[A-Z]
```

---

### Phone Validation

- Starts with 6–9
- Contains exactly 10 digits

Regex:

```
[6-9][0-9]{9}
```

---

## 📊 Loan Eligibility Criteria

### Home Loan

| Condition | Requirement |
|-----------|-------------|
| Salary | ₹30,000 or above |
| Age | 25 - 60 Years |
| CIBIL Score | 300 - 900 |

---

### Personal Loan

| Condition | Requirement |
|-----------|-------------|
| Salary | ₹10,00,000 or above |
| Age | 25 - 60 Years |
| CIBIL Score | 300 - 900 |

---

## 💰 Rate of Interest (ROI)

| CIBIL Score | Status | ROI |
|-------------|--------|-----|
| 300-599 | Poor | 11% |
| 600-699 | Fair | 10% |
| 700-749 | Good | 9% |
| 750-900 | Excellent | 8% |

---

## ▶️ How to Run

1. Clone the repository

```
git clone https://github.com/yourusername/LoanBankingSystem.git
```

2. Open the project in Eclipse.

3. Run either:

- HomeLoan.java
or
- PersonalLoan.java

4. Enter the required customer details.

5. The application displays:

- Validation Status
- Eligibility
- Rate of Interest
- Customer Address
- Document Verification Status

---

## 📸 Sample Output

```
Welcome to VK Home Loans

Enter Aadhar number
123456789012

Enter PAN number
ABCDE1234F

Enter Phone number
9876543210

Enter Salary
50000

Enter Age
30

Enter CIBIL Score
760

Congratulations!!! You are eligible for loan.

Excellent score, lowest risk

You are Eligible for Home Loan!

Your loan rate of interest is : 8.0

Your home loan documents are verified.
```

---

## 🎯 Learning Outcomes

This project helped in understanding:

- Java Interfaces
- Inheritance
- Method Reuse
- Input Validation using Regex
- Scanner Class
- Conditional Statements
- Console-Based Application Development
- Object-Oriented Programming Principles

---

## 🚀 Future Enhancements

- Add Car Loan Module
- Add Education Loan Module
- Store Customer Details in MySQL
- GUI using Java Swing or JavaFX
- Exception Handling
- File Handling
- JDBC Integration
- Admin Login
- Customer Login
- EMI Calculator
- Loan Approval History

---

## 👨‍💻 Author

**Kapu Venkatrami reddy**

- Java Full Stack Developer
- Passionate about Java, OOP, SQL, and Full Stack Development

GitHub: https://github.com/venkatramireddy755
LinkedIn: www.linkedin.com/in/venkatrami-reddy-kapu-2a0719283

---

## ⭐ If you found this project useful, don't forget to Star the repository.
