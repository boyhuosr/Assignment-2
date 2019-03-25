public class StringUtils{

	public static String upperCase(String string){

		// YOUR CODE HERE
		return string.toUpperCase();
	}


	public static String withoutSpecials(String string){

		// YOUR CODE HERE
		return string.replaceAll("[^0-9a-zA-z]", "");
	}

	public static String reverse(String string){

		// YOUR CODE HERE
		// Using getBytes() method to convert string into bytes[]
		byte [] stringnew = string.getBytes();
		byte [] result = new byte [stringnew.length];
		for (int i=0; i<stringnew.length; i++){
			result[i] = stringnew[stringnew.length-i-1];
		}
		return new String(result);
	}

	public static int numberOfWords(String string){

		// YOUR CODE HERE
		if (string == null || string.isEmpty()){
			return 0;
		}
		//Split the string
		
		String[] words = string.split("\\s+", 0);
		//Find out how many blanks in the array
		int number=0;
		for(int i=0; i<words.length; i++){
			if(words[i].equals(" ")){
				number++;
			}
		}
		return words.length-number;
	}

	public static String[] splitSentences(String string){

		// YOUR CODE HERE
		return string.split("\\.", 0);
	}

}