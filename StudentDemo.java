package queue;

import stack.Student;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1=new Student(100,"AS");
		Student s2=new Student(200,"DR");
		Student s3=new Student(300,"WE");
		
		StudentQueue sq=new StudentQueue();
		sq.enQueue(s1);
		sq.enQueue(s2);
		sq.enQueue(s3);
		sq.display();
		System.out.println();
		sq.peek();
		System.out.println();
		System.out.println("Dequeue");
		sq.deQueue();
		sq.display();
	}
}	
