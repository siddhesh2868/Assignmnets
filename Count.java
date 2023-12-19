package recursion;

public class Count {
	static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {
		int num=12345,limit=10;
		System.out.println(cnt(num));
		System.out.println(mul(num));
		System.out.println(sum(num));
		display(num);
		System.out.println(power(3,3));
		System.out.println(fact(5));
		System.out.print(n1+" "+n2);
		fib(limit-2);
		System.out.println();
		System.out.println(rev(123));
	}
	
	static int cnt(int i) {
		if(i/10==0)
			return 1;
		return 1+cnt(i/10);
	}
	static int mul(int n) {
		if(n/10==0)
			return n;
		return (n%10)*mul(n/10);
	}
	static int sum(int n) {
		if(n/10==0)
			return n;
		return(n%10)+sum(n/10);
	}
	public static void display(int n) {
		if(n/10==0) {
			System.out.println(n);
			return;
		}
		System.out.print(n%10+" ");
		display(n/10);
	}
	public static int power(int n,int p) {
		if(p==0)
			return 1;
		return n*power(n,p-1);
	}
	public static int fact(int n) {
		if(n==0 || n==1)
			return 1;
		return n*fact(n-1);
	}

	static int reverse=0;
	public static int rev(int n) {
		if(n==0)
			return 0;
		int temp=n%10;
		reverse=reverse*10+temp;
		rev(n/10);
		return reverse;
	}
	
	public static void fib(int limit) {
		if(limit==0)
			return;
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
		fib(limit-1);
	}
}
