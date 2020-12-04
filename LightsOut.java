public class LightsOut
{
	public static void main(String[] args) {
		int n =2
		squareBoard(n*n);
	}

	public static void squareBoard(int s)
	{
		int[] matrix = new int [s*s][s*s]

		for (int i =0;i<s*s ;i++ ) {
			for (int j = 0;j <s*s ;j++ ) {
				matrix[i][j] = 0;
			}
		}

		for (int c = 0;c < s*s ;c++ ) {
			matrix[c][c] =1; //no matter what clicking the square will flip itself
			//if it's in a corner
			if (c == 0 || c == s-1 || c == s*s-s || c = s*s-1) {
				
			}
			// if it's on an edge
			else {
				matrix[c-1][c] = 1;
				matrix[c+1][c] = 1;
				matrix[c+s][c] = 1;
				matrix[c-s][c] = 1;

			}
		}
	}

	
}