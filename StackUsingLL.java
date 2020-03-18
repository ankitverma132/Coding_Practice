package StackAndQueue;

public class StackUsingLL<T> {
	
    private Node<T> head;
    private int size;
	
	public StackUsingLL() {
      head = null;
      size = 0;
	}
	
	public int size() {     //time complexity--->O(1)
      return size;
	}
	
	public void push(T data) {     //time complexity--->O(1)
       Node<T> newNode = new Node<>(data);    // Making new node with data
        if( head == null ){
            head = newNode;
            head.next = null;
        }
        else{
            newNode.next = head;
            head = newNode;            
        }    
        size++;
	}
	
	public boolean isEmpty() {        //time complexity--->O(1)
     return (size == 0);
//          return true;
//      else
//          return false;
	}
	
	public T pop() throws StackEmptyException {        //time complexity--->O(1)
        if( size == 0){
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        else{
            T temp = head.data;
            head = head.next;
            size--;
            return temp;
        }
	}
	
	public T top() throws StackEmptyException {        //time complexity--->O(1)
        if( size == 0){
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        else{
           return head.data; 
        }
	}
}