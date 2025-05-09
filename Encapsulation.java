/*
- To make sure "sensitive" data is hidden from users
- To achieve:
    * Declare class variable/attributes as private
    * Provide public get and set method to access and update the value of a private variable
* */
public class Encapsulation {
    private String var;

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }
}
class Main{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        System.out.println(obj.getVar());
        obj.setVar("Hello World");
        System.out.println(obj.getVar());
    }
}
