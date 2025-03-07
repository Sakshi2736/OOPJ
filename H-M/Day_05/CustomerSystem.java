import java.util.Scanner;

class Customer {
    int id;
    String name;

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class CustomerSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer[] customers = new Customer[10];  // Store up to 10 customers
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Customer");
            System.out.println("2. Show Customers");
            System.out.println("3. Delete Customer");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();//reads an integer choice value entered by the user.If the user types 1, then sc.nextInt(); reads 1

            if (choice == 1) { // if user enter 1 then condition true and entre in if block
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // Consume newline
                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                customers[count++] = new Customer(id, name);//this is responsible for creating and adding a new employee to the list
                System.out.println("Customer Added!");

            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println(" No customers available!");
                } else {
                System.out.println("\nCustomer List:");
                for (int i = 0; i < count; i++) {
                    customers[i].display();
                }
            }
            } else if (choice == 3) {//If the user chooses option 3, the program will ask for a Customer ID to delete.
                System.out.print("Enter Customer ID to delete: ");
                int idToDelete = sc.nextInt();//The variable idToDelete stores the ID input from the user.
                boolean found = false;// It is used to search whether the customer is found in the array.


                for (int i = 0; i < count; i++) {//This loop runs through the customer array (customers[i]).
                    if (customers[i].id == idToDelete) {//t checks each customer's id to see if it matches idToDelete.
                                                        //If a match is found:The program needs to delete this customer.
                        
                         for (int j = i; j < count - 1; j++) { //Once a match is found at index i, we need to remove that customer.
                        customers[j] = customers[j + 1]; //than shift all elements after i one position to the left
                        }
                        count--;       // Reduce count after deletion
                        found = true;//If found = true;The elements are shifted left to remove the customer.
                        System.out.println("Customer Deleted!");
                        break;       // Exit loop after deleting
                    }
                }

                if (!found) {//After the loop if found is still false, it prints "Customer Not Found!".
                    System.out.println("Customer Not Found!");
                }

            } else if (choice == 4) {//If the user enters 4, the loop stops, and the program ends
                break; 
            } else {
                System.out.println("Invalid choice, try again!");//f the user enters anything other than 1, 2,3 or 4, it shows "Invalid choice,try again"
            }
        }
        sc.close();
    }
}

