// Abstract class Vehicle
abstract class Vehicle {
    // Abstract method (to be extended by subclasses)
    abstract void show();

    // Normal method
    void display() {
        System.out.println("This is a vehicle");
    }
}

// Subclass Bike that extends Vehicle
class Bike extends Vehicle {
    
    
    void show() {
        System.out.println("Bike's Extended that abstract method");
    }

    // Static method
    static void average() {
        System.out.println("Average speed of bike is 45 km/hr");
    }

    // Normal method
    void showBike() {
        System.out.println("This is a bike");
    }
}

// Driver class
public class AbstractionDemo {
    public static void main(String[] args) {
        // Creating an instance of Bike
        Bike myBike = new Bike();
        
        // call  show() method inside the 
        myBike.show();
        
        // Calling normal method from Vehicle
        myBike.display();
        
        // Calling normal method from Bike
        myBike.showBike();
        
        // Calling static method from Bike
        Bike.average();
    }
}
