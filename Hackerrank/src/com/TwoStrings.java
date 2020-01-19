package com;
import java.util.Scanner;
class TwoStrings {
    public static void main(String args[] ) throws Exception {
	
// 	Take 2 array list--- put all string values in that array-- if a matches any of b del that in b 	

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        for(int k=0;k<N;k++)
        {
          String a = s.next(); 
          String b = s.next();
          
          
          if(a.length()!=b.length())
          {
        	  System.out.println("NO");
          }
          else
          {
            int c=0;
            boolean f=false;
            for(int i=0;i<a.length();i++)
              {
            	c=0;
                char ch=a.charAt(i);
                for(int j=0;j<b.length();j++)
                   {
                    if(ch==b.charAt(j))
                     {
                        break;
                     }
                    else
                     {
                         c++;
                     }
                   }
                  if(c>=a.length())
                  {
                	 f=true;
               	     System.out.println("NO");
                     break;
                  }
               }
                   { 
            	   if(f==false)
            	   {
            	     System.out.println("YES");
            	   }
                   }             
             }        
        }
    }
}