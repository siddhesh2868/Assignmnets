package tree;

class BST{
	BTNode root;
	public BST() {
		root=null;
	}
	public BTNode getRoot() {
		return root;
	}
	public void setRoot(BTNode root) {
		this.root = root;
	}
	
	public void insert(int d) {
		root=insertrec(root,d);
	}
	
	private BTNode insertrec(BTNode ptr,int d) {
		BTNode node=new BTNode(d);
		if(ptr==null) {
			ptr=node;
			return ptr;
		}
		else if(d<ptr.getData()) {
			ptr.setLeft(insertrec(ptr.getLeft(),d));
		}
		else if(d>ptr.getData()) {
			ptr.setRight(insertrec(ptr.getRight(),d));
		}
		else {
			System.out.println("Wrong number.");
			return null;
		}
		return ptr;
		
	}
	
	public void inorder() {
		visit_inorder(root);
	}
	
	private void visit_inorder(BTNode ptr) {
		if(ptr==null) {
			return;
		}
		visit_inorder(ptr.getLeft());
		System.out.print(ptr.getData()+" ");
		visit_inorder(ptr.getRight());
	}
	
	public void preorder() {
		visit_preorder(root);
	}
	
	public void post_order() {
		visit_postorder(root);
	}
	
	private void visit_preorder(BTNode ptr) {
		if(ptr==null) {
			return;
		}
		System.out.print(ptr.getData()+" ");
		visit_preorder(ptr.getLeft());
		visit_preorder(ptr.getRight());
	}
	
	private void visit_postorder(BTNode ptr) {
		if(ptr==null) {
			return;}
		visit_postorder(ptr.getLeft());
		visit_postorder(ptr.getRight());
		System.out.print(ptr.getData()+" ");
		
	}
	
	public void search(int d) {
		int ele=searchrec(root,d).getData();
		System.out.println(ele);
	}
	private BTNode searchrec(BTNode ptr,int d) {
		if(ptr==null) {
			System.out.println("Not found");
			return null;
		}
		else if(d<ptr.getData()) {
			return searchrec(ptr.getLeft(),d);
		}
		else if(d>ptr.getData()) {
			return searchrec(ptr.getRight(),d);
		}
		else {
			return ptr;
		}
	}
	public void findht() {
		System.out.println(findhtrec(root));
	}
	
	private int findhtrec(BTNode ptr) {
		int hleft,hright;
		if(ptr==null) {
			return 0;
		}
		hleft=findhtrec(ptr.getLeft());
		hright=findhtrec(ptr.getRight());
		if(hleft>hright)
			return 1+hleft;
		else if(hright>hleft)
			return 1+hright;
		else
			return 1+hleft;
	}
	
	public void delete(int d) {
		BTNode res=deleterec(root,d);
		System.out.println(res.getData());
	}
	
	private BTNode deleterec(BTNode ptr,int d) {
		BTNode succ,temp;
		if(ptr==null) {
			System.out.println("No such elements");
			return null;
		}
		if(d<ptr.getData()) {
			ptr.setLeft(deleterec(ptr.getLeft(),d));
		}
		else if(d>ptr.getData()) {
			ptr.setRight(deleterec(ptr.getRight(),d));
		}
		else {
			if(ptr.getLeft()!=null && ptr.getRight()!=null) {
				succ=ptr.getRight();
				while(succ.getLeft()!=null) {
					succ=succ.getLeft();
				}
				ptr.setData(succ.getData());
				ptr.setRight(deleterec(ptr.getRight(),succ.getData()));
			}
			else {
				temp=ptr;
				if(temp.getLeft()!=null) {
					temp=temp.getLeft();
				}
				else if(temp.getRight()!=null) {
					temp=temp.getRight();
				}
				else {
					temp=null;
				}
				
			}
		}
		return ptr;
	}
	
}

public class UserBST {

	public static void main(String[] args) {
		BST bt=new BST();
		bt.insert(10);
		bt.insert(7);
		bt.insert(12);
		bt.insert(5);
		bt.insert(9);
		bt.insert(11);
		bt.insert(17);
		
		System.out.println("Inorder: ");
		bt.inorder();
		System.out.println("\nPreorder: ");
		bt.preorder();
		System.out.println("\nPostOrder: ");
		bt.post_order();
		System.out.print("\nElement is found?: ");
		bt.search(12);
		bt.findht();
		bt.delete(12);
		System.out.println();
		bt.preorder();
	}

}
