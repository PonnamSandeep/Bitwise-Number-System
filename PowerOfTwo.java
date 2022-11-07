package operators;

public class PowerOfTwo {

	public static void main(String[] args) {
		//only for +ve numbers
		
		int n=1;
		boolean ans;
	    if(n<2) {
	    	ans=false;
	    }
	    else {
		ans=(n&(n-1))==0;
	    }
		System.out.println(ans);

	}

}
