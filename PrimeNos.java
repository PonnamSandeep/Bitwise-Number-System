package secondPart;

public class PrimeNos {

	public static void main(String[] args) {
		int n=127;
		sieve(n);
		for(int i=2;i<=n;i++) {
			if(sieve(i)==true) {
				System.out.print(i +" ");
			}
		}

	}
	
	static boolean sieve(int n) {
		int c=2;
		while(c*c<=n) {
			if(n%c==0) {
				return false;
			}
			c++;
		}
		return true;
	}

}
