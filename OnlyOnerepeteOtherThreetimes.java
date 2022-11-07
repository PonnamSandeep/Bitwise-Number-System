package operators;

public class OnlyOnerepeteOtherThreetimes {

	public static void main(String[] args) {
		int[] arr= {2,2,3,2,7,7,8,7,8,8};
		System.out.println(onceRepeat(arr));

	}
	
	static int onceRepeat(int[] arr) {
		int sum=0;
		for(int sum1:arr) {
			sum +=sum1;
		}
		return sum%3;
	}

}
