
public class BubbleSort implements SortingAlgorithm {

	private boolean swapped;

	public void sort(int[] a) {
		swapped = true;
		
		for(int i = 0; i < a.length-1; i++){
			swapped = false;
			for(int j = 0; j < a.length-1-i; j++){
				if(a[j] > a[j+1]){
					swap(a, j , j + 1);
					swapped = true;
				}
			}
			if (swapped == false)
		        break;
		}
	}

	private void swap(int[] a, int j, int i) {
		// TODO Auto-generated method stub
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}

}
