package practice;

public class SelectionSort {
	public void selectionSort(int[] a,int i,int j) {
		while(i<j) {
			int index=shortest(a,i,j);
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
			System.out.println(index);
			for(int p=0;p<a.length;p++) {
				System.out.print(a[p]+" ");
			}
			System.out.println();
			
			i++;
			
			selectionSort(a,i+1,j);
			
		}
	}
	
	public int shortest(int[] a,int i,int j) {
		int index=i;
		for(int k=i;k<a.length-1;k++) {
			if(a[index]>a[k]) {
				index=k;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		int[] a= {3,8,2,7,4,1,5};
		SelectionSort obj= new SelectionSort();
		obj.selectionSort(a, 0, a.length-1);
	System.out.println(obj.shortest(a, 0, a.length));
		
	}
}
