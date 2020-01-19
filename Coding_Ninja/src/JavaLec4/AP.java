package JavaLec4;
import java.util.Scanner;
public class AP {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int val,count=1;
        for(int i=1;i<=Integer.MAX_VALUE;i++)
        {
            val=3*i+2;
            if(val%4!=0 && count<=N)
            {
               System.out.print(val + " ");
                count++;
            }
            if(count>N)
            {
            	break;
            }    
        }
	}
}