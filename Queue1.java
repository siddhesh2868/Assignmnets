package queue;

public class Queue1 {
	private int[] arr;
	private int front=0;
	private int rear=-1;
	
	Queue1(){
		arr=new int[5];
	}
	Queue1(int s) {
		arr=new int[s];
	}
	
	public boolean isEmpty() {
		if(front-rear==1) {
			return true;
		}
		else return false;
	}
	
	public boolean isFull() {
		if(rear==arr.length-1) return true;
		else return false;
	}
	
	public void enQueue(int q) {
		if(isFull()) {
			System.out.println("Overflow");
		}
		else {
			rear++;
			arr[rear]=q;
		}
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Underflow");
		}
		else {
			arr[front]=0;
			front++;
		}
	}
	
	public int peek() {
		int d=-1;
		if(isEmpty()) {
			System.out.println("Underflow");
		}
		else {
			d=arr[front];
		}
		return d;
	}
	
	public void display() {
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
