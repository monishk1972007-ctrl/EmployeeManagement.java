package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            // Add Employee
            if (choice == 1) {

                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                Employee employee =
                    new Employee(id, name, department, salary);

                employees.add(employee);

                System.out.println("Employee added successfully!");
            }

            // Search Employee
            else if (choice == 2) {

                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();

                boolean found = false;

                for (Employee employee : employees) {

                    if (employee.getId() == id) {

                        employee.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Employee not found!");
                }
            }

            // Update Employee
            else if (choice == 3) {

                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                boolean found = false;

                for (Employee employee : employees) {

                    if (employee.getId() == id) {

                        System.out.print("Enter New Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter New Department: ");
                        String department = sc.nextLine();

                        System.out.print("Enter New Salary: ");
                        double salary = sc.nextDouble();

                        employee.update(
                            name,
                            department,
                            salary
                        );

                        System.out.println(
                            "Employee updated successfully!"
                        );

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Employee not found!");
                }
            }

            // Display All Employees
            else if (choice == 4) {

                if (employees.isEmpty()) {

                    System.out.println("No employees available.");

                } else {

                    System.out.println("\n===== EMPLOYEE LIST =====");

                    for (Employee employee : employees) {

                        employee.display();

                        System.out.println("----------------------");
                    }
                }
            }

            // Exit
            else if (choice == 5) {

                System.out.println("Thank you!");
                sc.close();
                break;
            }

            else {

                System.out.println("Invalid choice!");
            }
        }
    }
              }
