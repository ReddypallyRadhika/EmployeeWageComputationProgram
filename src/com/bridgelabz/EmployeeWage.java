/**
 * 
 */
package com.bridgelabz;

import java.util.Random;
import java.util.random.RandomGenerator;

/**
 * @author hp
 *
 */
public class EmployeeWage {

	public static final int PartTime = 1;
	public static final int FullTime = 2;
	public static final int Wageperhr =20;
	public static final int WorkingDays =2;
	/**
	 * @param args
	 */
	/**UC1
	 * Check Employee is
     *Present or Absent
-    *Use ((RANDOM)) for Attendance Check*/
	private static RandomGenerator random;
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Wageperhr =20;
		int Fulldayhr =8;
		int DailyEmpWage =0;
		int TotalEmpWage =0;
		int Emphrs=0;
		if( int day = 0; day< WorkingDays ; day++)
		{
       // Random random =new Random();
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
		DailyEmpWage = Wageperhr*Emphrs;
		TotalEmpWage +=DailyEmpWage;
		System.out.println("Daily Employee Wage:"+DailyEmpWage);
		
		}
		System.out.println("Daily Employee Wage:"+TotalEmpWage);
	}

}
