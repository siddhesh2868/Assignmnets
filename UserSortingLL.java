package exam;
class intNode{
	int data;
	intNode next;
	
	intNode(){
		data=0;
		next=null;
	}
	intNode(int data){
		this.data=data;
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

class SortingLL{
	intNode head;
	SortingLL(){
		head=null;
	}
	public void insertLast(int d) {
		intNode node=new intNode(d);
		if(head==null) {
			head=node;
			return;
		}
		intNode itr=head;
		while(itr.getNext()!=null) {
			itr=itr.getNext();
		}
		itr.setNext(node);
		return;
	}
	
	public void deleteByPos(int pos) {
		intNode del,itr;
		if(head==null) {
			System.out.println("Empty LL");
			return;
		}
		if(pos==1) {
			del=head;
			head=head.getNext();
			del.setNext(null);
			del=null;
			return;
		}
		itr=head;int i;
		for(i=1;i<pos-1 && itr.getNext()!=null;i++) {
			itr=itr.getNext();
		}
		del=itr.getNext();
		itr.setNext(del.getNext());
		del.setNext(null);
		del=null;
		return;
	}
	
	public void sorting() {
		intNode itr=head;
		int i=1;
		while(itr.getNext()!=null) {
			if(itr.getData()%2!=0) {
				int d=itr.getData();
				insertLast(d);
				itr=itr.getNext();
				deleteByPos(i);
				i++;
			}
			itr=itr.getNext();
		}
	}
	
	public void display() {
		intNode itr=head;
		while(itr!=null) {
			System.out.print(itr.getData()+" ");
			itr=itr.getNext();
		}
	}
}

public class UserSortingLL {

	public static void main(String[] args) {
		SortingLL s=new SortingLL();
		s.insertLast(1);
		s.insertLast(2);
		s.insertLast(3);
		s.insertLast(4);
		s.insertLast(5);
		s.insertLast(6);
		s.insertLast(7);
		s.insertLast(8);
		s.insertLast(9);
		s.insertLast(10);
		s.display();
		s.sorting();
		System.out.println("\nAfter Sorting:");
		s.display();
		
		
	}

}
