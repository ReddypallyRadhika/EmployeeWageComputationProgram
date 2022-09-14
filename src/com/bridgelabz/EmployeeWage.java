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
	public int computeEmpWage(String Companyname,int Totalworkingdays,int Wageperhr,int Maxworkinghrs) 
	{
	
		
		int TotalEmpHrs =0;
		int Emphrs=0;
		int TotalWorkingDays =0;
		while( TotalEmpHrs <= Maxworkinghrs && TotalWorkingDays <=Totalworkingdays)
		{
			TotalWorkingDays++;
	    int EmpPresent=(int) (Math.floor(Math.random()*10)%3);
		
		switch(EmpPresent)
		{
		case PART_TIME:
		     Emphrs=4;
		     break;
		case FULL_TIME:
			Emphrs=8;
			break;
		default:
			Emphrs=0;
		}
		int DailyEmpWage = Wageperhr*Emphrs;
		TotalEmpHrs+=Emphrs;
		System.out.println("Day#:"+TotalWorkingDays +"Emp hrs:"+Emphrs);
		System.out.println("Daily Employee Wage:"+DailyEmpWage);
		}
		int TotalEmpWage =TotalEmpHrs*Wageperhr;
		System.out.println("Total Employee Wage:"+TotalEmpWage);
		return TotalEmpWage;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Company1");
		EmployeeWage employeeWage1 = new EmployeeWage();
		employeeWage1.computeEmpWage("HP", 25, 20, 30);
		System.out.println("");
		System.out.println("Company2");
		EmployeeWage employeeWage2 = new EmployeeWage();
		employeeWage2.computeEmpWage("Dell", 20, 10, 30);
	}
}