package practice;


public class InsertionSort {
	public void sort(int[] a) {
		
		for(int i=1;i<a.length;i++) {
			int temp=a[i];
			int j=i-1;
			while(j>=0 && temp<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			
			a[j+1]=temp;
		}
		
		
//		for(int i=1;i<a.length;i++) {
//			int j=i;
//			while(j>0) {
//				if(a[j]<a[j-1]) {
//					int swap=a[j];
//					a[j]=a[j-1];
//					a[j-1]=swap;
//				}
//				j--;
//			}
//		}
	}
	
	public static void main(String[] args) {
		//this is a new unsorted array
//		 {5,6,9,3,2,4,44,22,11,52};
	
				int[] a = {4,4,5,5,2};
				
				InsertionSort m = new InsertionSort();
			
				m.sort(a);
				
				for(int i=0;i<a.length;i++) {
					System.out.print(a[i]+" ");
				}
				
	}
}
