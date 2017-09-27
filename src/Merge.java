import java.util.*;

public class Merge {
	public static void main(String args[]) {
		Merge Merge = new Merge();
		
		Scanner scanner=new Scanner(System.in);
		int valor=0;
		
		int array[]=new int[5];
		System.out.println("Ingrese valores del array a ordenar: \n");
		for(int i =0;i<array.length;i++) {
			valor=scanner.nextInt();
			array[i]=valor;
		}
		
		Merge.MergeSort(array, 0, array.length-1);
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}
	
	Merge() {
		
	}
	
	public void MergeSort(int array[], int first, int last) {
		int medium;
		if(first<last) {
			medium=(first+last)/2;
			MergeSort(array,first,medium);
			MergeSort(array,medium+1,last);
			Merge(array,first,last,medium);
		}
	}
	
	
	public void Merge(int array[], int first, int last, int medium) {
		
		int i,j,k;
		int temp[]=new int[60];
		i=first;
		k=first;
		j=medium+1;
		
		while(i<=medium && j<=last) {
			if(array[i] < array[j]) {
				temp[k++] = array[i++];
			}
			else {
				temp[k++] = array[j++];
			}
		}
		
		while(i<=medium) {
			temp[k++] = array[i++];
		}
		
		while(j<=last){
			temp[k++] = array[j++];
		}
		
		for(i=first; i<k;i++) {
			array[i] = temp[i];
		}
	}
}
