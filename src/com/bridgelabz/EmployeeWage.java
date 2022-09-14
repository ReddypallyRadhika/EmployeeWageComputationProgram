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
	public static final int WAGE_PER_HR =20;
	public static final int WORKING_DAYS =2;
	public static final int MAX_WORKING_HRS =100;
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
	public static int computeEmpWage() 
	{
	
		
		int TotalEmpHrs =0;
		int Emphrs=0;
		int TotalWorkingDays =0;
		while( TotalEmpHrs <= MAX_WORKING_HRS && TotalWorkingDays <=WORKING_DAYS)
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
		TotalEmpHrs+=Emphrs;
		System.out.println("Day#:"+TotalWorkingDays +"Emp hrs:"+Emphrs);
		}
		int TotalEmpWage =TotalEmpHrs*WAGE_PER_HR;
		System.out.println("Total Employee Wage:"+TotalEmpWage);
		return TotalEmpWage;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computeEmpWage();
	}
}