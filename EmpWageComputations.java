public class EmpWageComputations {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wedge computation");

        final int IS_FULL_TIME = 1;

        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println(empCheck);

        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present.");
        } else {
            System.out.println("Employee is Absent.");
        }
    }
}
