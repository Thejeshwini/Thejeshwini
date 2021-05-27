package week3.day2.Assignment;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatCollections {

	public static void main(String[] args) {
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
		
		List<Integer> listData = new ArrayList<Integer>();
		
		for (Integer eachvalue : data) {
			listData.add(eachvalue);
		}
	//	System.out.println(listData);
		
		for (int i = 0; i < listData.size(); i++) {
		int	count = 1;
		
		for (int j = i+1; j < listData.size(); j++) {
			if(data[i] == data[j]) {
				count = count +1;
			}			
			
		}
		if(count>1) {
			System.out.println(data[i]);
		}
		}

	}

}
