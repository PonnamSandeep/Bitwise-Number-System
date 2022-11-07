package operators;

import java.util.Arrays;

public class flipAndInvertImage {

	public static void main(String[] args) {
		int[][] image= {
				{1,1,0},
				{1,0,1},
				{0,0,0}
		};
		int[][] ans=flipAndInvert(image);
		for(int[] arr:ans) {
			String b=Arrays.toString(arr);
			System.out.println(b);
		}
	}
		public static int[][] flipAndInvert(int[][] image){
			for(int[] row:image) {
			//reverse the array
			for(int i=0;i<(image[0].length+1)/2;i++) {
				//swap
				int temp=row[i]^1;
				row[i]=row[image[0].length-i-1]^1;
				row[image[0].length-i-1]=temp;
			}
		}
			return image;
	}

}