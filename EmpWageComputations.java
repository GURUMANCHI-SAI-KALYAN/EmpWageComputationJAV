public class EmpWageComputations {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wedge computation");

        final int IS_FULL_TIME = 1;
	final int IS_PART_TIME = 2;
	final int EMP_RATE_HR = 20 ;
	final int NUM_WORKING_DAYS = 20;
	final int MAX_WORKING_HRS = 100;
	int emphr = 0;
	int empwage = 0;
	int totempwage = 0;
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
}
