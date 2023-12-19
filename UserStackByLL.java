package linkedList;

class intNode1{
	private int data;
	private intNode1 next;
	
	intNode1(){
		data=0;
		next=null;
	}
	intNode1(int n){
		data=n;
		next=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public intNode1 getNext() {
		return next;
	}
	public void setNext(intNode1 next) {
		this.next = next;
	}
	
}
class StackByLL{
	private intNode1 top;
	public StackByLL() {
		top=null;
	}
	public void push(int d) {
		intNode1 node=new intNode1(d);
		if(top==null) {
			top=node;
			return;
		}
		node.setNext(top);
		top=node;
		return;
	}
	public void pop() {
		intNode1 delete;
		if(top==null) {
			System.out.println("No elements in stack");
			return;
		}
		if(top.getNext()==null) {
			top=null;
			return;
		}
		delete=top;
		top=top.getNext();
		delete.setNext(null);
		delete=null;
	}
	public void peek() {
		if(top==null) {
			System.out.println("No list");
			return;
		}
		System.out.println(top.getData());
	}
	public String toString() {
		String str=new String();
		intNode1 itr=top;
		do{
			str=str+itr.getData()+" ";
			itr=itr.getNext();
		}while(itr!=null); 
		//str=str+itr.getData()+" ";
		System.out.println();
		return str;
	}
}

public class UserStackByLL {

	public static void main(String[] args) {
		StackByLL obj=new StackByLL();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		System.out.println(obj.toString());
		System.out.println();
		obj.peek();

	}

}
