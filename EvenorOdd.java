package operators;

public class EvenorOdd {

	public static void main(String[] args) {
		System.out.println(isodd(996));

	}

	static boolean isodd(int i) {
		return (i&1)==1;
	}

}
