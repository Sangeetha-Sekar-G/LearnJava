/*
- Here, one class is allowed to inherit the feature(fields and methods) of another class
- Keyword - extends
- is-a relationship
- Parent <- Inheritance
* */
class Parent{
    double salary = 50000;
}
public class Inheritance extends Parent{
    double bonus = 20000;

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        System.out.println("Salary from parent class: " + obj.salary);
        System.out.println("Bonus from Inheritance class: " + obj.bonus);
    }
}


/*
Multiple inheritance is not supported in java
class A{
void msg(){System.out.println("Hello!");}
}
class B{
void msg(){System.out.println("Welcome!");}
}
class C extends A,B{ // suppose if it were

 public static void main(String[] args) {
 C obj = new C();
 obj.msg(); // now which msg() would be invoked?? // Compile time error
 }
* */