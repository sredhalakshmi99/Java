import java.util.Scanner;
public class Sum{
	public static void main(String args[]){
		int sum_of_odd=0;
		int sum_of_even=0;
		Scanner usr= new Scanner(System.in);
		System.out.print("Enter the limit : ");
		int limit=usr.nextInt();
		for(int i=0;i<=limit;i++)
		{
			
			if (i%2==0)
			{
				sum_of_even+=i;
			}
			else
			{
				sum_of_odd+=i;
			}
		}
		System.out.print("sum of even numbers upto the range : " + sum_of_even+"\n");
		System.out.print("sum of even numbers upto the range : " + sum_of_odd+"\n");
	}
}
