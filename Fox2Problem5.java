import java.lang.Math;


public class Fox2Problem5
{

	/*static int N = 10000;
	public static int gcd(int a, int b)
		{
			if (b==0) {
				return a;
			}
			else{
				return gcd(b,a%b);
			}
		}*/


	public static void main(String[] args) {
		StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.point(0.5, 0.5);
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2, 0.2, 0.8, 0.2);


		/*double x;
		double max = 0;
		int maxInput = -1;
		for (int i=0; i < N ;i++ ) {
			x = gcd(i, (int) Math.sqrt(2*i*i))/(Math.sqrt(i));

			if (x >= max) {
				max = x;
				maxInput = i;
				StdDraw.point(maxInput,max);

			}
		}

		System.out.println(max + " " + maxInput);
		System.out.println((int) Math.sqrt(2*maxInput*maxInput));*/
	}
}