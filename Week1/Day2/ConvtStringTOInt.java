package week1.day2.Assignment;

public class ConvtStringTOInt {

	public static void main(String[] args) {
		String cost1 = "Rs.3000";
		String cost2 = "Rs.4000";
		int sum =0;
		
		String replaceCost1 = cost1.replaceAll("\\D", "");
		//System.out.println(replaceCost1);
		
		String replaceCost2 = cost2.replaceAll("\\D", "");
	//	System.out.println(replaceCost2);
		
		int parscost1 = Integer.parseInt(replaceCost1);
	//	System.out.println(parscost1);
		
		int parscost2 = Integer.parseInt(replaceCost2);
		
		sum = parscost1 + parscost2 ;
		
		System.out.println("addding cost1 and cost2  : " + sum);
		
		
	}

}
