// Parent class (Base class)
class Flower {
    String name;
    String color;
    boolean hasFragrance;

    // Constructor
    public Flower(String name, String color, boolean hasFragrance) {
        this.name = name;
        this.color = color;
        this.hasFragrance = hasFragrance;
    }

    // Method to display common flower details
    public void displayDetails() {
        System.out.println("Flower Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Has Fragrance: " + (hasFragrance ? "Yes" : "No"));
    }
}

// Rose class (Child class)
class Rose extends Flower {
    boolean hasThorns;

    // Constructor
    public Rose(String color, boolean hasFragrance, boolean hasThorns) {
        super("Rose", color, hasFragrance); // Call parent class constructor
        this.hasThorns = hasThorns;
    }

    // Method to display Rose details
    public void displayDetails() {
        super.displayDetails(); // Call parent class method
        System.out.println("Has Thorns: " + (hasThorns ? "Yes" : "No"));
    }
}

// Lily class (Child class)
class Lily extends Flower {
    boolean isWaterPlant;

    // Constructor
    public Lily(String color, boolean hasFragrance, boolean isWaterPlant) {
        super("Lily", color, hasFragrance); // Call parent class constructor
        this.isWaterPlant = isWaterPlant;
    }

    // Method to display Lily details
    public void displayDetails() {
        super.displayDetails(); // Call parent class method
        System.out.println("Grows in Water: " + (isWaterPlant ? "Yes" : "No"));
    }
}

// Main class to run the program
public class FlowerDemo {
    public static void main(String[] args) {
        // Creating objects
        Rose rose = new Rose("Red", true, true);
        Lily lily = new Lily("White", true, true);

        // Displaying details
        System.out.println("---- Rose Details ----");
        rose.displayDetails();
        System.out.println();

        System.out.println("---- Lily Details ----");
        lily.displayDetails();
    }
}





/*How This Code Works :
Flower class (Base class)

Stores common properties: name, color, and hasFragrance.
Has a displayDetails() method to print details.
Rose class (Child class)

Inherits from Flower and adds a new property: hasThorns.
Calls the parent class constructor using super().
Overrides displayDetails() to include thorns information.
Lily class (Child class)

Inherits from Flower and adds a new property: isWaterPlant.
Calls the parent class constructor using super().
Overrides displayDetails() to include water plant information.
FlowerDemo class (Main class)

Creates Rose and Lily objects.
Displays their details.
*/