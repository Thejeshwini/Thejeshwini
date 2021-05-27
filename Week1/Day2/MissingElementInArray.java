package week1.day2.Assignment;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {0,1,2,4,5,7,6,8};
		
		Arrays.sort(arr);
		
		for(int i=0; i< arr.length ;i++) {
			
			if(i != arr[i] ) {
				System.out.println(i);
				System.out.println(arr[i]);
				break;
			}
			//System.out.print(i);
		}

	}

}
