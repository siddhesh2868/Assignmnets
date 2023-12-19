package recursion;

public class RecursionFun1 {

	public static void fun1(int n) {
		if(n>10)
			return;
		System.out.print(n+" ");
		fun2(n+1);
		//System.out.println();
		System.out.print(n+" ");
	}
	
	public static void fun2(int i) {
		fun1(i+1);
	}
	public static void main(String[] args) {
		fun1(1);

	}

}
