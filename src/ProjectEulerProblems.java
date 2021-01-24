
public class ProjectEulerProblems {

	public static void main(String[] args) {

		//int sum = sumMultiplesOfThreeOrFive(1000);
		
		double sum = sumMultiplesOfThreeOrFiveMath(1000);
		
		System.out.println(sum);
	}

	private static int sumMultiplesOfThreeOrFive(int upperLimit) {

		int sum = 0;

		for (int i = 0; i < upperLimit; i += 3) {
			sum = sum + i;

		}

		for (int i = 0; i < upperLimit; i += 5) {
			sum = sum + i;

		}

		return sum;

	}

	// A more efficient way

	// private static int sum(int n) {
	// 1+ 2 +3+...
	// 3+6+9+....999 = 3. (1+2+3+.....333)
	// 3. n(n+1)/2
	// 3 . 333.334/2= 166833
	// 5. 199.200/2= 99500

	// }

	private static double sumMultiplesOfThreeOrFiveMath(double limit) {

		double sum = 0;
		
		//sum for 3
		//for (int i = 0; i < limit; i += 3) {
		//sum = sum + i;

		sum = 3 * 333.334/2;
		return sum;
		
		
		//sum for 5
		// 5 . 199.200/2= 99500
		
	}

}
