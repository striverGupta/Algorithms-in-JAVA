package practice;

public class MergeSort{
	
	public void sort(int[] arr,int l,int r) {
		if(l<r) {
			int m = (l+r-1)/2;
			
			sort(arr,l,m);
			sort(arr,m+1,r);
			
			merge(arr,l,m,r);
			
		}
		
	};
	
	public void merge(int[] arr,int l ,int m,int r) {
		int n1=m-l+1;
		int n2=r-m;
		
		//createlsld new array
		int[] arr1= new int[n1];
		int[] arr2= new int[n2];
		
		//copying data
		for(int i=0;i<n1;i++) {
			arr1[i]= arr[i+l];
		}
		
		for(int j=0;j<n2;j++) {
			arr2[j]= arr[j+m+1];
		}
		
		int i=0;
		int j=0;
		int k=l;
		
		while(i<n1 && j<n2) {
			if(arr1[i]<=arr2[j]) {
				arr[k]=arr1[i];
				i++;
			}else {
				arr[k]=arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k]=arr1[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k]= arr2[j];
			j++;
			k++;
		}
		
		
	};
	
	
	public static void main(String[] args) {
		
		//this is a new unsorted array
		int[] a = {5,6,9,3,2,4};
		
		MergeSort m = new MergeSort();
	
		m.sort(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
}


