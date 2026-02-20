import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		int fact=1;
		System.out.print("enter the number to find the factorial : ");
		Scanner usr=new Scanner(System.in);
		int num=usr.nextInt();
		
		for (int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial of "+num+" is "+fact+"\n");
	}
}
