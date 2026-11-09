
package inheritance;

import java.util.Scanner;

public class EmployeeSalary {

    private String name;
    private float salary;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setsalary(float salary) {
        this.salary = salary;
    }

    public float getsalary() {
        return salary;
    }

    public float getAnnualSalary() {
        return salary * 12;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim();

        if (input.equalsIgnoreCase("Manager")) {

            Manager M = new Manager();

            String details = sc.nextLine();
            String[] arr = details.split(",");

            M.setname(arr[0]);
            M.setsalary(Float.parseFloat(arr[1]));
            M.setbonus(Float.parseFloat(arr[2]));

            float sal = M.getAnnualSalary();

            System.out.printf("Annual Salary of " + input + ": %.2f", sal);

        } else if (input.equalsIgnoreCase("Engineer")) {

            Engineer E = new Engineer();

            String details = sc.nextLine();
            String[] arr = details.split(",");

            E.setname(arr[0]);
            E.setsalary(Float.parseFloat(arr[1]));
            E.setovertime(Float.parseFloat(arr[2]));

            float sal = E.getAnnualSalary();

            System.out.printf("Annual Salary of " + input + ": %.2f", sal);
        }

        sc.close();
    }
}

class Manager extends EmployeeSalary {

    private float bonus;

    public void setbonus(float bonus) {
        this.bonus = bonus;
    }

    public float getbonus() {
        return bonus;
    }

    @Override
    public float getAnnualSalary() {
        return super.getAnnualSalary() + bonus;
    }
}

class Engineer extends EmployeeSalary {

    private float overtime;

    public void setovertime(float overtime) {
        this.overtime = overtime;
    }

    public float getovertime() {
        return overtime;
    }

    @Override
    public float getAnnualSalary() {
        return super.getAnnualSalary() + overtime;
    }
}
