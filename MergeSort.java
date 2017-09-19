
public class MergeSort implements SortingAlgorithm {
	
	private int[] temp;

	public void sort(int[] a) {
		// TODO Auto-generated method stub
		this.temp = new int[a.length];
		mSort(a, 0, a.length-1);
	}

	private void mSort(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		if(low < high){
			int partition = (low + high) / 2;
			
			mSort(a, low, partition);
			mSort(a, partition+1, high);
			
			merge(a, low, partition, high);
		}
	}

	private void merge(int[] a, int low, int partition, int high) {
		// TODO Auto-generated method stub
		for(int i = low; i <= high; i++){
			temp[i] = a[i];
		}
		
		int i = low;
		int j = partition + 1;
		int k = low;
		
		while(i <= partition && j <= high){
			if(temp[i] <= temp[j]){
				a[k++] = temp[i++];
			}
			else{
				a[k++] = temp[j++];
			}
		}
		
		while(i <= partition){
			a[k++] = temp[i++];
		}
		while(j <= high){
			a[k++] = temp[j++];
		}
		
	}

}
