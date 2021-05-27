package week1.day2.Assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
	String input1 = "stops";
	String input2 ="potss";
	
	//int str1len = input1.length();
	//int str2len = input2.length();
	
	char[] ch1 = input1.toCharArray();
	//System.out.println(ch1);
	char[] ch2 = input2.toCharArray();
	
	Arrays.sort(ch1);
//	System.out.println(ch1);
	Arrays.sort(ch2);
	
	//if length is equal then checks its anagram or not
	if (input1.length() == input2.length()) {
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");
		}else
		{
			System.out.println("Not an Anagram");
		}
	//if not equal prints its not a valid string	
	}else {
		System.out.println("Not valid string");
	}
		
	}

}
