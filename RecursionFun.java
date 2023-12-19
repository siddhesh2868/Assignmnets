package recursion;

class A{
	private int num;
	public A() {
		num=10;
	}
	public A(int n) {
		num=n;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}

public class RecursionFun {
	
	public static void recursion(A obj1,A obj2) {
		A t=new A(obj1.getNum());
		obj1.setNum(obj2.getNum());
		obj2.setNum(t.getNum());
	}

	public static void main(String[] args) {
		A o1=new A(10);
		A o2=new A(20);
		System.out.println(o1.getNum()+" "+o2.getNum());
		recursion(o1,o2);
		System.out.println(o1.getNum()+" "+o2.getNum());

	}

}
