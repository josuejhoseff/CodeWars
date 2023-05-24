import java.util.Arrays;

public class areTheyTheSame {

	public static void main(String[] args) {
		
		
		/*DESCRIPTION:
		Given two arrays a and b write a function comp(a, b) (orcompSame(a, b))
		that checks whether the two arrays have the "same" elements, with the same
		 multiplicities (the multiplicity of a member is the number of times it appears). "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

		Examples
		Valid arrays
		a = [121, 144, 19, 161, 19, 144, 19, 11]  
		b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]*/

		int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = { 121, 14641, 20736, 36100, 25921, 361, 20736, 361 };
		System.out.println(comp(a, b));

	}

	public static boolean comp(int[] a, int[] b) {
		
		if(a==null || b == null || a.length>b.length || b.length>a.length) {
			return false;
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		for(int j=0; j<b.length; j++) {
			b[j]= (int)(Math.sqrt(b[j]));
		}
		
		for(int i=0; i<a.length;i++) {
			
			if(a[i] != b[i] || a[i] <0) {
				return false;
			}
			
		}

		/*for (int n = 0; n < vetA.length; n++) {
			vetA[n] = a[n];
		}
		for (int t = 0; t < vetB.length; t++) {
			vetB[t] = b[t];
		}

		for (int i = 0; i < vetB.length; i++) {
			vetB[i] = Math.sqrt(vetB[i]);
		}

		Arrays.sort(vetA);
		Arrays.sort(vetB);

		for (int j = 0; j < vetA.length; j++) {
			Math.ceil(vetA[j]);
			Math.ceil(vetB[j]);
			if (vetA[j] != vetB[j]) {
				return false;
			}
		}*/

		return true;

	}

}
