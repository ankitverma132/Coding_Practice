package com;
import java.util.Scanner;
public class Elephant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Steps;
        if(N%5==0)
        {
        	Steps=N/5;
        }
        else
        {
        	Steps=N/5+1;
        }
        System.out.println(Steps);
	}

}
