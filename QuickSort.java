package practice;

public class QuickSort {
	public void quickSort(int[] arr,int l,int h) {
		if(l<h) {
			int j = partition(arr,l,h);
			
			quickSort(arr,l,j);
			quickSort(arr,j+1,h);
			
		}
	}
	
	private int partition(int[] arr,int l,int h) {
		int pivot=arr[l];
		int i=l;
		int j=h;
		
		while(i<j) {
			while(pivot>arr[i]) {
				i++;
			}
			
			while(pivot<arr[j]) {
				j--;
			}
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		
		int temp=pivot;
		pivot=arr[j];
		arr[j]=temp;
		
		
		return j;
	}
	
	public static void main(String[] args) {
		int[] a= {3,8,2,7,4,9,5};
		QuickSort obj= new QuickSort();
		obj.quickSort(a, 0, a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
