package queue;

public class CircularQueue {
	private int[] arr;
	private int front=-1;
	private int rear=-1;
	
	CircularQueue(){
		arr=new int[5];
	}
	CircularQueue(int s) {
		arr=new int[s];
	}
	
	public boolean isFull() {
		if(((front==0) && (rear==arr.length-1))||(front-rear==1)) {
			return true;
		}
		else return false;
	}
	
	public boolean isEmpty() {
		if(front==-1) {
			return true;
		}
		else return false;
	}
	
	public void enQueue(int d) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		if(front==-1) front=0;
		if(rear==arr.length-1) {
			rear=0;
		}
		else
			rear+=1;
		arr[rear]=d;
		
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Underflow");
		}
		else {
			arr[front]=0;
		}
		
		if(front==rear) {
			front=-1;
			rear=-1;
		}
		else {
			if(front==arr.length-1) {
				front=0;
			}
			else {
				front++;
			}
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
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
