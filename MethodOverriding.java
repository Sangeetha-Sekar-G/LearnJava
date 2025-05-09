/*
- Runtime Polymorphism
- Dynamic method Dispatch
- achieved by Method Overriding
- In diff class(parent and child), same method name, same parameters
* */
class Class1{
    public void Method(){
        System.out.println("Class1 Method");
    }
}
class Class2 extends Class1{
    public void Method(){
        System.out.println("Class2 Method");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();
        c1.Method();
        c2.Method();
    }
}
