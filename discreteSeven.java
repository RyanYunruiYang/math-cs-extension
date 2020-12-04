public class discreteSeven
{
	public static void main(String[] args) {
		int counter = 0;
		int N = 1000;
		for (int a = 0;a < N ;a++ ) {
			for (int b = 0;b < a ;b++ ) {
				for (int c = 0;c < b ;c++ ) {
					if (a+b+c+a*b+b*c+a*c == a*b*c+1) {
						counter++;
						System.out.println(a + " " + b + " " + c);
					}
				}
			}	
		}
		System.out.println("counter: " + counter);
	}
}