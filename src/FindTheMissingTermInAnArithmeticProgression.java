
public class FindTheMissingTermInAnArithmeticProgression {

	public static void main(String[] args) {
		int[] array = {20, 130, 240, 350, 460, 570, 680, 790, 900, 1120, 1230, 1340};
		System.out.println(findMissing(array));

	}
	public static int findMissing(int[] numbers) {
		int result =0;
		
		int r = 0;
		
		for(int i=0; i<numbers.length -1 ;i++) {
			r = numbers[i +1] - numbers[i];
		}
		
		return result;
	}

}
