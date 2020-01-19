package JavaLec3;
import java.util.Scanner;
public class SumOfEvenOdd {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	
	int Sum1=0;
	int Sum2=0;
	while(N>0)		
	{
		int temp= N%10;
		if(temp%2==0) 
		{
		 Sum1=Sum1+temp;
		}
		else
		{
		Sum2=Sum2+temp;
		}
		N=N/10;
	}	
	System.out.println(Sum1 + " " + Sum2);
  }	
}