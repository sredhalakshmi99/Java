public class Swap
 {
 	public static void main(String[] arg)
 	{
 		int a=10,b=30;
 		System.out.println("a="+a+"\nb="+b);
 		a=a+b;
 		b=a-b;
 		a=a-b;
 		
 		System.out.println("swapped values are a="+a+" and b="+b);
 	}
 }
