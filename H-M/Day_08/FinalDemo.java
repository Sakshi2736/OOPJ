// final variable :
 
public class FinalDemo {
    final int SPEED_LIMIT = 100;//declareation of final var inside class but ouside method

    void display(){
        System.out.println(SPEED_LIMIT);
    }
    public static void main(String[] args) {
        FinalDemo f = new FinalDemo();
        f.display();
    }
}



// final variable :
public class FinalDemo {
    final int SPEED_LIMIT = 100;//declareation of final var inside class but ouside method
     FinalDemo(int speed){

     }
    void display(){
        System.out.println(SPEED_LIMIT);
    }
    public static void main(String[] args) {
        FinalDemo f = new FinalDemo();
        f.display();
    }
}
error: constructor FinalDemo in class FinalDemo cannot be applied to given types;




// final and static keyword work together
public class FinalDemo {
    final static int SPEED_LIMIT = 100;//declareation of final var inside class but ouside method
     
    void display(){
        System.out.println(SPEED_LIMIT);
    }
    public static void main(String[] args) {
        FinalDemo f = new FinalDemo();
        f.display();
    }
}


// we cannot reassign value after initailized
public class FinalDemo {
    final static int SPEED_LIMIT = 100;//declareation of final var inside class but ouside method
     
    void display(){
        SPEED_LIMIT = 120;
        System.out.println(SPEED_LIMIT);
    }
    public static void main(String[] args) {
        FinalDemo f = new FinalDemo();
        f.display();
    }
}
//error: cannot assign a value to final variable SPEED_LIMIT
//SPEED_LIMIT = 120;



// final keyword with 2 class




// final in method cannot override
class Parent{
    final void display(){
        System.out.println("Final Method :: Parent");
    }
}
class Child extends Parent{
void display(){// here we change signature than this method excute (void display1)
    System.out.println("Final Method :: Child");
}
}
    class FinalDemo{
    public static void main(String[] args) {
       //Parent p = new Parent();
        //p.display();//error: display() in Child cannot override display() in Parent
    
    Child c = new Child();
    c.display();//error: display() in Child cannot override display() in Parent
    }
}




// in final -fina class cannot inherite
class Parent{
    final void display(){
        System.out.println("Final Method :: Parent");
    }
}
class Child extends Parent{

}
    class FinalDemo{
    public static void main(String[] args) {
       Child c = new Child();
       c.display();
    }
}




// we can make referance as a final
class Parent{
    final void display(){
        System.out.println("Final Method :: Parent");
    }
}
class Child extends Parent{

}
    class FinalDemo{
    public static void main(String[] args) {
       
    
     final Child c = new Child();
         c.display();
    }
}




//Immutable Referance-in that reference (memory add) cannot change but stored element change.(object values change)
class FinalDemo{
    public static void main(String[] args) {
         final StringBuilder sb = new StringBuilder("CDAC");//original object value
         System.out.println(sb);
         sb.append("JUHU-Kharghar");//here the object value
         System.out.println(sb);

        // sb = new StringBuilder("Hello");// error: cannot assign a value to final variable sb(reference)
       // sb = new StringBuilder("DAC");// cannot assign a value to final variable sb
       sb.append("\nKharghar");// we can append  value multiple times
       System.out.println(sb);
    }
}s


//make a constructor as a final
class A{
final A(){//error: modifier final not allowed here of constructor

    }
}
class FinalDemo{
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println("PG-DAC");
    }
}