import java.lang.Math;

public class APMO2019p4
{
	static int M = 19;
	static int N = 18;
	static int iterations = 10000;

	static double[][] table  = new double[M+2][N+2];
	static double[][] average = new double[M+2][N+2];	

	public static void main(String[] args) {


		initialise();

		for (int i=0;i< iterations ;i++ ) {
			replace();
		}

		printArray();

	}

	public static void printArray()
	{
		for (int i=1;i< M+1 ;i++ ) {
			for (int j=1; j < N+1 ;j++ ) {
				System.out.printf("%.5f+\t",table[i][j]);
			}
			System.out.println();
		}
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
				average[i][j] = (table[i-1][j-1]+table[i-1][j+1]+table[i+1][j-1]+table[i+1][j+1])/4.0;
			}
		}

		for (int i=1;i< M+1 ;i++ ) {
			for (int j=1; j < N+1 ;j++ ) {
				table[i][j] = average[i][j];
			}
		}
	}


}