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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Wageperhr =20;
		int Fulldayhr =8;
		int DailyEmpWage =0;
		int PartTime =4;
        Random random =new Random();
		int EmpPresent=random.nextInt(0,3);
		
		if(EmpPresent==1)
		{
		System.out.println("Employee full day present");
		DailyEmpWage = Wageperhr*Fulldayhr;
		System.out.println("Daily Employee Wage:"+DailyEmpWage);
		}
		else if(EmpPresent==2)
		{
		System.out.println("Employee half day present");
		DailyEmpWage = Wageperhr*PartTime;
		System.out.println("Daily Employee Wage:"+DailyEmpWage);
		}
		else
		{
		System.out.println("Employee is absent");
	}
	}

}
