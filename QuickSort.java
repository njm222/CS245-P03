
public class QuickSort implements SortingAlgorithm {

	public void sort(int[] a) {
		// TODO Auto-generated method stub
		qSort(a, 0, a.length-1);
	}

	private void qSort(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		if(low < high){
			int parti = partition(a, low, high);
			
			qSort(a, low, parti-1);
			qSort(a, parti, high);
		}		
	}

	private int partition(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		int i = low;
		int j = high;
		int pivot = (low + high) / 2;
		
		while(i <= j){
			
			while(a[i] < a[pivot])
				i++;
			
			while(a[j] > a[pivot])
				j--;
			
			if(i <= j){
				if(pivot == i)
					pivot = j;
				else if(pivot == j)
					pivot = i;
				swap(a, i++, j--);
			}
		}
		return i;
	}

	private void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
