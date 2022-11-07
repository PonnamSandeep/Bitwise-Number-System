package operators;

public class OnlyOneRepetetion {

	public static void main(String[] args) {
		int[] arr= {2,3,4,1,2,1,3,6,4};
		System.out.println(duplicateNo(arr));

	}

	static int duplicateNo(int[] arr) {
		int ans=0;
		for(int n:arr) {
			ans^=n;
		}
		return ans;
	}
	
	

}
