
public class SimplePigLatin {

	public static void main(String[] args) {
		
		/*DESCRIPTION:
		Move the first letter of each word to the end of it, then add "ay"
		to the end of the word. Leave punctuation marks untouched.
		
		Examples
		pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
		pigIt('Hello world !');     // elloHay orldway !*/
		
		System.out.println(pigIt("Pig latin is cool !"));

	}

	public static String pigIt(String str) {
		
		String[] words = str.split(" ");
		for(int i=0; i<words.length; i++) {
			char last = words[i].charAt(words[i].length() -1);
			if(Character.isLetter(last)) {
				words[i] = words[i].substring(1) + words[i].substring(0, 1) + "ay";
			}
			if(i>=0 && i < words.length -1) {
				words[i] += " ";
			}
		}
		String result= "";
		for(String s : words) {
			result += s;
		}
		
        return result;
    }

}
