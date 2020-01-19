package com;
import java.util.Scanner;
class IndianArmy
{
    public static void main(String args[])
    {      
        Scanner scan = new Scanner(System.in);       
        String s = scan.nextLine();
        int  n = scan.nextInt();
        
        for(int i = 0 ; i < s.length(); i++)
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90) 
            	System.out.print((char)((s.charAt(i) - 65 + n) % 26 + 65));
        
            else if(s.charAt(i) >= 97 && s.charAt(i) <= 122)
            	System.out.print((char)((s.charAt(i) - 97 + n) % 26 + 97));
        
            else if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
            	System.out.print((char)((s.charAt(i) - 48 + n) % 10 + 48));
        
            else 
            	System.out.print(s.charAt(i));
            
        scan.close();
    }
}