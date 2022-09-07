/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author hp
 *
 */
public class EmployeeWage {

	public static final int PartTime = 1;
	public static final int FullTime = 2;
	/**
	 * @param args
	 */
	/**UC1
	 * Check Employee is
     *Present or Absent
-    *Use ((RANDOM)) for Attendance Check*/
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Wageperhr =20;
		int Fulldayhr =8;
		int DailyEmpWage =0;
		
		int Emphrs=0;
        Random random =new Random();
		int EmpPresent=random.nextInt(0,3);
		
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
		System.out.println("Daily Employee Wage:"+DailyEmpWage);
		
	
	
	}

}
