
public class numNarcisist {

	public static void main(String[] args) {
		/*DESCRIPTION:
		A Narcissistic Number is a number that equals the sum of each of its digits
		raised to the number of digits. For example, 153 is a Narcissistic Number
		because 1^3 + 5^3 + 3^3 = 153.

		You will be given an integer num and are to return true if the integer 
		is a Narcissistic Number and false if it is not.*/

		System.out.println(isNarcissistic(153));

	}

	public static boolean isNarcissistic(int x) {
		int aux = x; // valor auxiliar para mexer em x sem alterar este
		int n = 0;

		
		while (aux != 0) {
			n++;
			aux /= 10;
		}

		aux = x;
		int sum = 0;

		while (aux != 0) {
			int d = aux % 10;
			sum += Math.pow(d, n);

			aux /= 10;
		}

		return sum == x;
	}

}
