package calculatorV1;

import java.util.Scanner;

public class EmployeeCalculatorV51 {
	
	//Variable declaration
	static String nameOfEmployee;
	static double numberOfHourWorked;
	static double hourlyPayRate;
	static double grossPay;
	static double netPay;
	
	
	//Module:Welcome
	public static void wellCome() {
		System.out.println(".....Well Come to EMP Cal-Please follow the instruction.......");
		System.out.println(" ");
		System.out.println(" ");
	}
	
	//Module:GetInput
	public static void getInput() {
		
		Scanner hrscan = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		nameOfEmployee = hrscan.nextLine();
		
		
		boolean continueToNextStep;
		
		do {
			try {
				
				hrscan = new Scanner(System.in);
				System.out.println("Enter Employee Total Hour");
			    numberOfHourWorked = hrscan.nextDouble();
		
		    if(numberOfHourWorked >= 0 && numberOfHourWorked <= 80) {
			continueToNextStep = true;
			}
		else {
			System.out.println("Invalid Entry,hours should be  0 to 80  !!!!");
		   continueToNextStep = false;
		}
			}
		catch(Exception e) {
			System.out.println("Exception Happen,Please Enter Valid Number");
			continueToNextStep = false;
		}
		
		}
		while(!continueToNextStep);
		
		//for Pay Rate
		
		do {
			try {
				
				hrscan = new Scanner(System.in);
				System.out.println("Enter Employee Hourly Pay Rate");
			    hourlyPayRate = hrscan.nextDouble();
		
		    if(hourlyPayRate >= 0 && hourlyPayRate <= 20) {
			continueToNextStep = true;
			}
		else {
			System.out.println("Please Enter Valid Hire rate Between 0 - 20!!!!");
		   continueToNextStep = false;
		}
			}
		catch(Exception e) {
			System.out.println("Exception Happen,Please Enter Valid Rate");
			continueToNextStep = false;
		}
		
		}
		while(!continueToNextStep);
		
		
		
	}
	
	//Module:Calculate Salary
	public static void calculateGrossPay() {
		grossPay = numberOfHourWorked * hourlyPayRate; 
		
	}
	public static void calculateNetPay() {
		
		if (grossPay > 0 && grossPay <= 1500) {
			netPay = grossPay - (grossPay * 10) / 100;
		} 
		else if (grossPay > 1500 && grossPay <= 3000) {
			netPay = grossPay - (grossPay * 20) / 100;
		} 
		else if (grossPay > 3000 && grossPay <= 4500) {
			netPay = grossPay - (grossPay * 30) / 100;
		} 
		else if (grossPay > 4500 && grossPay <= 6000) {
			netPay = grossPay - (grossPay * 40) / 100;
		} 
		else if (grossPay > 6000) {
			netPay = grossPay - (grossPay * 50) / 100;
		} 
		else {
			netPay = 0;
			System.out.println("Invalid Input Captured!!!!");
		} 
	}
	
	public static void calculateSalary(){
		calculateGrossPay();
		calculateNetPay();
	}
	
	//Module:Display Output
	public static void displayOutput() {
		System.out.println("");
		System.out.println("=============================================");
		System.out.println("Employee Name: "+nameOfEmployee);
		System.out.println("Employee Total Hour : "+numberOfHourWorked);
		System.out.println("Employee Hourly Rate : "+hourlyPayRate);
		System.out.println("Employee Gross Pay :"+ grossPay);
		System.out.println("Employee Net Pay :"+ netPay);
		System.out.println("==============================================");
		
	}
	
	//Module:Exit Program
	public static void exitProgram() {
		System.out.println("");
		System.out.println("");
		System.out.println("Thank You Using Employee Calculator......Bye Bye......");
	}
	
	//Module:Returnable
	public static boolean doYouWantToContinue() {
		String doYouWantToContinue;
		Scanner choiceScanner = new Scanner(System.in);
		
		System.out.println("Do you Want To Continue.....");
		doYouWantToContinue = choiceScanner.nextLine();
		
		if(doYouWantToContinue.equals("yes")){
			return true;
		}
		return false;
				
		
	}
	

	/*
	 * public static void main(String[] args) { wellCome();
	 * 
	 * for (int i=0;i<3;i++) { System.out.println("Employee : " + (i + 1) +
	 * "*******");
	 * 
	 * 
	 * getInput(); calculateSalary(); displayOutput(); if(!doYouWantToContinue()) {
	 * break; } } exitProgram();
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
}
