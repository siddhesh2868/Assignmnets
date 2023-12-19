package stack;

public class UserDoubleStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleStack ds=new DoubleStack();
		ds.pushA(10);
		ds.pushA(20);
		ds.pushA(30);
		ds.pushA(40);
		ds.pushB(5);
		ds.pushB(15);
		ds.pushB(25);
		ds.pushB(35);
		System.out.println("A");
		ds.displayA();
		System.out.println();
		System.out.println("B");
		ds.displayB();
		System.out.println();
		System.out.println("Array");
		ds.display();
		
		ds.popA();
		ds.popB();
		System.out.println();
		System.out.println("A");
		ds.displayA();
		System.out.println();
		System.out.println("B");
		ds.displayB();
		System.out.println();
		System.out.println("Array after pop");
		ds.display();
		System.out.println();
		System.out.println("A"+ds.peekA());
		System.out.println("B"+ds.peekB());
	}

}
