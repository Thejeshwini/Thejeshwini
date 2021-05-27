package week3.day2.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		//creating empty list
		List<String> listinput = new ArrayList<String>();
		
		//converting array to list
		for (String eachinput : input) {
			listinput.add(eachinput);
		}
		System.out.println("converting to list "+listinput);
		
		
		  //sorting in ascending 
		Collections.sort(listinput);
		  
		  System.out.println(" ascending order " + listinput);		
		
		for (int i= listinput.size()-1 ; i>=0; i--) {
			System.out.println( listinput.get(i));
		}
	}

}
