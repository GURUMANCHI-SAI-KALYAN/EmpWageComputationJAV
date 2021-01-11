public class EmpWageComputations {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wedge computation");

        final int IS_FULL_TIME = 1;
	final int EMP_RATE_HR = 20 ;

	int emphr = 0;
	int empwage = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println(empCheck);

        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present.");
	    emphr = 8;
        } else {
            System.out.println("Employee is Absent.");
	    emphr = 0;
        }
	empwage = emphr * EMP_RATE_HR;
	System.out.println("Employee Wage :" + empwage);
    }
}
