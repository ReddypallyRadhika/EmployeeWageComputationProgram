/**
 * 
 */
package com.bridgelabz;


/**
 * @author hp
 *
 */
public class EmployeeWage {

	public static final int PartTime = 1;
	public static final int FullTime = 2;
	public static final int Wageperhr =20;
	public static final int WorkingDays =2;
	public static final int Maxhrinmonth =10;
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
	/*UC6
	 * Calculate Wages till a condition of total working hours or days is 
	 * reached for a month - Assume 100 hours and 20 days
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int DailyEmpWage =0;
		int Emphrs=0;
		int TotalEmphrs=0;
		int TotalWorkingDays =0;
		
		while(TotalEmphrs<=Maxhrinmonth && TotalWorkingDays<WorkingDays)
		{
			TotalWorkingDays++;
		int EmpPresent=(int) (Math.floor(Math.random()*10)%3);
		
		switch(EmpPresent)
		{
		case PartTime:
		     Emphrs=4;
		     break;
		case FullTime:
			Emphrs=8;
			break;
		default:
			Emphrs=0;
		}
		TotalEmphrs+=Emphrs;
		System.out.println("Day#:"+TotalWorkingDays +"Emp hrs:"+Emphrs);
		
		}
		int TotalEmpWage =TotalEmphrs*Wageperhr;
		System.out.println("Total Employee Wage:"+TotalEmpWage);
	}

}
