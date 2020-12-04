import java.lang.Math;

public class p14 {
	public static void main(String[] args) {
		double q = 0.25;
		double x = (q-sind(1)*sind(1))*(q-sind(3)*sind(3))*(q-sind(9)*sind(9));
		System.out.println(x);
		double d = 1;
		double n = 0;
		for (int a = 1;a<90 ;a++ ) {
			for (int b = 1;b<90 ;b++ ) {
				double dif = frac(sind(a)/sind(b)/x);
				//System.out.println(dif);
				if (dif <= d) {
					d = dif;
					System.out.println("works");
					System.out.println(sind(a)/sind(b)/x);
					System.out.println(a +"" + b);
				}
			}	
		}
		System.out.println(n);
	}

	public static double sind(int deg) {
		return Math.sin(deg/180.0 * Math.PI);
	}

	public static double frac(double x)
	{
		return x - (int) x;
	}

}