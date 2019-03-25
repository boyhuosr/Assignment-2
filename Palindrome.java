public class Palindrome{


	private static boolean isPalindrome( String string ) {

		// YOUR CODE HERE
		
			string=StringUtils.withoutSpecials(string).toUpperCase();
		
			return string.equals(StringUtils.reverse(string));
		
	}

	public static void palindromes( String string ) {
		
		System.out.println("\nStarting palindromes\n");

		// YOUR CODE HERE
		String[] stringArr=string.split("\\.", 0);
		
		for(int i=0; i<stringArr.length; i++){
			if(isPalindrome(stringArr[i])){
				System.out.println(stringArr[i]+ " is a Palindrome.");}
			else {
				System.out.println(stringArr[i]+ " is not a Palindrome.");}
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
