package JavaLec4;
import java.util.Scanner;
public class SumOrPro {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int C=sc.nextInt();
        int sum=0;
        int pro=1;
        if(C==1)
        {
            for(int i=1;i<=N;i++)
              { 
                sum=sum+i; 
              }
            System.out.println(sum);
        }
        else if(C==2)
        {
          for(int i=1;i<=N;i++)
          {
              pro=pro*i;
          }
          System.out.println(pro);            
        }
        else
        {
          System.out.println("-1");  
        }
    }
}