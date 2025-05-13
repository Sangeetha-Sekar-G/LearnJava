//String basically immutable. To make it mutable -> StringBuffer and StringBuilder Diff is Threadsafe and Not threadsafe


class Demo {
	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer("Navin");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
		sb.append("Reddy");
		System.out.println(sb);
		
//		String str=sb.toString();
		
//		sb.deleteCharAt(2);
//		sb.insert(0,"Java");
//		sb.insert(6,"java");
//		sb.setLength(30);
		sb.ensureCapacity(100);
		
		System.out.println(sb);
	
	}
}


// Mutable vs Immutable string.java

// public class Demo {
// 	public static void main(String[] args) 
// 	{
// 		String name="navin";
// 		name=name+"reddy";
// 		System.out.println("hello"+name);
		
// 		String s1="Navin";
// 		String s2="Navin";
		
// 		System.out.println(s1==s2);	
		
// 	}
// }
