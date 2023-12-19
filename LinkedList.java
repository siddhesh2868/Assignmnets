package queue;

public class LinkedList{
	private IntNode head;
		
		public LinkedList(){
			head=null;
		}
		
		public void insertFirst(int d) {
			IntNode new_node=new IntNode(d);
			if(head==null) {
				head=new_node;
				return;
			}
			new_node.setNext(head);
			head=new_node;
			return;
		}
		
		public void insertLast(int d) {
			IntNode new_node=new IntNode(d);
			if(head==null) {
				head=new_node;
				return;
			}
			IntNode itr=head;
			while(itr.getNext()!=null) {
				itr=itr.getNext();
			}
			itr.setNext(new_node);
			
		}
		
		public void insertByPos(int n,int pos) {
			IntNode node=new IntNode(n);
			if(head==null) {
				head=node;
				return;
			}
			if(pos==1) {
				node.setNext(head);
				head=node;
				return;
			}
			int i;
			IntNode itr=head;
			for(i=1;((i<pos-1) && (itr.getNext()!=null));i++) {
				itr.getNext();
			}
			node.setNext(itr.getNext());
			itr.setNext(node);
			return;
		}
		
		public void deleteFirst() {
			IntNode delete;
			if(head==null) {
				System.out.println("List is already empty");
				return;
			}
			delete=head;
			head=head.getNext();
			delete.setNext(null);
			delete=null;
		}
		
		public void deleteLast() {
			
			if(head==null) {
				System.out.println("List is already empty");
				return;
			}
			if(head.getNext()==null) {
				head=null;
				return;
			}
			IntNode itr=head;
			while((itr.getNext()).getNext()!=null) {
				itr=itr.getNext();
			}
			IntNode	delete=itr.getNext();
			itr.setNext(null);
			delete=null;
			return;
		}
		
		public void deleteByPos(int pos) {
			IntNode delete;
			if(head==null) {
				System.out.println("List is already empty");
				return;
			}
			if(pos==1) {
				delete=head;
				head=head.getNext();
				delete=null;
				return;
			}
			if(head.getNext()==null) {
				System.out.println("Invalid position");
				return;
			}
			IntNode itr=head;
			int i;
			for(i=1;i<pos-1 && itr.getNext()!=null;i++) {
				itr=itr.getNext();
			}
			if(itr.getNext()==null) {
				System.out.println("Outofound");
				return;
			}
			
			delete=itr.getNext();
			itr.setNext(delete.getNext());
			delete=null;
			return;
			
			
		}
		
		public void insert_sorted(int d) {
			IntNode node=new IntNode(d);
			if(head==null || head.getData()>d) {
				node.setNext(head);
				head=node;
				return;
			}
			IntNode itr=head;
			while(itr.getNext()!=null && itr.getNext().getData()<d) {
				itr=itr.getNext();
			}
			node.setNext(itr.getNext());
			itr.setNext(node);
			return;
		}
		
		public void reverse() {
			IntNode itr=head;
			IntNode prev=null;
			IntNode next1;
			
			while(itr!=null) {
				next1=itr.getNext();
				itr.setNext(prev);
				prev=itr;
				itr=next1;
			}
			head=prev;
		}
		public void display() {
			if(head==null) {
				System.out.println("No elements in linkedlist");
				return;
			}
				IntNode itr=head;
				while(itr!=null) {
					System.out.print(itr.getData()+" ");
					itr=itr.getNext();
			}return;
		}
		public String isString() {
			String str=new String();
			if(head==null) {
				str=str+" List is empty";
			}
			IntNode itr=head;
			while(itr.getNext()!=null) {
				str=str+itr.getData()+" ";
				itr.getNext();
			}
			str=str+"\n";
			return str;
		}

		public void merge(LinkedList obj, LinkedList obj1) {
			IntNode itr=obj.head;
			IntNode itr1=obj1.head;
			
			while(itr!=null && itr1!=null) {
				if(itr.getData()<itr1.getData()) {
					insertLast(itr.getData());
					itr=itr.getNext();
				}
				else if(itr.getData()>itr1.getData()) {
					insertLast(itr1.getData());
					itr1=itr1.getNext();
				}
				else {
					insertLast(itr.getData());
					insertLast(itr1.getData());
					itr1=itr1.getNext();
					itr=itr.getNext();
				}
			}
			while(itr!=null) {
				insertLast(itr.getData());
				itr=itr.getNext();
			}
			while(itr1!=null) {
				insertLast(itr.getData());
				itr1=itr1.getNext();
			}
			
		}
		
	}