package string.assigment_problems;

import java.util.Scanner;

abstract class employe_e {
    protected String name;
    protected double salary;

     employe_e(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double getBonus();
}

class FullTime extends employe_e {
    FullTime(String name, double salary) {
        super(name, salary);
    }

    double getBonus() {
        return salary * 0.10;
    }
}

class PartTime extends employe_e {
    PartTime(String name, double salary) {
        super(name, salary);
    }

    double getBonus() {
        return salary * 0.05;
    }
}

class Intern extends employe_e {
    Intern(String name, double salary) {
        super(name, salary);
    }

    double getBonus() {
        return 2000;
    }
}

public class FestivalBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            employe_e employee;

            if (type.equals("FULLTIME")) {
                employee = new FullTime(name, salary);
            } else if (type.equals("PARTTIME")) {
                employee = new PartTime(name, salary);
            } else {
                employee = new Intern(name, salary);
            }

            double bonus = employee.getBonus();
            total += bonus;

            System.out.printf("%s: %.2f%n", name, bonus);
        }

        System.out.printf("Total Bonus: %.2f%n", total);
    }
}
