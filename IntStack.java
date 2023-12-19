package stack;

public class IntStack {
	private int []arr;
	private int top=-1;
	
	IntStack(){
		arr=new int[5];
	}
	
	IntStack(int s) {
		arr=new int[s];
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		
		else return false;
	}
	
	public boolean isFull() {
		if(top==arr.length-1){
			return true;
		}
		else return false;
	}
	
	public void push(int d) {
		if(isFull()) {
			System.out.println("Stack overflow");
		}
		else{
			top++;
			arr[top]=d;
		}
		
	}
	
	public int pop() {
		int d=-1;
		if(isEmpty()) {
			System.out.println("Underflow");
		}
		else {
			d=arr[top];
			arr[top]=0;
			top--;
		}
		return d;
	}
	
	public int peek() {
		int d=-1;
		if(isEmpty()) {
			System.out.println("Underflow");
		}
		else {
			d=arr[top];
		}
		return d;
	}
}
