import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findTheOodInt {

	public static void main(String[] args) {
		/*DESCRIPTION:
		Given an array of integers, find the one that appears an odd number of times.

		There will always be only one integer that appears an odd number of times.

		Examples
		[7] should return 7, because it occurs 1 time (which is odd).
		[0] should return 0, because it occurs 1 time (which is odd).
		[1,1,2] should return 2, because it occurs 1 time (which is odd).
		[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
		[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).*/

		int[] vet = {1,2,2,3,3,3,4,3,3,3,2,2,1};
		System.out.println(fun(vet));
	}

	public static int fun(int[] num) {
		int[] numbers = num;
		Set set = new HashSet<>();
		for (int x : numbers) {
			set.add(x);
		}
		ArrayList<Integer> digitos = new ArrayList<>(set);
		
		int impar = 0;
		for(int i=0; i<digitos.size();i++) {
			for(int j=0; j<numbers.length; j++) {
				
				if(digitos.get(i) == numbers[j]) {
					impar++;
				}
			}
			if(impar % 2 != 0 ) {
				return digitos.get(i);
			}
		}

		return 0;

	}

}
