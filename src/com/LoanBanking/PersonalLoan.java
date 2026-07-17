package com.LoanBanking;


public class PersonalLoan extends LoanImpl {

	void getPersonalDocumnetn() {
		System.out.println("All personal loan documents are verified");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to vk loans");
		PersonalLoan p = new PersonalLoan();
		if (p.validateAadhar() && p.validatePAN() && p.validatePhone()) {
			double salary = p.getCustomerSalary();
			double cibileScore = p.getCibilScore();
			double age = p.getCustomerAge();
			if (salary >= 1000000.00 && (cibileScore >= 300 && cibileScore <= 900) && (age >= 25 && age <= 60)) {
				System.out.println("Congratulations !!! your eligible for loan");

				double roi = p.getRoIinfo();
				if (cibileScore >= 300 && cibileScore <= 599) {
					System.out.println("Poor score, lone application is rejected");
					roi = 11.0;

				} else if (cibileScore >= 600 && cibileScore <= 699) {
					System.out.println("fail Score, moderate risk");
					roi = 10.0;
				} else if (cibileScore >= 700 && cibileScore <= 749) {
					System.out.println("Good score, better chance of loan approval");
					roi = 9.0;
				} else if (cibileScore >= 745 && cibileScore <= 900) {
					System.out.println("Excelent score, lowest risk");
					roi = 8.0;
				} else {
					System.out.println("invalid cibil score");
				}

				System.out.println("you are Eligible for personal loan!");
				System.out.println("your loan rate of intrest is : " + p.getRoIinfo());
				System.out.println("cutomer details: " + p.getAddressInfo());
				p.getPersonalDocumnetn();

			} else {
				System.out.println("your not Eligible for personal loan");
			}

		} else {
			System.out.println("something went wrong with your personal details");
		}

	}

}
