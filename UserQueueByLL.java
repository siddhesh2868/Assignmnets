package linkedList;

class QueueByLL{
	private intNode1 front, rear;
	
	public QueueByLL() {
		front=null;
		rear=null;
	}
	public void insertLast(int d) {
		intNode1 node=new intNode1(d);
		if(front==null) {
			front=node;
			rear=node;
			return;
		}
		rear.setNext(node);
		rear=node;
		return;
	}
	public void deleteFirst() {
		intNode1 delete;
		if(front==null) {
			System.out.println("Queue is null");
			return;
		}
		if(front==null) {
			front=null;
			rear=null;
			return;
		}
		delete=front;
		front=front.getNext();
		delete.setNext(null);
		delete=null;
		return;
	}
	public void peek() {
		if(front==null) {
			System.out.println("List is null");
			return;
		}
		System.out.println(front.getData());
	}
	public String toString() {
		String str=new String();
		intNode1 itr=front;
		str=str+itr.getData()+" ";
		do{
			if(itr.getNext()!=null) {
				itr=itr.getNext();
				str=str+itr.getData()+" ";
			}
		}while(itr!=rear);
		//str=str+itr.getData()+" ";
		str=str+"\n";
		return str;
	}
	public void display() {
		System.out.println(front.getData());
		System.out.println(rear.getData());
	}
}

public class UserQueueByLL {

	public static void main(String[] args) {
		QueueByLL obj=new QueueByLL();
		obj.insertLast(10);
		obj.insertLast(20);
		obj.insertLast(30);
		obj.insertLast(40);
		obj.peek();
		System.out.println();
		System.out.println(obj.toString());
		//obj.display();
		obj.deleteFirst();
		obj.deleteFirst();
		System.out.println(obj.toString());

	}

}
