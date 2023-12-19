package stack;

import java.util.Scanner;

public class UserIntStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IntStack i=new IntStack(5);
		int choice;
		do {
			System.out.println();
			System.out.println("Choose one of the following: ");
			System.out.println("1. Adding elements to stack: ");
			System.out.println("2. Removing elements from stack: ");
			System.out.println("3. Getting top element ");
			System.out.println("4. Exit ");
			choice=sc.nextInt();
			switch(choice) {
			case 1: {
				i.push(sc.nextInt());
				i.display();
				break;
			}
			case 2: {
				i.pop();
				i.display();
				break;
			}
			case 3: {
				System.out.println(i.peek());
				break;
			}
			case 4: break;
			}
		}while(choice!=4);

	}

}
