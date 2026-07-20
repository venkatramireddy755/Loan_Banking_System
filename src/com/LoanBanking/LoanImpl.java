package com.LoanBanking;

import java.util.Scanner;
//in chatgpt explain or readme file howe to keep in my git and i need to explain 
//to the interviewer;
public class LoanImpl implements Loan{
	static Scanner scanner = new Scanner(System.in);

	public boolean validateAadhar() {
		System.out.println("Enter Aadhar number");
		String aadhar = scanner.next();
		return aadhar.matches("\\d{12}");
	}

	public boolean validatePAN() {
		System.out.println("Enter your PAN number");
		String pan = scanner.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");

	}

	public boolean validatePhone() {
		System.out.println("Enter your Phone number");
		String phone = scanner.next();
		return phone.matches("[6-9][0-9]{9}");
	}

	public double getCustomerSalary() {
		System.out.println("Enter you salary");
		double salary = scanner.nextDouble();
		return salary;

	}

	public double getCustomerAge() {
		System.out.println("Enter your age");
		double age = scanner.nextDouble();
		return age;
	}

	public double getCibilScore() {
		System.out.println("enter your cibil score");
		int cibil = scanner.nextInt();
		return cibil;
	}

	public double getRoIinfo() {
		// roi stands for rate of interest
		double roi = 12.0;

		return roi;
	}

	public String getAddressInfo() {
		String address = "";
		System.out.println("Enter your flat number");
		String flat = scanner.next();

		System.out.println("plot name");
		scanner.nextLine();
		String plotName = scanner.nextLine();

		System.out.println("Enter plot street");
		String street = scanner.nextLine();

		System.out.println("Enter city");
		String city = scanner.nextLine();

		System.out.println("Enter Pin code");
		String pin = scanner.nextLine();

		address = "\nfloat No: " + flat + "\n" + "Plot name : " + plotName + "\n" + "Street : " + street + "\n" + "city: "
				+ city + "\n" + "Pin: " + pin;

		return address;
	}


}
