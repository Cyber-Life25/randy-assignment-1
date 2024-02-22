package com.coderscampus.Randy;

public class Week1 {
	

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        

	        System.out.println("Type in your starting investment:");
	        double initialInvestment = scanner.nextDouble();

	        System.out.println("Type in your interest rate:");
	        double yearlyInterestRate = scanner.nextDouble();

	        for (int i = 5; i <= 30; i += 5) {
	            double totalAmount = calculateCompoundInterest(initialInvestment, yearlyInterestRate, i);
	            System.out.printf("After %d years, you would have: %.2f\n", i, totalAmount);
	        }

	        scanner.close();
	    }