package recursion;

public class Recursion1 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90};
		display(arr,0);
	}
	static void display(int a[],int i) {
		if(i>8)
			return;
		display(a,i+1);
		System.out.println(a[i]);
	}
}


