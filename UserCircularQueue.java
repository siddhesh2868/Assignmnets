package queue;

public class UserCircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue cq=new CircularQueue();
		cq.enQueue(10);
		cq.enQueue(20);
		cq.enQueue(30);
		cq.enQueue(40);
		System.out.println("EnQueue:");
		cq.display();
		
		cq.deQueue();
		cq.deQueue();
		//System.out.println();
		System.out.println();
		System.out.println("DeQueue: ");
		cq.display();
		System.out.println();
		System.out.println("Peek: "+cq.peek());
		
//		cq.enQueue(50);
//		cq.enQueue(60);
//		cq.enQueue(70);
//		cq.enQueue(80);
//		System.out.println();
//		System.out.println();
//		System.out.println("EnQueue: ");
//		cq.display();
	}

}
