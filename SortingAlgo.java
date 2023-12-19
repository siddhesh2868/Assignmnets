package sorting;

public class SortingAlgo {

	public static void main(String[] args) {
		int[] arr= {10,20,40,30,1,5,4,25};
		display(arr);
		System.out.println("After sorting: ");
		bubbleSort(arr);
		//selectionSort(arr);
		//insertionSort(arr);
		//mergesort(arr,0,arr.length-1);
		quicksort(arr,0,arr.length-1);
		display(arr);

	}
	
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void bubbleSort(int[] arr) {
		int i,j,cnt,tmp;
		for(j=arr.length-1;j>0;j--) {
			cnt=0;
			for(i=0;i<j;i++) {
				if(arr[i]>arr[i+1]) {
					tmp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tmp;
					cnt++;
				}
			}
			if(cnt==0) break;
		}
	}
	
	public static void selectionSort(int[] arr) {
		int i,j,min;
		for(i=0;i<arr.length;i++) {
			min=i;
			//System.out.println(min);
			for(j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min!=i) {
				int tmp=arr[i];
				arr[i]=arr[min];
				arr[min]=tmp;
			}
		}
	}
	
	public static void insertionSort(int[] arr) {
		int i,j,k;
		for(i=1;i<arr.length;i++) {
			k=arr[i];
			//System.out.println(k);
			for(j=i-1;j>=0 && k<arr[j];j--){
				arr[j+1]=arr[j];
			}
			arr[j+1]=k;
		}
	}
	
	public static void mergesort(int[] arr,int low,int high) {
		int[] temp=new int[arr.length];
		int mid;
		if(low<high) {
			mid=(low+high)/2;
			mergesort(arr,low,mid);
			mergesort(arr,mid+1,high);
			merge(arr,low,mid,mid+1,high,temp);
			copy(arr,temp,low,high);
		}
	}

	
	public static void merge(int[] arr,int low1,int high1,int low2,int high2,int[] tar) {
		int i,j,k;
		i=low1;j=low2;k=low1;
		//System.out.println(i+" "+j+" "+k);
		while(i<=high1 && j<=high2) {
			if(arr[i]<arr[j]) {
				tar[k]=arr[i];
				k++;i++;
			}
			else if(arr[i]>arr[j]) {
				tar[k]=arr[j];
				k++;j++;
			}
			else {
				tar[k]=arr[i];
				i++;j++;k++;
			}
		}
		while(i<=high1) {
			tar[k]=arr[i];
			k++;i++;
		}
		while(j<=high2) {
			tar[k]=arr[j];
			k++;j++;
		}
				
	}
	
	public static void quicksort(int[] arr,int low,int high) {
		int pivotloc;
		if(low<high) {
			pivotloc=partition(arr,low,high);
			quicksort(arr,low,pivotloc);
			quicksort(arr,pivotloc+1,high);
		}
	}
	
	public static int partition(int[] arr,int low,int high) {
		int left,right,pivot,tmp;
		left=low;right=high;pivot=arr[low];
		while(left<=right) {
			while(arr[left]<=pivot && left<right) {
				left++;
			}
			while(arr[right]>pivot) {
				right--;
			}
			if(left<right) {
				tmp=arr[left];
				arr[left]=arr[right];
				arr[right]=tmp;
				right++;left++;
			}
			else
				left++;
		}
		arr[low]=arr[right];
		arr[right]=pivot;
		return right;
	}
	public static void copy(int[] arr,int[] tmp,int low,int high) {
		for(int i=low;i<high;i++) {
			arr[i]=tmp[i];
		}
	}
}
