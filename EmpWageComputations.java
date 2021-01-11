public class EmpWageComputations {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wedge computation");

        final int IS_FULL_TIME = 1;
	final int IS_PART_TIME = 2;
	final int EMP_RATE_HR = 20 ;
	final int NUM_WORKING_DAYS = 20;

	int emphr = 0;
	int empwage = 0;
	int totempwage = 0;
	for (int num = 0; num < NUM_WORKING_DAYS; num++) {
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
	empwage = emphr * EMP_RATE_HR;
	totempwage += empwage;
    }
	System.out.println("Employee Wage :" + totempwage);

  }

}
