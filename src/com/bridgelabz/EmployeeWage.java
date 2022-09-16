/**
 * 
 */
package com.bridgelabz;


/**
 * @author hp
 *
 */
public class EmployeeWage {

	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	
	private final String companyName;
	private final int workingDays;
	private final int wagePerHr;
	private final int maxWorkingHrs;
	private int totalEmpWage;
	/**
	 * @param args
	 */
	/**UC1
	 * Check Employee is
     *Present or Absent
-    *Use ((RANDOM)) for Attendance Check*/
	//private static RandomGenerator random;
	
	/*
	 * UC2
	 * Calculate Daily Employee Wage
     *Assume Wage per hour is 20
     *Assume full day hr is 8
	 */
	
	/*UC3
	*Add Part time Employee & Wage
    *- Assume Part time Hour is 4
    **/
	/*
	 * UC4
	 * Solving using Case Statement
	 */
	/*
	 * UC5
	 * Calculating Wages for a Month assuming 20 Working Days in a Month
	 */
	/*
	 * UC6
	 * Calculate Wages till a condition of total working hours or days
	 *  is reached for a month 
	 *  - Assume 100 hours and 20 days
	 */
	/*UC7
	 * Refactor the Code to write a Class Method to Compute Employee Wage
	 * 
	 */
	/*
	 * UC8
	 * Compute Employee Wage for multiple companies 
	 * - Note: Each Company has its own wage, number of working days and working hours per month
	 * - Use Class Method with function parameters instead of Class Variables
	 */
	
	public EmployeeWage(String companyName,int workingDays,int wagePerHr,int maxWorkingHrs) 
	{
		this.companyName  =companyName;
		this.workingDays =workingDays;
		this.wagePerHr = wagePerHr;
		this.maxWorkingHrs = maxWorkingHrs;
		
	}
	public int computeEmpWage()
	
	{
		int totalEmpHrs =0;
		int empHrs=0;
		int totalWorkingDays =0;
		while( totalEmpHrs <= maxWorkingHrs && totalWorkingDays <=workingDays)
		{
			totalWorkingDays++;
	    int EmpPresent=(int) (Math.floor(Math.random()*10)%3);
		
		switch(EmpPresent)
		{
		case PART_TIME:
		     empHrs=4;
		     break;
		case FULL_TIME:
			empHrs=8;
			break;
		default:
			empHrs=0;
		}
		int DailyEmpWage = wagePerHr*empHrs;
		totalEmpHrs+=empHrs;
		System.out.println("Day#:"+totalWorkingDays +"Emp hrs:"+empHrs);
		System.out.println("Daily Employee Wage:"+DailyEmpWage);
		}
		int totalEmpWage =totalEmpHrs*wagePerHr;
		System.out.println("Total Employee Wage:"+totalEmpWage);
		return totalEmpWage;
	}
	public String toString()
	{
		return "Total Employee Wage for Company:"+companyName+"is:"+totalEmpWage;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HP");
		EmployeeWage employeeWage1 = new EmployeeWage("HP", 25, 20, 30);
		employeeWage1.computeEmpWage();
		System.out.println("");
		System.out.println("DELL");
		EmployeeWage employeeWage2 = new EmployeeWage("Dell", 20, 10, 30);
		employeeWage2.computeEmpWage();
		employeeWage2.toString();
	}
}