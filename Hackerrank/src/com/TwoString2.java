package com;
import java.util.*;
class GFG {
    public static void twoStr(String s1, String s2){

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n1 = s1.length();
        int n2 = s2.length();
        int arr[] = new int[n1];
        int arr1[] = new int[n2];
        
        for(int i=0; i<s1.length(); i++){            
            arr[i] = (int)s1.charAt(i);
        }        
        
        for(int j=0; j<s2.length(); j++){
            arr1[j] = (int)s2.charAt(j);
        }
        
        Arrays.sort(arr);
        Arrays.sort(arr1);
        
        for(int k=0; k<arr.length; k++){
            if(arr[k] == arr1[k]){
                count++;
            }
        }
        if(count == n1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=0; i<n; i++){
	        String s1 = sc.next();
	        String s2 = sc.next();
	        twoStr(s1, s2);
	    }
	}
}