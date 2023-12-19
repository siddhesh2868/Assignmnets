package exam;

class Employee{
	private int id;
	private String name;
	private double sal;
	
	public Employee(int id,String name,double sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
}
class EmpNode{
	Employee data;
	EmpNode next;
	
	EmpNode(){
		data=null;
		next=null;
	}
	
	EmpNode(Employee data){
		this.data=data;
		next=null;
	}

	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
		this.data = data;
	}

	public EmpNode getNext() {
		return next;
	}

	public void setNext(EmpNode next) {
		this.next = next;
	}
}

class EmpLinkedList{
	EmpNode head;
	EmpLinkedList(){
		head=null;
	}
	public EmpNode getHead() {
		return head;
	}
	public void setHead(EmpNode head) {
		this.head = head;
	}
	
	public void insertFirst(Employee data) {
		EmpNode node=new EmpNode(data);
		if(head==null) {
			head=node;
			return;
		}
		node.setNext(head);
		head=node;
		return;
	}
	
	public void insertLast(Employee data) {
		EmpNode node=new EmpNode(data);
		if(head==null) {
			head=node;
			return;
		}
		EmpNode itr=head;
		while(itr.getNext()!=null) {
			itr=itr.getNext();
		}
		itr.setNext(node);
		
	}
	public void deleteFirst() {
		EmpNode delete;
		if(head==null) {
			System.out.println("No Elements");
			return;
		}
		delete=head;
		head=head.getNext();
		delete.setNext(null);
		delete=null;
		return;
	}
	public void deleteLast() {
		EmpNode del,itr;
		if(head==null) {
			System.out.println("No Elements");
			return;
		}
		if(head.getNext()==null) {
			head=null;
			return;
		}
		itr=head;
		while(itr.getNext().getNext()!=null) {
			itr=itr.getNext();
		}
		del=itr.getNext();
		del=null;
		itr.setNext(null);
		return;
	}
	
	public void reverse() {
		EmpNode itr=head;
		EmpNode prev=null;
		EmpNode next1;
		
		while(itr!=null) {
			next1=itr.getNext();
			itr.setNext(prev);
			prev=itr;
			itr=next1;
		}
		head=prev;
	}
	public void insert_sorted(Employee d) {
		EmpNode node=new EmpNode(d);
		if(head==null || head.getData().getId()>d.getId()) {
			node.setNext(head);
			head=node;
			return;
		}
		EmpNode itr=head;
		while(itr.getNext()!=null && itr.getNext().getData().getId()<d.getId()) {
			itr=itr.getNext();
		}
		node.setNext(itr.getNext());
		itr.setNext(node);
		return;
	}
	public void display() {
		if(head==null) {
			System.out.println("No Elements present in LL");
			return;
		}
		EmpNode itr=head;
		while(itr.getNext()!=null) {
			System.out.println(itr.getData().getId()+" "+itr.getData().getName()+" "+itr.getData().getSal());
			itr=itr.getNext();
		}
		System.out.println(itr.getData().getId()+" "+itr.getData().getName()+" "+itr.getData().getSal());
		return;
	}
	
}

public class UserEmpLinkedList {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"AA",25000);
		Employee e2=new Employee(5,"BB",35000);
		Employee e3=new Employee(3,"CC",45000);
		EmpLinkedList e=new EmpLinkedList();
		System.out.println("After insert:");
//		e.insertFirst(e1);
//		e.insertFirst(e2);
//		e.insertLast(e3);
		e.insert_sorted(e1);
		e.insert_sorted(e2);
		e.insert_sorted(e3);
		e.display();
		System.out.println();
//		System.out.println("After delete:");
//		e.deleteLast();
		System.out.println("After reverse: ");
		e.reverse();
		e.display();

	}

}
