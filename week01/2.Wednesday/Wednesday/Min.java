package week1;

import java.util.Arrays;

public class Min {

	int min(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}

	// mogesh da ne izpolzvash gotovi funkcii, a da izpolzvash for() s koito da
	// obhogdash masiava i pri namirane na po-maluk el. ot min.el. da gi
	// swap-nesh
	public static void main(String[] args) {
		Min num = new Min();
		int[] array = new int[] { 3, 4, 5, 1, 3, 6, 7 };
		System.out.println(num.min(array));

	}

}