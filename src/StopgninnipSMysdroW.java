
public class StopgninnipSMysdroW {

	public static void main(String[] args) {
		//*Write a function that takes in a string of one or more words,
		//and returns the same string, but with all five or more letter
		//words reversed (Just like the name of this Kata). Strings passed in will
		//consist of only letters and spaces. Spaces will be included only when more
		//than one word is present.

		//Examples:
		
		//spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
		//spinWords( "This is a test") => returns "This is a test" 
		//spinWords( "This is another test" )=> returns "This is rehtona test"
		
		String st = "Hey fellow warriors";
		
		System.out.println(spinWords(st));

	}
	
	public static String spinWords(String sentence) {
		
		String[] vet = sentence.split(" ");
		String result ="";
		for(int i=0; i<vet.length; i++) {
			if(vet[i].length() >= 5) {
				StringBuilder reverse = new StringBuilder(vet[i]);
				vet[i] = reverse.reverse().toString();
			}
			if(i> 0 && i< vet.length) {
				vet[i] = " " + vet[i];
			}
			
			result += vet[i];
		}
		
		
		return result;
	}

}
