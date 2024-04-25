package TCS;


public class Lighthouse {
public static void main(String[] args) {
	int arr[] = {5,2,1,1,8,2};
	int ans[] = new int[arr.length-1];
	
	for(int i = 0; i<arr.length-1; i++) {
		int j=i+1;
		ans[i]=Math.abs(arr[i]-arr[j]);
	}
	int count = 0;
	for (int i = 0; i < ans.length; i++) {	
		if(ans[i] <= 1)
			count++;
	}
	System.out.println(count);
		
	
}
}
