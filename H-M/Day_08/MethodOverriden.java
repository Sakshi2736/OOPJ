/*class Parent{
    void show(){
        System.out.println("Parent Method:P1");
    }
}

class Child extends Parent{
    void show(){
     super.show(); // parent class method call
        System.out.println("Child Method:C1");
    }
} 
class MethodOverriden{
    public static void main(String[] args) {
        Parent p = new Parent(); //parent class obj p reference created
    p.show();
    
    Child c = new Child(); // child class obj c referenc created
    c.show();
}}



// call instant var of parent class by using super keyword
class Parent{
    int i = 100;
    void show(){
        System.out.println("Parent Method:P1");
    }
}
class Child extends Parent{
    int num = 50;
    int i =40 ;
    void show(){
     super.show(); // parent class method call
        System.out.println("Child Method:C1");
    }
    void display(){
        System.out.println(num);
        System.out.println(i);// preference child class
        System.out.println(super.i);// it print parent class i valeu that is 100
    }
} 
class MethodOverriden{
    public static void main(String[] args) {
        Parent p = new Parent(); //parent class obj p reference created
    p.show();// call the show mehtod inside the parent class and then print sop statement
    
    Child c = new Child(); // child class obj c referenc created
    c.show();// call the show method inside the child class and print sop statement
c.display(); // call the display methos inside the chiled method and print values
}}



//Constructor override/inherite(default constructor in child)
class Parent{
    Parent(String name){
        System.out.println("Parent Constructor: P1 :" +name);
   }
}

class Child extends Parent{//child class inherit parent class fileds,constructor,methods
    Child(String name){
        super(name);  // (optional) 
        System.out.println("Chiild constructor: C1 :" +name);//it print values assign in condtrucotr calls
    }
} 
class MethodOverriden{
    public static void main(String[] args) {
        Parent p = new Parent("Siya"); //parent class obj p reference created.
    
    //Child c = new Child();it give error beacuase it is not declare in child class.(check default constructor)
    Child c1 = new Child("Diya"); // child class obj c referenc created.(check parameterized constructor )
}}
//Error - constructor child in class Parent cannot be applied to given types;



// default constructor in parent class
class Parent{
    Parent(String name){
        System.out.println("Parent Constructor: P1 :" +name);
   }
}

class Child extends Parent{//child class inherit parent class fileds,constructor,methods
    Child(String name){
        super(name);  // (optional) 
        System.out.println("Chiild constructor: C1 :" +name);//it print values assign in condtrucotr calls
    }
} 
class MethodOverriden{
    public static void main(String[] args) {
        Parent p = new Parent("Siya"); //parent class obj p reference created.
    Parent p1 = new Parent(); //it give error beacuase it is not declare in child class.(check default constructor)
    
    Child c1 = new Child("Diya"); // child class obj c referenc created.(check parameterized constructor )
}}
//Error - constructor Parent in class Parent cannot be applied to given types;
   */ 


// default constructor in parent class and child class
class Parent{
    Parent(){
    System.out.println("Default Constructor:Parent");
    }
    Parent(String name){
        System.out.println("Parent Parameterized: P1 :" +name);
   }
}

class Child extends Parent{//child class inherit parent class fileds,constructor,methods
   Child(){
    System.out.println("Default constructor:Child");
   }
   
    Child(String name){
        super(name);  // (optional) 
        System.out.println("Child Parameterized: C1 :" +name);//it print values assign in condtrucotr calls
    }
} 
class MethodOverriden{
    public static void main(String[] args) {
    //Parent p = new Parent(); 
    //Parent p1 = new Parent("Siya"); //parent class obj p reference created.
    Child c = new Child();;
    Child c1 = new Child("Diya"); // child class obj c referenc created.(check parameterized constructor )
}}