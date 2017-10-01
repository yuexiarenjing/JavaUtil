package sort;

public class QuickSort {
	
	private static void swap(int[] a, int low, int high) {
		int temp = a[low];
		a[low] = a[high];
		a[high] = temp;
	}
	
	private static int partion(int[] a, int low, int high) {
		int temp = a[low];
		while( low < high) {
			while(low < high && a[high] >= temp) --high; 
			swap(a, low, high);
			while(low < high && a[low] <= temp) ++low; 
			swap(a, low, high);
		}
		return low;
	}
	
	public static void quickSort(int[] a, int low, int high) {
		if(low < high) {
			int mid = partion(a, low, high);
			quickSort(a, low, mid-1);
			quickSort(a, mid+1, high);
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {3,1,5,7,2,4,9,6,10,8 };
		quickSort(a, 0, a.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
