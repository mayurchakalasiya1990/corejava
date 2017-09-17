public class ArmStrong {
	static long x, y, z = 0, n;

	public static long Armstrong(long number) {
		//System.out.println("number:"+number);
		if (number == 0)
			return 0;
		else
			y = number % 10;
		//System.out.println("x :"+x );
		x = y * y * y;
		z += x;
		n = number / 10;
		return Armstrong(n);

	}

	public static void main(String[] args) {
		for (int i = 1; i <= 500; i++) {
			Armstrong(i);
			//System.out.println("i:"+i+" z:"+z);
			if (i == z) {
				System.out.println("Number " + i + " is Armstrong number");
			}
			x=0;
			y=0;
			z = 0;
			n=0;
		}
	}
}