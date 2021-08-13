import java.util.Scanner;

class LCM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		System.out.print(lcm(number1, number2));
	}

	public static int lcm(int x, int y) {
		int gcd = 1, lcm;

		for (int i = 1; i <= x && i <= y; i++) {
			if (x % i == 0 && y % i == 0) {
				gcd = i;
			}
		}
		lcm = (x * y) / gcd;
		return lcm;
	}
}