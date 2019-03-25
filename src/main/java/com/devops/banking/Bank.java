package com.devops.banking;

import java.util.*;

public class Bank
{
  public String customerName;
	private double balance;
	private int accountNumber;
	private int phoneNumber;
	public String email;

	public Bank(String customerName, String email, int phoneNumber, int accountNumber, double balance) {
		this.customerName =  customerName;
		//	System.out.println("account holder's name : " + customerName);
		this.email = email;
		//	System.out.println("E-mail : " + email);
		this.phoneNumber = phoneNumber;
		//	System.out.println("Phone number : " + phoneNumber);
		this.accountNumber = accountNumber;
		//	System.out.println("Account number : " + accountNumber);
		this.balance = 50.0d;
		//	System.out.println("Current lance is : " + balance);
	}

	public double deposit() {
		Scanner depAmount = new Scanner(System.in);
		System.out.println("enter amount to deposit : ");
		balance = balance + depAmount.nextDouble();
		return balance;
	}

	public double withDraw() {
		Scanner withDrawAmount = new Scanner(System.in);
		System.out.println("enter withdraw amount : ");
		balance = balance - withDrawAmount.nextDouble();
		return balance;
	}

  public double showBalance() {
    return balance;
  }

  public void details() {
		System.out.println("Customer details : ");
		System.out.println("Customer name : " + customerName);
		System.out.println("email : "+ email);
		System.out.println("phone number : " + phoneNumber);
		System.out.println("account number : " + accountNumber);
		System.out.println("current balance : " + balance);
		System.out.println("Thank you");
	}

	public void options(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a valid input in the given options : ");
		System.out.println("\n1.Deposit Amount \n2.Withdraw Amount \n3.Check the Current Balance \n4.Account Details");
		switch(input.nextInt()) {
			case(1) :
			deposit();
			break;
			case(2) :
			withDraw();
			break;
			case(3):
      showBalance();
			break;
			case(4):
			details();
			break;
			default:
			System.out.println("Error! Invalid input. Please enter valid input");
		}
	}

	public static void main(String[] args) {
		Bank depository = new Bank("MR","test@gmail.com",1545454545,123456789,50.0d);
		depository.options();
		System.out.println("current balance the in account : " + depository.showBalance() );
		System.out.println("__________________________________");
		//depository.details();
	}
}
