package recursion;

public class Sum {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90};
		System.out.println(sum(arr,0));

	}
	static int sum(int a[],int i) {
		if(i>8)
			return 0;
//		System.out.println(a[i]);
		int sum=a[i]+sum(a,i+1);
		System.out.println(a[i]);
		return sum;
	}

}
