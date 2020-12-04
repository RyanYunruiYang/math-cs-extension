import java.lang.Math;
public class powersMod
{
	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		int p = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);

		print(p,m);
	}

	public static void print(int power,int mod){
		for (int i=0;i<mod-1 ;i++ ) {
			System.out.println((Math.pow(i,power)) % mod);
		}
	}
}