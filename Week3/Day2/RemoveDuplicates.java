package week3.day2.classroom;

import java.util.LinkedHashSet;

import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String input = "PayPal India";
		
		//converting to char array
		char[] charinput = input.toCharArray();
		
		//creating empty set
		Set<Character> setchar = new LinkedHashSet<Character>();
		
		//add the array values into set
		for (Character value : charinput) {
			if(value !=' ') {
				setchar.add(value);
			}
		}
		
		System.out.println(setchar);
	}

}
