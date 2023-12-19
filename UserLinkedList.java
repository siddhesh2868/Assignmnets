package queue;

import java.util.*;

public class UserLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj=new LinkedList();
		obj.insertFirst(10);
		obj.insertLast(20);
		obj.insertLast(30);
		
		LinkedList obj1=new LinkedList();
		obj1.insertFirst(5);
		obj1.insertLast(15);
		obj1.insertLast(25);
		
		LinkedList res=new LinkedList();
		res.merge(obj,obj1);
		res.display();
		System.out.println();
	
		
//		obj.insertLast(30);
//		obj.insertByPos(40,2);
		obj.display();
		System.out.println();
//		obj.deleteFirst();
		obj1.display();
		//System.out.println(obj.toString().toString());
//		System.out.println();
//		obj.deleteFirst();
//		obj.display();
//		System.out.println("delete");
//		obj.deleteLast();
//		obj.display();
//		System.out.println();
//		obj.deleteByPos(2);
//		System.out.println(obj.toString());
//		obj.display();
//		obj.insert_sorted(5);
//		obj.insert_sorted(10);
//		obj.insert_sorted(15);
//		obj.insert_sorted(8);
//		obj.insert_sorted(12);
//		obj.display();
//		System.out.println();
//		obj.reverse();
//		obj.display();
	}

}
