package Lec9;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int num=53;
		System.out.println(binarySearch(arr,num));
	}
	
public static int binarySearch(int[] arr, int num){
		      
        int start=0;
        int end=arr.length-1;

        int a=0;
        while(start<=end)
        {
        	
        int mid=(start+end)/2;
        
        	 if(num==arr[mid]){
                return mid;
              }
        	 else if(num>arr[mid]){
        		 start=mid+1;
        	 }
        	 else {
        		 end=mid-1;
        	 }
        	 
        }
      return -1;
   }	
}
