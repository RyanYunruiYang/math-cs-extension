public class mmahw4p1
{
	static int N = 2;
	static int[][] board = new int[N][N];
	static int counter = 0;


	public static void main(String[] args) {
		addNode();
		System.out.println(counter);
	}

	public static void addNode()
	{
		if (gameOver()) {
			counter++;
		}		
		else {
			for (int i =0;i<N ;i++ ) {
				for (int j =0;j<N ;j++ ) {
					if (board[i][j] != 0) {
					board[i][j] = 1;
					}
					addNode();
					board[i][j] = 0;
				}
			}
		}
	}

	public static boolean gameOver()
	{
		for (int i =0;i<N-1 ;i++ ) {
			for (int j =0;j < N-1 ;j++ ) {
				if (2 != board[i][j] + board[i+1][j+1]+ board[i+1][j] + board[i][j+1]) {
					return false;
				}
			}
		}

		return true;
	}


}