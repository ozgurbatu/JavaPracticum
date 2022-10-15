import java.util.Scanner;

public class Menu {

    static Scanner scan = new Scanner(System.in);

    public static void menu() {
        System.out.println("***** Salary Calculation *****");

        System.out.print("Enter the name of the worker :");
        String name = scan.next();

        System.out.print("Enter the salary of the worker :");
        double salary = scan.nextDouble();

        System.out.print("Enter the Work Hours of the worker :");
        double workHours = scan.nextDouble();

        System.out.print("Enter the Hired Year of the worker : ");
        int hireyear = scan.nextInt();

        Employee employee = new Employee(name, salary, workHours, hireyear);

        System.out.println(employee);
        nextWorker();

    }

    public static void nextWorker() {
        System.out.println("Do you want to do another calculation? (Y/N) :");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("Y")) {
            menu();
        } else if (answer.equalsIgnoreCase("N")) {
            System.out.println("Good Bye:)");
        } else {
            System.out.println("You entered the wrong letter");
            nextWorker();
        }
    }

}
