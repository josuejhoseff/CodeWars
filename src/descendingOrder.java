import java.util.Arrays;
import java.util.Collections;

public class descendingOrder {

	public static void main(String[] args) {
		
		/*DESCRIPTION:
		Your task is to make a function that can take any non-negative integer 
		as an argument and return it with its digits in descending order. 
		Essentially, rearrange the digits to create the highest possible number.
		
		Examples:
		Input: 42145 Output: 54421
		
		Input: 145263 Output: 654321
		
		Input: 123456789 Output: 987654321*/
		
		int test = 42145;
		System.out.println(verificar(test));
	}
	
	public static int verificar(int number) {
		
		Integer[] digitos = new Integer[String.valueOf(number).length()];
		
		for(int i=0; i<digitos.length; i++) {
			digitos[i] = number % 10;
			number /= 10;
		}
		
		String str="";
		Arrays.sort(digitos, Collections.reverseOrder());
		
		for(Integer x : digitos) {
			str += x;
		}
		int result = Integer.parseInt(str);
		return result;
		
	}

}
