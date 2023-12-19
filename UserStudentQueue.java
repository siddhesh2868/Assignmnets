package stack;

class StudentQueue{
	Student[] arr;
	int rear,front;
	
	public StudentQueue() {
		arr=new Student[3];
		front=0;
		rear=-1;
	}
	
	public boolean isEmpty() {
		if(front-rear==1) 
			return true;
		else return false;
	}
	
	public boolean isFull() {
		if(rear==arr.length-1)
			return true;
		else return false;
	}
	public void enqueue(Student s) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		rear++;
		arr[rear]=s;
		return;
	}
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return;
		}
		arr[front]=null;
		front++;
		return;
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return;
		}
		System.out.println(arr[front].getId()+" "+arr[front].getName());
	}
	public void display() {
		for(int i=front;i<=rear;i++) {
			System.out.println(arr[i].getId()+" "+arr[i].getName());
		}
	}
}

public class UserStudentQueue {

	public static void main(String[] args) {
		Student s1=new Student(101,"Rahul");
		Student s2=new Student(102,"Abhishek");
		Student s3=new Student(103,"Akash");
		
		StudentQueue sq=new StudentQueue();
		sq.enqueue(s1);
		sq.enqueue(s2);
		sq.enqueue(s3);
		System.out.println("Enqueue");
		sq.display();
		System.out.println();
		sq.dequeue();
		System.out.println("Dequeue");
		sq.display();
		System.err.println();
		sq.peek();

	}

}
