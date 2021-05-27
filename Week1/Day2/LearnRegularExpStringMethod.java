package week1.day2;

public class LearnRegularExpStringMethod {

	public static void main(String[] args) {
		// String literal
		String companyInfo = "Amazon have 53000  employes in 27 states acrros in India";
		
		// How to get only num to displayed delete other words
		String replaceAll = companyInfo.replaceAll("\\D", "");
	//	System.out.println(replaceAll);
		
		//How to find how many words are avaliable in the sentence?
		//count all string other than white spaces
		String[] printwords =companyInfo.split("\\s+");
		//prints the lenght of the white spaces
		System.out.println(printwords.length);
		for (String everyword : printwords) {
			//prints all the words form the string
		//	System.out.println(everyword);
		}
		
		
	}

}
