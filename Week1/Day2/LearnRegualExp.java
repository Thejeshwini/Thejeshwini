package week1.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegualExp {

	public static void main(String[] args) {
		String email = "bauma9@testleaf.com";
						
		String pat = "[a-z0-9]+@[a-z]+.[a-z]{2,3}";
		
		Pattern complier = Pattern.compile(pat); //complies the pattern
		
		Matcher matchers = complier.matcher(email);// match  the pattern with given input
		
		System.out.println(matchers.matches()); // dispalys in boolena format

	}

}
