package com.LoanBanking;

public class HomeLoan extends LoanImpl {
	void getHomeDocuments() {
		System.out.println("Your home loan documents are verified");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to vk home loans");
		HomeLoan h=new HomeLoan();
		
		if (h.validateAadhar() && h.validatePAN() && h.validatePhone()) {
			double salary = h.getCustomerSalary();
			double cibileScore = h.getCibilScore();
			double age = h.getCustomerAge();
			
			if (salary >= 30000.00 && (cibileScore >= 300 && cibileScore <= 900) && (age >= 25 && age <= 60)) {
				System.out.println("Congratulations !!! your eligible for loan");
				
				double roi=h.getRoIinfo();
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
				
				System.out.println("you are Eligible for Home loan!");
				System.out.println("your loan rate of interest is : " + roi);
				System.out.println("cutomer details: " + h.getAddressInfo());
				h.getHomeDocuments();
				

			} else {
				System.out.println("your not Eligible for personal loan");
			}

		} else {
			System.out.println("something went wrong with your personal details");
		}


		
	}

}
