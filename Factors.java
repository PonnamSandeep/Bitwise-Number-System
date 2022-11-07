package secondPart;

import java.util.ArrayList;

public class Factors {

	public static void main(String[] args) {
		factors(36);
	}
	
	static void factors(int n) {
		int i=1;
		ArrayList<Integer> list=new ArrayList<>();
		while(i*i<=n) {
			if(n%i==0) {
				if(n/i==i) {
					System.out.print(i+" ");
				}else {
				System.out.print(i+" ");
				list.add(n/i);
			}
			}
			i++;
		}
		for(int j=list.size()-1;j>=0;j--) {
			System.out.print(list.get(j)+" ");
		}
	}
}