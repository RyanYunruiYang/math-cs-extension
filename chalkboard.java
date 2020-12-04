public class chalkboard
{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double h_sum = 0;
		//double harmonic_series = 0;
		double l_sum = 0;
		for (int i =1;i<n ;i++ ) {
			h_sum += 1.0/divisorsFunction.divCount(i);
			l_sum += divisorsFunction.divCount(i);
	//		harmonic_series += 1/i;
		
// 			//System.out.println(i+": "+1.0/divisorsFunction.divCount(i));
// 			if (i%100 == 0) {
// //				System.out.println(i+":  HM: "+i/h_sum + "AM: "+l_sum/i);
// 				System.out.println(l_sum*h_sum/i/i);				
// 				//System.out.println(i+": "+harmonic_series/i);	
// 			}
			

		}
		//System.out.println(h_sum);
		System.out.println(l_sum*h_sum/n/n);				

	}
}

//800000: 0.15214749237106207
