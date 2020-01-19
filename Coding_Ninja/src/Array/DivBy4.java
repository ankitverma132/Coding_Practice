package Array;
import java.util.Scanner;

public class DivBy4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		
		for(int i=0;i<N;i++)			
		{
		  arr[i]=sc.nextInt();	
		}
		for(int i=0;i<N;i++)			
		{
		  System.out.print(arr[i] + " ");
		}
		System.out.println();
		 //change(arr);
		//System.out.print(findSum(arr));
		//System.out.print(sum(arr));
		//System.out.println(arrayEquilibrium(arr));
		System.out.println(solve(arr,N));
	}
	public static void change(int arr[])
	{      
        for(int i=0;i<arr.length;i++)
        {
           int a=arr[i]/4;
             if(a==0)
               {arr[i]=-1;}
             else
               {arr[i]=a;}
        }
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i] + " "); 
        }
        System.out.println();
     }
	public static int findSum(int arr[])
	{
        int S=0;
        for(int i=0;i<arr.length;i++)
           {
               if(arr[i]%2==0 || arr[i]%3==0)
                  S=S+arr[i]; 
           }
        return S;
	}
//        int d=0;    
//        for(int i=0;i<arr.length;i++)
//           {
//             int a=arr[i];
//             for(int j=0;j<arr.length;j++)
//                {
//                   if(i==j)
//                     {
//                        break;
//                     }
//                   else
//                     {
//                        if(a==arr[j])
//                          {
//                            break;
//                          }
//                        else
//                          {
//                             d=0;
//                          }
//                       }
//                   }
//             } 
//         return d;
	public static int sum(int arr[])
	{
		int temp =0;
		for(int i = 0; i<arr.length; i++){
             temp = temp + arr[i];  
//             System.out.print(temp);
//             System.out.println();
            } 
		System.out.println(temp);
        while(temp>9)
        {
        	 
           int q=temp;
           int S=0;
           //System.out.print(q);
          // System.out.println();
            while(q>0)
             {
               int a=q%10;
               System.out.println(a);
               S=S+a;
               System.out.println(S);
               q=q/10;
             } 
           temp=S;
        }
        return temp;
	}
	public static void swapAlternate(int[] input){
		if(input.length%2==0){
		int i=0;
        while(i<input.length)
        {
            int temp=input[i];
            input[i]=input[i+1];
            input[i+1]=input[i];
            i=i+2;
        }
        }
        else{
        int j=0;
        while(j<input.length-1)
        {
            int temp=input[j];
            input[j]=input[j+1];
            input[j+1]=input[j];
            j=j+2;
        }
        }
}
	public static int arrayEquilibrium(int[] arr){  
		//write your code here
        int n=arr.length;        
        
        int k=1;
        while(k<n-1)
          {           
             int Sum1=0;
             for(int i=0;i<k;i++)
               {
                Sum1=Sum1+arr[i];               
               }
            System.out.println(Sum1);
              int Sum2=0;
              for(int i=k+1;i<n;i++)
               {
                 Sum2=Sum2+arr[i];                
               }
            System.out.println(Sum2);
                if(Sum1==Sum2)
                  {                    
                     break;
                   }
              k++;  
           } 
        return k;
	}
	 static long solve(int[] A,int n){
		 long Count=0;	
		 for(int i=0;i<n-1;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {  
			       if(A[i]>A[j])
	               {
	                   Count++;
	               }
		        }
	        }
	      return Count;
	    }
	
}