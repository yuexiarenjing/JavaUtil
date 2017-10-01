package sort;

public class HeapSort {
	private static void AdjustHeap(int[] a, int s, int len) {
		int temp = a[s];
		int child = s*2+1;
		while(child < len) {
			if(child+1 < len && a[child] < a[child+1]) {
				++child;
			}
			if(a[s] < a[child]) {
				a[s] = a[child];
				s = child;
				child = 2*s+1;
			} else {
				break;
			}
			a[s] = temp;
		}
	}
	
	private static void BuildHeap(int[] a, int len) {
		for (int i = len/2 - 1; i >= 0; i--) {
			AdjustHeap(a, i, len);
		}
	}
	
	public static void heapSort(int[] a, int len) {
		BuildHeap(a, len);
		for (int i = len-1; i > 0; i--) {
			int temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			AdjustHeap(a, 0, i);
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {3,1,5,7,2,4,9,6,10,8 };
		heapSort(a, a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
