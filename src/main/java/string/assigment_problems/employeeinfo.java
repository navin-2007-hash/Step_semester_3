package string.assigment_problems;

class Employeeinfo {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Employeeinfo(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class employeeinfo {
    public static void main(String[] args) {

        Employeeinfo e1 = new Employeeinfo("Arun", 30000);
        Employeeinfo e2 = new Employeeinfo("Priya", 35000);
        Employeeinfo e3 = new Employeeinfo("Rahul", 40000);

        Employeeinfo.printCompanyInfo();
    }
}
