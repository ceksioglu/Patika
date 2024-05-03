package week2;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public void raiseSalary() {
        int currentYear = LocalDate.now().getYear();
        int yearsWorked = currentYear - hireYear;
        double raisePercentage;

        if (yearsWorked < 10) {
            raisePercentage = 0.05;
        } else if (yearsWorked > 10 && yearsWorked < 20) {
            raisePercentage = 0.10;
        } else {
            raisePercentage = 0.15;
        }
        salary += salary * raisePercentage;
    }
    //Hash yerine girilen datayı almak için toString() metodu override edilir:
    @Override
    public String toString() {
        return "Çalışan:" +
                "\nİsim= '" + name + '\'' +
                "\nMaaş= " + salary +
                "\nÇalışma saatleri= " + workHours +
                "\nİşe giriş yılı= " + hireYear;
    }

    public static void main(String[] args) {
        // Örnek kullanım
        Employee employee = new Employee("Can Ekşioğlu", 2500, 45, 2021);
        System.out.println(employee.toString()); // veya sadece System.out.println(employee);
        System.out.println("Vergi: " + employee.tax());
        System.out.println("Bonus: " + employee.bonus());
        employee.raiseSalary();
        System.out.println("Maaş artışı sonrası maaş: " + employee.salary);

    }
}
//Can Ekşioğlu