public class mma2p1
{
	//5a+4b+3c+2d+e = 16
	static int N = 16;

	public static void main(String[] args) {
		int counter = 0;
		for (int a = 0;a <= N/5 ;a++ ) {
			for (int b = 0; b <= N/4 ;b++ ) {
				for (int c = 0; c <= N/3;c++ ) {
					for (int d =0;d <= N/2 ;d++ ) {
						for (int e = 0;e <= N/1;e++ ) {
							if (5*a+4*b+3*c+2*d+e == N) {
								counter++;
							}
						}
					}
				}
			}
		}
		System.out.println(counter);
	}
}