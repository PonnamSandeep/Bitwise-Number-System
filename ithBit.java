package operators;

public class ithBit {

	public static void main(String[] args) {
		System.out.println(resetithBit(14,3));

	}

	static int findithBit(int num,int i) {
    	return (num>>i-1)&1;
	}
	
	static int setithBit(int num,int i) {
		return num|(1<<(i-1));
	}
	static int resetithBit(int num,int i) {
		return num^(1<<(i-1));
	}

}
