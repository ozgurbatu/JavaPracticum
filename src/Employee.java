public class Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public Employee() {

    }

    public double tax() {


        if (this.salary < 1000.0 && this.salary > 0.0) {
            return 0.0;
        } else if (this.salary >= 1000.0) {
            return this.salary * 0.03;
        } else {
            try {
                throw new Exception("Invalid salary.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public double bonus() {

        if (workHours <= 40 && workHours >= 0) {
            return 0;
        } else if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            try {
                throw new Exception("Invalid work hours");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

    public double raiseSalary(){

        int year=2021-this.hireYear;

        if (year< 10 && year >= 0) {
            return this.salary * 0.05;
        } else if (year >= 10 && year < 20) {
            return this.salary* 0.1;
        } else if (year >= 20) {
            return this.salary * 0.15;
        } else {
            try {
                throw new Exception("Invalid hire year.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String toString() {
        return "Employee Name : " + this.name +
                "\n"+"Salary : " + this.salary +
                "\n"+"Work hours : " + this.workHours +
                "\n"+"Hire Year : " + this.hireYear +
                "\n"+"Tax : " + this.tax() +
                "\n"+"Bonus : " + this.bonus() +
                "\n"+"RaiseSalary : " + this.raiseSalary() +
                "\n"+"Tax and Bonus : " +(this.salary - this.tax() + this.bonus()) +
                "\n"+"Total Salary : " + (this.salary + this.raiseSalary() - this.tax() + this.bonus());
    }


}
