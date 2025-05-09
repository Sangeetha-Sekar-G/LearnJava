/*
- An interface in java is a blueprint of a class, It has static constants and abstract methods
- It is a mechanism to achieve abstraction
- There can be only abstract methods in the java interface , not method body
    Interface methods do not have body - body is provided in the "Implement" class
- Interface methods are by default abstract and Public
- Interface attributes are by default public, static, final
- It is used to achieve abstraction and multiple inheritance in java
    Java does not support multiple inheritance (a class can on;y inherit from one superclass)
   However, it can be achieved with interfaces, because the class can implement multiple interfaces
   Note : To implement multiple interfaces, separate them with a comma ie).Class DemoClass implements Firstinterface, SecondInterface{}
*/

interface InterfaceCls{     //We can't create onj for inteface like abstract class
    public void sound();    // Interface method does not have body
    public void sleep();    // Interface method does not have body
}
class NormalCls implements InterfaceCls{
    public void sound(){ System.out.println("Sound"); }
    public void sleep(){ System.out.println("Sleep"); }
}

public class InterfaceExp{
    public static void main(String[] args) {
        InterfaceCls obj = new NormalCls();
        obj.sound();
        obj.sleep();
    }
}
// Result: Sound Sleep
// if we try to create obj for InterfaceCls => InterfaceCls obj = new InterfaceCls();
// Err- InterfaceCls' is abstract; cannot be instantiated