public class Main {
	public static void main(String[] args) {
		int n = 31;

		for (int i = 0; i < n; i++) {
			int result = gcd(n, i);
			System.out.println(result);
			if (result == 1) {
				System.out.println(i + " is an element of Z_" + n);
			}
		}
	}

	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;

		if (a == b)
			return a;

		if (a > b)
			return gcd(a - b, b);
		return gcd(a, b - a);
	}
}
