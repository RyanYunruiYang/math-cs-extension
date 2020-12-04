public class GCD
{
	/*public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int a = console.nextInt();
		int b = console.nextInt();

		System.out.println(gcd(a,b));
		System.getProperty();
	}*/

	public static void main(String[] args) {
		int counter = 0;
		for (int a = 1;a< 1000;a++ ) {
			for (int b =1 ; b < 1000 ;b++ ) {
				if (lcm(a,b+1)==lcm(b,a+3)) {
					counter++;
					System.out.printf("a: %d, b: %d \n",a,b);
					
					if (a != 3*b) {
						System.out.println("UNUSUAL");
					}
				}
			}
		}

		System.out.println(counter);
	}

	public static int lcm(int a, int b)
	{
		if (a<b) {
			return a*b/gcd(a,b);
		}
		return a*b/gcd(b,a);
	}

	public static int gcd(int a, int b)
	{
		if (b==0) {
			return a;
		}
		else{
			return gcd(b,a%b);
		}
	}
}