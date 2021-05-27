package week1.day2;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		//sorting to ascending order
		Arrays.sort(data);	
		
		//to print all data values using loop
		for(int i= 0; i <= data.length-1 ; i++) {
		System.out.println(data[i]);		
		}
		
		int lastSecond = data.length-2 ;
		//prints second largest number
		System.out.println(data[lastSecond]);
	}

}
