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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random random =new Random();
		int EmpPresent=random.nextInt(0,3);
		if(EmpPresent==1)
		{
		System.out.println("Employee is present");
		}
		else
		{
		System.out.println("Employee is absent");
	}
	}

}
