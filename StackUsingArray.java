package StackAndQueue;

public class StackUsingArray {

	private int data[];
	private int top;
	
	public StackUsingArray() {
		data = new int[10];
		top = -1;
	}
    public StackUsingArray( int capacity ) {
		data = new int[capacity];
		top = -1;
	}
//=======================================================================================================   
	public boolean isEmpty() {   // time complexity-->O(1)
		return( top == -1 );
	}
//==========================================================================================================	
	public int size() {     // Number of elements        time complexity-->O(1)
		return top+1;
	}
//===========================================================================================================	
	public int top() throws StackEmptyException {       // time complexity-->O(1)
		
		if( size() == 0 ) {
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		else {
			return data[top];
		}
	}
//=============================================================================================================	
	public void push( int elem ) throws StackFullException {        // in best case time complexity-->O(1)
		                                              // in worst case when when capacity has to be doubled--->O(1)
		if( size() == data.length ) {
			
			doubleCapacity();
//			//throw StackFullException
//			StackFullException e = new StackFullException();
//			throw e;
		}
		else {
			top++;
			data[top] = elem;
		}
	}
	
	private void doubleCapacity() {                  
     
		int temp[] = data;
		data = new int[ 2*temp.length ];
		for( int i = 0; i < temp.length; i++ ) {
			data[i] = temp[i];
		}
	}
//====================================================================================================	
	public int pop() throws StackEmptyException {      //time complexity-->O(1)
		if( size() == 0 ) {
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		else {
			int temp = data[top];
			top--;
			return temp;
		}
	}
//======================================================================================================
}