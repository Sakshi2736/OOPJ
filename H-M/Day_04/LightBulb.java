class LightBulbTest {
    boolean isOn;
    
    void switchOn() {
        isOn = true;
        System.out.println("LightBulb is switched ON");
    }
    
    void switchOff() {
        isOn = false;
        System.out.println("LightBulb is switched OFF");
    }
    
    /*void checkStatus() {
        System.out.println("LightBulb is " + (isOn ? "ON" : "OFF"));
    }*/
}

class LightBulb{ 
    
    public static void main(String[] args) {
        LightBulbTest bulb = new LightBulbTest();
        bulb.switchOn();
       // bulb.checkStatus();
        bulb.switchOff();
        //bulb.checkStatus();
    }}
