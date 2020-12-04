import java.lang.Math;


public class Fox25
{

	static int N = 10000000;
	public static int gcd(int a, int b)
		{
			if (b==0) {
				return a;
			}
			else{
				return gcd(b,a%b);
			}
		}


	public static void main(String[] args) {
		/*StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLUE);

        StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, 3);*/


		double x;
		int g;//
		double max = 0;
		int maxInput = 0;

		double pmax = -1;
		int pInput = -1;
		
		for (int i=1; i < N ;i++ ) {
			//x = gcd(i, (int) (Math.sqrt(2)*i))/Math.sqrt(i);
			g = (int) (Math.sqrt(2)*i);
			x = gcd(i,g)/Math.sqrt(i);			

			if (x >= max) {
				/*pmax = max;
				pInput = maxInput;*/

				max = x;
				maxInput = i;
				//StdDraw.line((double) maxInput,max,(double) pInput, pmax);

			}
		}

		System.out.println(max + " " + maxInput);
		System.out.println((int) Math.sqrt(2)*maxInput);
	}
}