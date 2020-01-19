package JavaLec4;
import java.util.ArrayList;
import java.util.Scanner;
public class CheckSeq {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> c = new ArrayList<Integer>();        
     
        for(int i=1;i<=N;i++)
        {           
            int input = sc.nextInt();
            c.add(input);
        }  
        
        boolean flag=true;
        boolean f=true;
        int i=0;
        if(c.get(0)>c.get(1))
        {
        for(i=0;i<c.size()-1;i++)
        {       	
           if(c.get(i)>c.get(i+1) && f==true)
           {
               continue;
           }
           else if(c.get(i)<c.get(i+1))
           { 
        	   f=false;
               continue;
           }
           else
           {
              flag=false; 
           }            
        }  
        System.out.print(flag);
        }
        else
        {
        for(i=0;i<c.size()-1;i++)
        {       	
           if(c.get(i)<c.get(i+1) && f==true)
           {
               continue;
           }
           else if(c.get(i)>c.get(i+1))
           { 
        	   f=false;
               continue;
           }
           else
           {
              flag=false; 
           }            
        }  
        System.out.print(flag);
        }
	}
}