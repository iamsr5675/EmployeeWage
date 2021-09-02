package com.bridgelabz.FellowshipProgram;

public class EmployeeWage {
		void EmployeeWage1() {	
			int empWagePerHour=50;
			int WorkingHoursPerDay=8;
			int WoringDaysInMonth=20;
			int MonthlySalary=  empWagePerHour*WorkingHoursPerDay*WoringDaysInMonth;
			System.out.println("Monthly salary of employee of comapany A is "+MonthlySalary);
		}	
		void EmployeeWage2() {
			int empWagePerHour=20;
			int WorkingHoursPerDay=5;
			int WoringDaysInMonth=24;
			int MonthlySalary=  empWagePerHour*WorkingHoursPerDay*WoringDaysInMonth;
			System.out.println("Monthly salary of employee of comapany B is "+MonthlySalary);	
			}
		public static void main(String[] args ) {
			   System.out.println("Welcome to Employee Wage Computation");
			   EmployeeWage r =new EmployeeWage();
			   r.EmployeeWage1();
			   r.EmployeeWage2();
			   }
	}