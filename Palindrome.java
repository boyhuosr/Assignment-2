import java.util.Arrays;
public class Palindrome{


	private static boolean isPalindrome( String string ) {

		// YOUR CODE HERE
		String[] stringArr=string.split("\\.", 0);
		int t = stringArr.length;
		boolean result[];
		result = new boolean[t];
		String stringArr2[];
		stringArr2 = stringArr;
		int result2[];
		result2 = new int[t];
		
		for(int i=0;i<stringArr.length;i++){
			stringArr2[i]=StringUtils.withoutSpecials(stringArr[i]).toUpperCase();
		
			result[i] = stringArr2[i].equals(StringUtils.reverse(stringArr2[i]));
			if(result[i]){result2[i]=1;}
			else{result2[i]=0;}
		}
		//turn to String
		return Arrays.toString(result2);
	}

	public static void palindromes( String string ) {
		
		System.out.println("\nStarting palindromes\n");

		// YOUR CODE HERE
		String[] stringArr=string.split("\\.", 0);
		byte [] newarry = isPalindrome(string).getBytes();
		for(int i=0; i<stringArr.length; i++){
			if(newarry[i]==1){
				System.out.println(stringArr[i]+ "is a Palindrome.");}
			else {
				System.out.println(stringArr[i]+ "is not a Palindrome.");}
		}
		
	}

	public static void main ( String [ ] args ) {

		String input = "a. 0110. madam . Call it a day. nURSes, RUN!!!."
		 + " A man, a plan, a canal, Panama. Was it a car or a cat "
		 + " I saw. No 'x' in Nixon. Break a leg.  Was it Eliot's "
		 + "toilet I saw?";


		palindromes(input);

	}
}