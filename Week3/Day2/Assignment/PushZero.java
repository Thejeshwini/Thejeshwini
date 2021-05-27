package week3.day2.Assignment;

public class PushZero {
	
	// Function which pushes all zeros to end of an array.
	public static void pushZerosToEnd(int[] num, int n) {
		int count =0;
		
		//Traverse array If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
		for (int i = 0; i < num.length; i++) {
			if(num[i] != 0) {
				
				//	num[0] = num[0]; count = 1
				//  num[1] = num[2]; count = 2
				//  num[2] = num[4]; count = 3
				//  num[3] = num[5]; count = 4
				//  num[4] = num[6]; count = 5
				num[count++] = num[i];		//count is incremented
			}
		}
		// Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
		while(count<n) {
			// count = 5
						// coun t = 6 , < length (8)
						// coun t = 7 , < length (8)
						// coun t = 8 , < length (8) - FALSE
			num[count++] = 0;
			// num[5] = 0, count = 6
						// num[6] = 0, count = 7
						// num[7] = 0, count = 8
			
		}

		/*
		 * for (int j = 0; j < num.length; j++) {
		 * 
		 * System.out.print(num[j] + " "); }
		 */
		
	}
	
	public static void main(String[] args) {
		int[] num = {4,0,3,0,1,5,2,0};
		int n = num.length;
		pushZerosToEnd(num,n);
		for (int i = 0; i < n; i++) {
			System.out.println(num[i]);
			
		}
		
	}

}
