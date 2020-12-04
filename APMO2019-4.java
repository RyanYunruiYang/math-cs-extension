import java.lang.Math;

public class APMO2019.4
{
	static int M = 2019;
	static int N = 2018;

	static double[][] table  = new double[M+2][N+2];
	static double[][] average = new double[M+2][N+2];	

	public static void main(String[] args) {


		initialise()

		replace()

	}

	public static void initialise()
	{
		for (int i=1;i< M+1 ;i++ ) {
			for (int j=1; j < N+1 ;j++ ) {
				table[i][j] = Math.random();
			}
		}
	}

	public static void replace()
	{
		for (int i=1;i< M+1 ;i++ ) {
			for (int j=1; j < N+1 ;j++ ) {
				average[i][j] = (average[i-1][j-1]+average[i-1][j+1]+average[i+1][j-1]+average[i+1][j+1])/4.0;
			}
		}

		for (int i=1;i< M+1 ;i++ ) {
			for (int j=1; j < N+1 ;j++ ) {
				table[i][j] = average[i][j];
			}
		}
	}
}