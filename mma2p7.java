public class mma2p7
{
	static int N = 6*100;
	public static void main(String[] args) {
		int[] a = new int[]{1,0,1,0,1,0};
		for (int i=0; i < N ;i++ ) {
			if (i%6 == 0) {
				print(a);
			}

			a[i%6] = (2*a[(i+1) % 6] - a[(i+2) % 6]+20) % 10;
			
		}
		
	}

	public static void print(int[] a)
	{
		for (int i=0; i < 6 ;i++ ) {
			System.out.print(""+a[i]);
		}
		System.out.println();
	}
}