package TCS;

public class Session3_subarray {
	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3, 1, 3 };
		int arr[] = { 2, 2, 3, 2, 3,4,5,8,7,5,4,5,7,12,2 };
		int size = arr.length;
		int segment = 3;
		System.out.println("size "+size);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int nosize = size / segment;
		int j = 0;
		int sindex = 0;
		for (int i = 0; i <nosize; i++) {

			while (j < sindex + segment) {
				min = Math.min(min, arr[j]);
				j++;
			}
			sindex = j;
			max = Math.max(max, min);
		}
		System.out.println(max);

	}
}
