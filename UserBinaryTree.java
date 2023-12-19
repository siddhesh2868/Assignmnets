package tree;

import java.util.*;

class BTNode{
	private int data;
	private BTNode left,right;
	
	public BTNode(){
		data=0;
		left=null;
		right=null;
	}
	
	public BTNode(int d) {
		data=d;
		left=right=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BTNode getLeft() {
		return left;
	}

	public void setLeft(BTNode left) {
		this.left = left;
	}

	public BTNode getRight() {
		return right;
	}

	public void setRight(BTNode right) {
		this.right = right;
	}
	
}

class BinaryTree{
	private BTNode root;
	
	
	public BinaryTree() {
		root=null;
	}

	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode root) {
		this.root = root;
	}
//	public BTNode createNode(int d) {
//		BTNode node=new BTNode(d);
//		if(root==null) {
//			root=node;
//		}
//		return root;
//	}
	public void insertLevelWise(int d) {
		BTNode node=new BTNode(d);
		BTNode itr;
		
		Queue<BTNode> q=new LinkedList<BTNode>();
		if(root==null) {
			root=node;
			return;
		}
		q.add(root);
		while(!q.isEmpty()) {
			itr=q.remove();
			if(itr.getLeft()==null) {
				itr.setLeft(node);
				return;
			}
			else {
				q.add(itr.getLeft());
			}
			if(itr.getRight()==null) {
				itr.setRight(node);
				return;
			}
			else {
				q.add(itr.getRight());
			}
		}
	}
	public void display() {
		BTNode itr;
		Queue<BTNode> q=new LinkedList<BTNode>();
		if(root==null) {
			System.out.println("Empty tree");
			return;
		}
		System.out.println("Binary Tree Elements are:");
		q.add(root);
		while(!q.isEmpty()) {
			itr=q.remove();
			System.out.print(itr.getData()+"->");
			if(itr.getLeft()!=null) {
				q.add(itr.getLeft());
			}
			if(itr.getRight()!=null) {
				q.add(itr.getRight());
			}
		}
		System.out.println("END");
	}
	public int sumofnonleaf() {
		BTNode itr;
		int sum=0;
		Queue<BTNode> q=new LinkedList<BTNode>();
		if(root==null) {
			System.out.println("Empty Tree");
			return 0;
		}
		q.add(root);
		while(!q.isEmpty()) {
			itr=q.remove();
			if(itr.getLeft()!=null || itr.getRight()!=null) {
				sum+=itr.getData();
			}
			if(itr.getLeft()!=null) {
				q.add(itr.getLeft());
			}
			if(itr.getRight()!=null) {
				q.add(itr.getRight());
			}
		}
		return sum;
	}
	
	public int sumofleaf() {
		BTNode itr;
		int sum=0;
		Queue<BTNode> q=new LinkedList<BTNode>();
		if(root==null) {
			System.out.println("Empty Tree");
			return 0;
		}
		q.add(root);
		while(!q.isEmpty()) {
			itr=q.remove();
			if(itr.getLeft()==null && itr.getRight()==null) {
				sum+=itr.getData();
			}
			if(itr.getLeft()!=null) {
				q.add(itr.getLeft());
			}
			if(itr.getRight()!=null) {
				q.add(itr.getRight());
			}
		}
		return sum;
	}
	public int levelcount() {
		int level=-1;
		BTNode itr;
		BTNode dummy=new BTNode(-999);
		Queue<BTNode> q=new LinkedList<BTNode>();
		if(root==null) {
			System.out.println("Empty tree");
			return 0;
		}
		q.add(root);
		q.add(dummy);
		while(!q.isEmpty()) {
			itr=q.remove();
			if(itr.getData()==-999) {
				level+=1;
				q.add(dummy);
				itr=q.remove();
			}
			if(itr.getLeft()!=null) {
				q.add(itr.getLeft());
			}
			if(itr.getRight()!=null) {
				q.add(itr.getRight());
			}
		}
		return level;
	}
	
	public int max() {
		BTNode itr;
		Queue<BTNode> q=new LinkedList<BTNode>();
		if(root==null) {
			System.out.println("Empty");
			return 0;
		}
		int max=root.getData();
		q.add(root);
		while(!q.isEmpty()) {
			itr=q.remove();
			if(itr.getData()>max) {
				max=itr.getData();
			}
			if(itr.getLeft()!=null) {
				q.add(itr.getLeft());
			}
			if(itr.getRight()!=null) {
				q.add(itr.getRight());
			}
		}
		return max;
	}
	public int min() {
		BTNode itr;
		Queue<BTNode> q=new LinkedList<BTNode>();
		if(root==null) {
			System.out.println("Empty");
			return 0;
		}
		int min=root.getData();
		q.add(root);
		while(!q.isEmpty()) {
			itr=q.remove();
			if(itr.getData()<min) {
				min=itr.getData();
			}
			if(itr.getLeft()!=null) {
				q.add(itr.getLeft());
			}
			if(itr.getRight()!=null) {
				q.add(itr.getRight());
			}
		}
		return min;
	}
	public boolean search(int d) {
		BTNode itr;int count=0;
		Queue<BTNode> q=new LinkedList<BTNode>();
		if(root==null) {
			System.out.println("No elements ");
			return false;
		}
		q.add(root);
		while(!q.isEmpty()) {
			itr=q.remove();
			if(itr.getData()==d) {
				count++;
			}
			if(itr.getLeft()!=null) {
				q.add(itr.getLeft());
			}
			if(itr.getRight()!=null) {
				q.add(itr.getRight());
			}
			
		}
		if(count==1) return true;
		else return false;
	}
	
}

public class UserBinaryTree {

	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.insertLevelWise(10);
		bt.insertLevelWise(12);
		bt.insertLevelWise(8);
		bt.insertLevelWise(14);
		bt.insertLevelWise(1);
		bt.insertLevelWise(5);
		bt.insertLevelWise(25);
		bt.insertLevelWise(8);
		bt.display();
		System.out.println("Sum of non leaf nodes: "+bt.sumofnonleaf());
		System.out.println("Sum of leaf Nodes: "+bt.sumofleaf());
		System.out.println("No of levels in the tree:"+bt.levelcount());
		//System.out.println("height is "+bt.levelcount());
		System.out.println("Maximum value in the tree: "+bt.max());
		System.out.println("Minimum5 value in the tree: "+bt.min());
		System.out.println("Is elements present?:"+bt.search(15));
		
	}

}
