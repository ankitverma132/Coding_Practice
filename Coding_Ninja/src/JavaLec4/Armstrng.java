package JavaLec4;
import java.util.Scanner;
public class Armstrng {	
	public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
                      
            int Sum=0;
            int a;
            int temp=n;
            
            int length=0;
               while(temp>0)
                  {   
            	     temp=temp/10;
                     length++;
                  }
               temp=n;
               while(n>0)  
                  {  
                      a=n%10;
                      int pro=1;
                      for(int i=1;i<=length;i++)
                         {
                            pro=pro*a; 
                         }                     
                      Sum=Sum+pro;
                      n=n/10;                   
                  }  
            if(temp==Sum)  
              System.out.println("true");   
            else  
              System.out.println("false");   
	}
}   