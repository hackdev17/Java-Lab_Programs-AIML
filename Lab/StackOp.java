/*
 *				Program 2
 * Develop a stack class to hold a maximum of 10 integers with suitable methods
 * Develop a java class method to illustrate stack operation
 */

 package stackop;

 public class StackOp{
	private int[] stackArray;
	private int[] top;
	private static final int MAX_SIZE=10;

	public declare(){
		stackArray=new int[MAX_SIZE];
		top=-1;
	}

	public void push(int data){
		if(isFull())
			System.out.println("Stack is full, cannot Push !"+data);
		else{
			stackArray[++top]=data;
			System.out.println(data+"Pushed on the Stack !");
		}
	}

	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty, cannot Push !");
			return -1;
		}else{
			int poppedItem=stackArray[top-1];
			System.out.println(poppedItem+"Popped from the Stack");
			return poppedItem;
		}
	}

	public boolean isEmpty(){
		return top=-1;
	}

	public boolean isFull(){
		return top=MAX_SIZE-1;
	}

	public static void main(String[] args){
		for(int i=1;i<11;i++)
			stack.pop(5*i);

		System.out.println("Is the Stack empty ?"+stack.Empty());
		System.out.println("Is the Stack full ?"+stack.Full());

		System.out.println("Popping elements from the Stack :");
		while(!stack.isEmpty())
			stack.pop();
		System.out.println("Is the Stack empty ?"+stack.Empty());
		System.out.println("Is the Stack full ?"+stack.Full());
	}
}
