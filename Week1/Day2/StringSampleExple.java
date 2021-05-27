package week1.day2.Assignment;

public class StringSampleExple {

	public static void main(String[] args){
		//displays even words o/p
        String s1 = "I am a software Tester";
        
        String[] words = s1.split(" ");
      
        for (int i = 0; i < words.length; i++) {
        System.out.println(words[i]+ "-->"+i);    
        }
        
        for(int i=0; i<words.length; i++) {
        	if(i %2 ==1) {
        		char[] temp = words[i].toCharArray();
        		System.out.println(temp);
        		        		
        	}
        }
    }
}