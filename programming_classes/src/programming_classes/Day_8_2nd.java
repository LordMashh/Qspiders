package programming_classes;

public class Day_8_2nd {
public static void main(String[] args) {
	// 48. WAJP to merge two arrays
	int[] a = {2,3,5,7,3,2,7,2,7,2};
	int[] b = {6,4,9,3,10};
	int[] c = new int[a.length + b.length];
	int j = 0;
	for (int i = 0; i < c.length; i++) {
		if(i < a.length) {
			c[i] = a[i];
		}else {
			c[i]= b[j];
			j++;
		}
			
	}
	System.out.println("After Merging, Printing the new array c ");
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i] + " ");
	}
	System.out.println();
	
	// 49. WAJP to find frequency of array elements.
	System.out.println("Printing frequency of array elements : ");
for (int i = 0; i < a.length; i++) {
	int count = 1;
	for (int k = i+1; k < a.length; k++) {
		if (a[i] == a[k] && a[i] != Integer.MAX_VALUE) {
			count++;
			a[k] = Integer.MAX_VALUE;
		}
	}
	if (a[i] != Integer.MAX_VALUE) {		
		System.out.println(a[i] + " is repeated by " + count);
	}
}	
	
// 
	
	
}
}
