

class Parent{
    int x = 12;
}
class Child extends Parent{
    int y = 7;
}
class SingleInheritance{
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.x);   
        //System.out.println(p.y);//error: cannot find symbole(it is belong to child class)
        Child c = new Child();
        System.out.println(c.x);   
         System.out.println(c.y); 
        
         Parent P1 = new Child();
         System.out.println(P1.x);
        //System.out.println(P1.y);// error: cannot find symbol
}
}