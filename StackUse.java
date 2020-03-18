package StackAndQueue;
import java.util.Stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException {

		StackUsingArray stack = new StackUsingArray(3);

		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				// Never Reach Here
			}
		}

		StackUsingLL stackLL = new StackUsingLL();

		for (int i = 1; i <= 5; i++) {
			stackLL.push(i);
		}

		while (!stackLL.isEmpty()) {
			try {
				System.out.println(stackLL.pop());
			} catch (StackEmptyException e) {
				// Never Reach Here
			}
		}
	}

//=================================================================================
	Stack<Integer> stack = new Stack<>(); // stack implemented in java collections

	int arr[] = { 5, 6, 8, 3, 2 };
	{
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
			// System.out.println( stack.peek() ); simmilar to top method just to get top
			// element not to remove
		}
	}
}