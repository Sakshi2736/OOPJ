import java.util.Scanner;

class EmployeeSystem {
    int id;
    String name;
    double salary;

    EmployeeSystem(int id, String name, double salary) { 
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() { //A display() method prints employee details.
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Employees{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Used for user input.
        EmployeeSystem[] employees = new EmployeeSystem[10];  // Creates an array to Store up to 10 employees
        int count = 0; //Keeps track of how many employees are added.


        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Show Employees");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();//reads an integer choice value entered by the user.If the user types 1, then sc.nextInt(); reads 1

            if (choice == 1) {     // if user enter 1 then condition true and entre in if block
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // Consume newline
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                employees[count++] = new EmployeeSystem(id, name, salary);//this is responsible for creating and adding a new employee to the list
                System.out.println("Employee Added!");

            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println("No employees added yet.");
                } else {
                System.out.println("\nEmployee List:");
                for (EmployeeSystem emp : employees) {
                    emp.display();
                }

            } }
                else if (choice == 3) {//If the user enters 3, the loop stops, and the program ends
                break;
            } 
                else {
                System.out.println("Invalid choice, try again!");//f the user enters anything other than 1, 2, or 3, it shows "Invalid choice,try again"
            }
        }
        sc.close();
    }
}
