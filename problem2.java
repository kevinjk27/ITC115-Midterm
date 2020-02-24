public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(48));
		System.out.println(isPowerOfTwo(64));
		System.out.println(isPowerOfTwo(47));
		System.out.println(isPowerOfTwo(16));
	}

	public static boolean isPowerOfTwo(int n) {
		if (n == 0 || n < 0) {
			return false;
		}

		while (n != 1) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}
		return true;
	}
}
