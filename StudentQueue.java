package queue;

import stack.Student;

public class StudentQueue {
	private Student[] arr;
	private int rear=-1,front=0;
	
	public StudentQueue(){
		arr=new Student[5];
	}
	
	public StudentQueue(int s) {
		arr=new Student[s];
	}
	
	public boolean isEmpty() {
		if(front-rear==1) {
			return true;
		}
		else return false;
	}
	
	public boolean isFull() {
		if(rear==arr.length-1) {
			return true;
		}
		else return false;
	}
	
	public void enQueue(Student s) {
		if(isFull()) {
			System.out.println("Overflow");
		}
		else {
			rear++;
			arr[rear]=s;
		}
	}
	
	public Student deQueue() {
		Student s=null;
		if(isEmpty()) {
			System.out.println("Underflow");
		}
		else {
			s=arr[front];
			arr[front]=null;
			front++;
		}
		return s;
	}
	
	public void peek() {
		int id;String name;
		if(isEmpty()) {
			System.out.println("Overflow");
		}
		else {
			System.out.println(arr[front].getId());
			System.out.println(arr[front].getName());
		}
	}
	
	public void display() {
		for(int i=front;i<=rear;i++) {
			System.out.println(arr[i].getId()+" "+arr[i].getName());
		}
	}
}
