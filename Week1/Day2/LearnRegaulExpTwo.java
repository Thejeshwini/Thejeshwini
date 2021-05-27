package week1.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegaulExpTwo {

	public static void main(String[] args) {
		String companyinfo = "Amzon have 3400 emplyess in 11 states in India";
		
	// to find only numbers form the string
		
		String Pat = "\\d";
		
		Pattern comp = Pattern.compile(Pat);
		
		Matcher match =comp.matcher(companyinfo);
		
		while(match.find()) {
		System.out.println(match.group());
		}
	}

}
