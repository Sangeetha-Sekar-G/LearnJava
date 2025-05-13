@FunctionalInterface
interface A
{
//	void show();
	void show(int i);
//	void show(int i,int j);
	

}


public class Demo {
    public static void main(String[] args) {
    	
 //   	A obj=() -> System.out.println("in Show");  
 //   	obj.show();
    	
//    	A obj=new A()
//    	{
//    		public void show(int i)
//    		{
//    			System.out.println("in show"+i);
//    		}
//    	};
//    	obj.show(5);
    	
//    	A obj=(int i) ->System.out.println("in show "+i);
//    	obj.show(5);
    	
//    	A obj=(int i,int j) ->System.out.println("in show "+i);
//    	obj.show(5,8);
    	
    	A obj=i -> System.out.println("in show "+i);
    	obj.show(5);
    }
}


//Lambda Expression with return statement.java
/*@FunctionalInterface
interface A
{
	int add(int i, int j);
}


public class Demo {
    public static void main(String[] args) {
//    	
//   	A obj=new A()
//   	{
//   		public int add(int i, int j)
//   		{
//   			return i+j;
//   		}
//   	};
    	
    	A obj=(i,j) -> i+j;
   	
   	int result=obj.add(5, 4);
   	System.out.println(result);
    }
}
*/


