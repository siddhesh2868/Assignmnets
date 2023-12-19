package stack;

public class StudentStack {
	private Student[] arr;
	private int top;
	
	public StudentStack() {
		arr=new Student[3];
		top=-1;
	}
	
	public StudentStack(int s) {
		arr=new Student[s];
		top=-1;
	}
	
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.println();
			System.out.print(arr[i].id+" "+arr[i].name);
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
	
	public void push(Student d) {
		if(isFull()) {
			System.out.println("Stack overflow");
		}
		else{
//			System.out.println("Adding the element");
			top++;
			arr[top]=d;
		}
		
	}
	
	public void pop() {
		
		
		if(isEmpty()) {
			System.out.println("Underflow");
		}
		else {
			//System.out.println(arr[top].id+" "+arr[top].name);
			arr[top]=null;
			top--;
		}
	}
	
	public void peek() {
		
		if(isEmpty()) {
			System.out.println("Underflow");
		}
		else {
			System.out.println(arr[top].id+" "+arr[top].name);
		}
	}
}
