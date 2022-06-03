import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class listExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int x = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            System.out.println("");
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            System.out.print("Name: ");
            String na = sc.next();
            String me = sc.next();
            String name = na + " " + me;
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            Employee employee = new Employee(id, name, salary);

            employees.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");

        int id = sc.nextInt();

        System.out.print("Enter the percentage: ");
        Double perc = sc.nextDouble();

        Employee lucky = employees.stream().filter(p -> p.getId() == id).findFirst().orElse(null);

        if (lucky != null) {

            Double newSalary = lucky.getSalary() * ((100 + perc) / 100);
            lucky.setSalary(newSalary);
            int index = employees.indexOf(lucky);
            employees.remove(index);
            employees.add(index, lucky);
        } else {
            System.out.println("This is not a valid id!");
        }

        System.out.println("");

        System.out.println("List of employees: ");
        for (Employee employee : employees) {
            System.out.println(employee.getId() + ", " + employee.getName() + ", " + employee.getSalary());
        }

        sc.close();
    }
}
