package com.LoanBanking;
public interface Loan {
	boolean validateAadhar();
	boolean validatePAN();
	boolean validatePhone();
	double getCustomerSalary();
	double getCustomerAge();
	double getCibilScore();
	double getRoIinfo();
	String getAddressInfo();

}

