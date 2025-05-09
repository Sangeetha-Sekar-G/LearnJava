/*
- Compile time Polymorphism
- static Polymorphism
- achieved by function overloading or operator overloading
- In same class, same method name, diff parameter
* */
class Method{
    public int Overload(int a, int b){
        int ans = a + b;
        return ans;
    }
    public float Overload(float a, float b){
        float ans = a + b;
        return ans;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Method m = new Method();
        System.out.println(m.Overload(1, 2));
        System.out.println(m.Overload(1.1f, 2.2f));
    }
}
