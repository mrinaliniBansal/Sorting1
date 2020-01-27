import java.util.Arrays;
import java.util.Scanner;

public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int arr[] = new int[7];
		int n = arr.length;
		System.out.println("enter elements: ");
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
	    for (int i = 0; i < n-1; i++) {
	        for (int j = 0; j < n-i-1; j++) {
	            if (arr[j] > arr[j+1])
	            {
	                // swap temp and arr[i]
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	        }

	}
	 System.out.println(Arrays.toString(arr));   
	 

	}

}
