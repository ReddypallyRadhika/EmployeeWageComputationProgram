/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author hp
 *
 */
public class EmployeeWageUc1{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random random =new Random();
		
		int EmpPresent=random.nextInt(0,2);
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
