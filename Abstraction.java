/*
- Data Abstraction is the process of hiding certain details and showing only essential info to the user
- To achieve:
    * with either Abstract class or Interface
- Abstract class can have Abstract method/ normal method also

* */
abstract class AbstractClass {        // Abstract class, we can't create onj for this class(to access it, it must be inherit from another class)
    String clsName = "Abstract Class";
    abstract void abstractMethod();     // Abstract method, it does not have a body, body provided by subclass(inherit from)
}
class NormalClass extends AbstractClass {   // Normal class which has implementation of Abstract class
    String clsName1 = "Normal Class";
    void abstractMethod() {
        System.out.println("Abstract Method");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        NormalClass nc = new NormalClass();
        System.out.println(nc.clsName1);
        System.out.println(nc.clsName);
        nc.abstractMethod();
    }
}
