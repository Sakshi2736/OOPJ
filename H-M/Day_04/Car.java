
class CarTest{
        double fuelInTank;
        double totalKm;
        double efficiency;
        
        CarTest(double efficiency) {
            this.efficiency = efficiency;
        }
        
        void drive(double km) {
            if (fuelInTank > 0) {
                totalKm += km;
                fuelInTank -= km / efficiency;
                System.out.println("Car drove " + km + " km. Remaining fuel: " + fuelInTank + " liters");
            } else {
                System.out.println("Not enough fuel to drive");
            }
        }
        
        void loadGas(double liters) {
            fuelInTank += liters;
            System.out.println("Added " + liters + " liters of gas. Total fuel: " + fuelInTank);
        }
        
        void checkGas() {
            System.out.println("Fuel in tank: " + fuelInTank + " liters");
        }
        
        void checkOdometer() {
            System.out.println("Total km driven: " + totalKm + " km");
        }
    }
     class Car{
    public static void main(String[] args) {
CarTest myCar = new CarTest(15); // Efficiency: 15 km per liter
        myCar.loadGas(10);
        myCar.drive(50);
        myCar.checkGas();
        myCar.checkOdometer();
    }
}