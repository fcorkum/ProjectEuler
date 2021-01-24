package projecteuler;

public class ProjectEulerProblems {

	public static void main(String[] args) {

		int sum = sumMultiplesOfThreeOrFive(1000);
		System.out.println("Problem 1: sum of multiples of 3 or 5, up 1K = " + sum);

		int sumFib = sumEvenFibonacci(4000000);
		System.out.println("Problem 2: sum of even Fibonacci numbers, up to 4M = " + sumFib);

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

	// A more efficient way - math based

	// private static int sum(int n) {
	// 1+ 2 +3+...
	// 3+6+9+....999 = 3. (1+2+3+.....333)
	// 3. n(n+1)/2
	// 3 . 333.334/2= 166833
	// 5. 199.200/2= 99500

	// }

	private static int sumEvenFibonacci(int n) {

		int sum = 2;
		int prevFib = 2;
		int prevPrevFib = 1;
		int currentFib = 0;

		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 2;
		}

		for (int i = 3; (prevFib + prevPrevFib) < n; i++) {
			
			currentFib = prevFib + prevPrevFib;
			if ((currentFib % 2) == 0) {
				sum = sum + currentFib;
			}
			prevPrevFib = prevFib;
			prevFib = currentFib;

		}

		return sum;

	}

}
