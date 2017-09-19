
public class SelectionSort implements SortingAlgorithm {

	public void sort(int[] a) {
		// TODO Auto-generated method stub
		for(int start = 0; start < a.length-1; start++){
			int smallest = start;
			for(int next = start + 1; next < a.length; next++){
				if(a[smallest] > a[next]){
					smallest = next;
				}
			}
			swap(a, smallest, start);
		}
	}

	private void swap(int[] a, int smallest, int start) {
		// TODO Auto-generated method stub
		int temp = a[smallest];
		a[smallest] = a[start];
		a[start] = temp;
	}

}
