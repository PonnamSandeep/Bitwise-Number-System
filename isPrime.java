package secondPart;

public class isPrime {

	public static void main(String[] args) {
		int n=15;
		for(int i=1;i<=n;i++) {
			System.out.println(i+" "+prime(i));
		}
	}
	
	static boolean prime(int n) {
//		if(n<=1) {
//			return false;
//		}
//		int c=2;
//        while(c*c<=n) {
////        	System.out.println(c);
//    	   if(n%c==0) {
//    		   return false;
//    	   }
//    	   c++;
//       }
//		return true;
//   }
		
		if(n<=1) {
			return false;
		}
		int i=2;
		while(i*i<=n) {
			if(n%i==0) {
				return false;
			}
			i++;
		}
		return true;
}
}
