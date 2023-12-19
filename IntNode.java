package queue;

public class IntNode{
	private int data;
	private IntNode next;
	
	public IntNode(){
		data=0;
		next=null;
	}
	
	public IntNode(int n) {
		data=n;
		next=null;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public IntNode getNext() {
		return next;
	}

	public void setNext(IntNode next) {
		this.next = next;
	}

	
}
