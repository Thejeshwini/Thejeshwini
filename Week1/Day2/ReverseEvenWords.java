package week1.day2.Assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String input = "I want to be software Tester always";
		String[] splitWords = input.split(" ");
		
		for (int i = 0; i < splitWords.length; i++) {
			if(i % 2 == 0) {
				char[] charyarry = splitWords[i].toCharArray();
				for (int j = charyarry.length-1 ; j>=0 ;  j--) {
					System.out.print(charyarry[j]);
				}
				System.out.println(" ");
				
			}else {
				System.out.println(splitWords[i] + " ");
			}
		}
	}

}
