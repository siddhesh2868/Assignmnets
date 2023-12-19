package stack;

public class UserStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"Rahul");
		Student s2=new Student(102,"Abhishek");
		Student s3=new Student(103,"Akash");
		
		StudentStack ss=new StudentStack();
		ss.push(s1);
		ss.push(s2);
		ss.push(s3);
		System.out.println("Push");
		ss.display();
		System.out.println();
		System.out.println("POP");
		ss.pop();
		
		ss.display();
		System.out.println();
		System.out.println();
		System.out.println("Peek");
		ss.peek();
		
	}

}
