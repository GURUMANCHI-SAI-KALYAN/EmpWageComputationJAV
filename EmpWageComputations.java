public class EmpWageComputation {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageBuilder;

    public EmpWageComputation() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPeronth) {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHr, noOfWorkingDays, maxHrsPeronth);
        numOfCompany++;
    }

    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    public int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        while (totalEmpHrs <= companyEmpWage.maxHrsPeronth && totalWorkingDays < companyEmpWage.noOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + "\tEmp Hr: " + empHrs);
        }
        return totalEmpHrs * companyEmpWage.empRatePerHr;
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to Employee Wedge Builder...");

        EmpWageComputation empWageBuilder = new EmpWageComputations();
        empWageBuilder.addCompanyEmpWage("max", 25, 7, 15);
        empWageBuilder.addCompanyEmpWage("bata", 15, 2, 27);

        empWageBuilder.computeEmpWage();

    }
}

