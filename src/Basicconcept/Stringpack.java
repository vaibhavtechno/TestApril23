package Basicconcept;

public class Stringpack {
	static int getSumOfAllDigits(String str) {
	 	int sum = 0;
	 	for(int index=0 ; index <= str.length()-1 ; index++ ) {
	 		char ch = str.charAt(index);
	 		 if (Character.isDigit(ch))
	 			 sum = sum + Character.getNumericValue(ch);
	 	
	 	}
	 	System.out.println("sum of all digit --> "+ sum) ;
	 	return sum;
	 	}
	 		
 public static void main(String[]args) {
	String str = "Tech1noc5re7dits";
	 getSumOfAllDigits(str);
}
}
