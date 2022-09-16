/**
 * 
 */
package com.bridgelabz;

/**
 * @author hp
 *
 */
public class CompanyEmpWage  {

	/**
	 * @param args
	 */
	private final String companyName;
	private final int workingDays;
	private final int wagePerHr;
	private final int maxWorkingHrs;
	private int totalEmpWage;
	public CompanyEmpWage(String companyName,int workingDays,int wagePerHr,int maxWorkingHrs) 
	{
		this.companyName  =companyName;
		this.workingDays =workingDays;
		this.wagePerHr = wagePerHr;
		this.maxWorkingHrs = maxWorkingHrs;
		
	}
	public void  setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage =totalEmpWage;
	}
	
	public String toString()
	{
		return "Total Employee Wage for Company:"+companyName+"is:"+totalEmpWage;
	}
	
}
