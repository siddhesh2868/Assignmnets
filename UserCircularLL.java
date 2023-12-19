package linkedList;
class intNode{
	private int data;
	private intNode next;
	
	public intNode(){
		data=0;
		next=null;
	}
	
	public intNode(int d) {
		data=d;
		next=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public intNode getNext() {
		return next;
	}

	public void setNext(intNode next) {
		this.next = next;
	}
	
}

class CircularLL{
	intNode tail;
	
	CircularLL(){
		tail=null;
	}
	
	public void insertFirst(int d) {
		intNode node=new intNode(d);
		if(tail==null) {
			tail=node;
			tail.setNext(node);
			return;
		}
		node.setNext(tail.getNext());
		tail.setNext(node);
		return;
	}
	
	public void insertLast(int d) {
		intNode node=new intNode(d);
		if(tail==null) {
			tail=node;
			tail.setNext(node);
			return;
		}
		node.setNext(tail.getNext());
		tail.setNext(node);
		tail=node;
		return;
	}
	public void deleteFirst() {
		intNode delete;
		if(tail==null) {
			System.out.println("No elements in the list");
			return;
		}
		if(tail.getNext()==tail) {
			tail.setNext(null);
			tail=null;
		}
		delete=tail.getNext();
		tail.setNext(tail.getNext().getNext());
		delete.setNext(null);
		delete=null;
		return;
	}
	public void deleteLast() {
		intNode delete;
		if(tail==null) {
			System.out.println("No elements in the list");
			return;
		}
		if(tail.getNext()==tail) {
			tail.setNext(null);
			tail=null;
			return;
		}
		intNode itr=tail.getNext();
		while(itr.getNext()!=tail) {
			itr=itr.getNext();
		}
		itr.setNext(tail.getNext());
		delete=tail;
		tail.setNext(null);
		tail=itr;
		delete=null;
		return;
	}
	public void deleteByPos(int pos) {
		intNode delete;
		if(tail==null) {
			System.out.println("No elements are present in list");
			return;
		}
		if(pos==1) {
			tail.setNext(null);
			tail=null;
			return;
		}
		intNode itr=tail.getNext();
		int i;
		for(i=1;itr.getNext()!=tail.getNext() && i<pos-1;i++) {
			itr=itr.getNext();
		}
		delete=itr.getNext();
		itr.setNext(itr.getNext().getNext());
		delete.setNext(null);
		delete=null;
		return;
		
	}
	
	public String toString() {
		String str=new String();
		intNode itr;
		if(tail==null) {
			str=str+" No elements in list.";
		}
		itr=tail.getNext();
		do {
			str=str+itr.getData()+" ";
			itr=itr.getNext();
		}while(itr!=tail.getNext());
		str=str+"\n";
		return str;
	}
	
//	public void display() {
//		intNode itr;
//		if(tail==null) {
//			System.out.println("No elements in list.");
//		}
//		itr=tail.getNext();
//		do {
//			System.out.print(itr.getData()+" ");
//			itr=itr.getNext();
//		}while(itr!=tail.getNext());
//	}
	
}
public class UserCircularLL {
	
	public static void main(String[] args) {
		
		CircularLL obj=new CircularLL();
		obj.insertFirst(10);
		obj.insertFirst(20);
		obj.insertLast(30);
		obj.insertLast(40);
		System.out.println(obj.toString());
		//obj.display();
//		obj.deleteFirst();
//		obj.deleteLast();
		obj.deleteByPos(3);
		System.out.println(obj.toString());
	}

}
