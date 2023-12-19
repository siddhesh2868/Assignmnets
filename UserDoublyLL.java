package linkedList;

class DoublyNode{
	private int data;
	private DoublyNode prev,next;
	
	public DoublyNode() {
		data=0;
		prev=null;
		next=null;
	}
	
	public DoublyNode(int d) {
		data=d;
		prev=null;
		next=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}

	public DoublyNode getNext() {
		return next;
	}

	public void setNext(DoublyNode next) {
		this.next = next;
	}
	
}

class DoublyLL{
	DoublyNode head;
	
	public DoublyLL(){
		head=null;
	}
	
	public void insertFirst(int d) {
		DoublyNode node=new DoublyNode(d);
		if(head==null) {
			head=node;
			return;
		}
		head.setPrev(node);
		node.setNext(head);
		head=node;
		return;
	}
	public void insertLast(int d) {
		DoublyNode node=new DoublyNode(d);
		if(head==null) {
			head=node;
			return;
		}
		DoublyNode itr=head;
		while(itr.getNext()!=null) {
			itr=itr.getNext();
		}
		itr.setNext(node);
		node.setPrev(itr);
		return;
	}
//	
	public void insertByPos(int d,int pos) {
		DoublyNode node=new DoublyNode(d);
		if(head==null) {
			head=node;
			return;
		}
		if(pos==1) {
			head.setPrev(node);
			node.setNext(head);
			head=node;
			return;
		}
		DoublyNode itr=head;
		int i;
		for(i=1;itr.getNext()!=null && i<pos-1;i++) {
			itr.getNext(); 
		}
		node.setNext(itr.getNext());
		node.setPrev(itr);
		itr.getNext().setPrev(node);
		itr.setNext(node);
		return;
	}
	
	public void deleteFirst() {
		DoublyNode delete;
		if(head==null) {
			System.out.println("No Elements are present");
			return;
		}
		
		delete=head;
		head=head.getNext();
		head.setPrev(null);
		delete.setNext(null);
		delete=null;
		return;
	}
	public void deleteLast() {
		DoublyNode delete;
		if(head==null) {
			System.out.println("No Elements are present");
			return;
		}
		if(head.getNext()==null) {
			head=null;
			return;
		}
		DoublyNode itr=head;
		while(itr.getNext().getNext()!=null) {
			itr=itr.getNext();
		}
		delete=itr.getNext();
		itr.getNext().setPrev(null);
		itr.setNext(null);
		delete=null;
		return;
		
	}
	public void deleteByPos(int pos) {
		DoublyNode delete,itr=head;
		if(head==null) {
			System.out.println("No elements");
			return;
		}
		if(pos==1) {
			if(head.getNext()==null) {
				head=null;
				return;
			}
			delete=head;
			head=head.getNext();
			head.setPrev(null);
			delete.setNext(null);
			delete=null;
			return;
		}
		int i;
		for(i=1;itr.getNext()!=null && i<pos;i++) {
			itr=itr.getNext();
		}
		delete=itr;
		itr.getPrev().setNext(itr.getNext());
		itr.getNext().setPrev(itr.getPrev());
		itr.setNext(null);
		itr.setPrev(null);
		itr=null;
		return;
	}
	public void display() {
		DoublyNode itr=head;
		if(head==null) {
			System.out.println("No elements in linkedlist");
			return;
		}
		if(head.getNext()==null) {
			System.out.println(head.getData());
		}
		while(itr.getNext()!=null) {
			System.out.print(itr.getData()+" ");
			itr=itr.getNext();
		}
		System.out.print(itr.getData()+" ");
		return;
	}
	
}


public class UserDoublyLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLL obj=new DoublyLL();
		obj.insertFirst(10);
		obj.insertFirst(20);
		obj.insertFirst(30);
		obj.insertLast(40);
		obj.insertByPos(50, 2);
		obj.display();
		System.out.println();
//		obj.deleteFirst();
//		obj.deleteLast();
		obj.deleteByPos(3);
		obj.display();
	}

}
