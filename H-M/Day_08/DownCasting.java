class Animal{
    void show(){
        System.out.println("Parent class");
    }
}
class Cat extends Animal{
    void show(){
        System.out.println("Child Class");
    }
}

public class DownCasting {
 public static void main(String[] args) {
    /* 
    //Case 1
    Animal a = new Cat();//upcasting
    Cat c = (Cat) a; 
     c.show();//child method

     //Case2:
     Animal a1 = new Animal();
    Cat c1 = (Cat) a1; //downcasting declaration(synatx)
     c1.show();
     */
    Animal a2 = new Cat();// upcasting

    if(a2 instanceof Cat){
        Cat c2 = (Cat) a2;
        c2.show();
    }else{
        System.out.println("Downcasting : Not Possible");
    }

    //case 4
    Animal a3 = new Animal();
    if(a2 instanceof Cat){
        Cat c3 = (Cat) a3;
        c3.show();
    }else{
        System.out.println("Downcasting : Not Possible");
    }
}   
}
