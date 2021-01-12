package com.javaprograms;
import java.util.Random;
  public class EmpWageComputations {

        public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;


	private final String company;
	private final int EMP_RATE_HR;
	private final int NUM_WORKING_DAYS;
	private final int MAX_WORKING_HRS;
	private int totempwage;

	public EmpWageComputations(String company, int EMP_RATE_HR, int NUM_WORKING_DAYS, int MAX_WORKING_HRS) {

	this.company = company;
	this.EMP_RATE_HR = EMP_RATE_HR;
	this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
	this.MAX_WORKING_HRS = MAX_WORKING_HRS;
  }
	public void computeEmpWage() {
	int emphr = 0;
	int empwage = 0;
	int totworkingdays = 0;
	int totemphrs = 0;

	while (totemphrs <= MAX_WORKING_HRS && totworkingdays < NUM_WORKING_DAYS) {
	totworkingdays++;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

	switch (empCheck) {
             case IS_FULL_TIME:
	          System.out.println("Employee is Present.");
	          emphr = 8;
	          break;
	     case IS_PART_TIME:
            	  System.out.println("Employee is Present.");
                  emphr = 4;
		  break;
             default:
           	   System.out.println("Employee is Absent.");
	    	   emphr = 0;
           	   break;
       }
	totemphrs += emphr;
	 System.out.println("totla days :" + totworkingdays);
	 System.out.println("Employee hrs :" + totemphrs);

    }
	totempwage = totemphrs * EMP_RATE_HR;
	System.out.println("Employee Wage :" + totempwage);
  }
	@Override
	public String toString() {
	    return "Total Emp wage for Company: " +company+" is: " + totempwage;
	}

	public static void main(String[] args) {
	EmpWageComputations max = new EmpWageComputations("max", 20, 5, 10);
	EmpWageComputations bata = new EmpWageComputations("bata", 20, 5, 10);
	max.computeEmpWage();
	System.out.println(max);
	bata.computeEmpWage();
        System.out.println(bata);
    }

}
