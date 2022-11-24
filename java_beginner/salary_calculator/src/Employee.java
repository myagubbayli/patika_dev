public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double totalTax = 0;
        if (this.salary <= 1000) {
            totalTax = 0;
        } else if (this.salary > 1000) {
            totalTax = this.salary * 0.03;
        }
        return totalTax;
    }

    public double bonus() {
        double bonusSalary = 0;
        if (this.workHours > 40) {
            bonusSalary = (this.workHours - 40) * 30;
        }
        return bonusSalary;
    }

    public double raiseSalary() {
        double yearBonus = 0;
        int yearNow = 2021;
        if (yearNow - this.hireYear <  10) {
            yearBonus = this.salary * 0.05;
        } else if (((yearNow - this.hireYear) > 9) && ((yearNow - this.hireYear) < 20)) {
            yearBonus = this.salary * 0.1;
        } else if (yearNow - this.hireYear > 19) {
            yearBonus = this.salary * 0.15;
        }
        return yearBonus;
    }

    public void toStringg() {
        double salary_with_tax_increase = this.salary + bonus() - tax();
        double total_salary = this.salary + raiseSalary();
        System.out.println("====== Employee information ======");
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Working hours: " + this.workHours);
        System.out.println("Hiring date: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary increase: " + raiseSalary());
        System.out.println("Salary with taxes and increases: " + salary_with_tax_increase);
        System.out.println("Total salary: " + total_salary);
    }


}
