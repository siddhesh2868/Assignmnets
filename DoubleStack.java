package stack;

public class DoubleStack {
	
	private int[] arr;
	private int topA=-1;
	private int topB;
	
	DoubleStack(){
		arr=new int[10];
		topB=arr.length;
	}
	DoubleStack(int a) {
		arr=new int[a];
		topB=arr.length;
	}
	
	public boolean isEmptyA() {
		if(topA==-1) {
			return true;
		}
		else return false;
	}
	public boolean isEmptyB() {
		if(topB==arr.length) {
			return true;
		}
		else return false;
	}
	public boolean isFull() {
		if(topB-topA==1) return true;
		else return false;
	}
	
	public void pushA(int a) {
		if(isFull()) {
			System.out.println("Overflow");
		}
		else {
			topA++;
			arr[topA]=a;
		}
	}
	
	public void pushB(int b) {
		if(isFull()) {
			System.out.println("Overflow");
		}
		else {
			topB--;
			arr[topB]=b;
		}
	}
	
	public int popA() {
		int d=-1;
		if(isEmptyA()) {
			System.out.println("Underflow");
		}
		else {
			d=arr[topA];
			arr[topA]=0;
			topA--;
		}
		return d;
	}
	
	public int popB() {
		int d=-1;
		if(isEmptyB()) {
			System.out.println("Underflow");
		}
		else {
			d=arr[topB];
			arr[topB]=0;
			topB++;
		}
		return d;
	}
	
	public int peekA() {
		int d=-1;
		if(isEmptyA()) {
			System.out.println("Underflow");
		}
		else {
			d=arr[topA];
		}
		return d;
	}
	
	public int peekB() {
		int d=-1;
		if(isEmptyB()) {
			System.out.println("Underflow");
		}
		else {
			d=arr[topB];
		}
		return d;
	}
	
	public void displayA() {
		for(int i=0;i<=topA;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void displayB() {
		for(int i=arr.length-1;i>=topB;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
