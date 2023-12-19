package queue;

public class UserQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue1 q=new Queue1();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		System.out.println("Enqueue");
		q.display();
		System.out.println();
		q.deQueue();
		q.deQueue();
		System.out.println("Dequeue");
		q.display();
		System.out.println();
		System.out.println("Peek");
		System.out.println(q.peek());
	}

}
