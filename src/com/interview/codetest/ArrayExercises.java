package com.interview.codetest;

public class ArrayExercises {

	public static void main(String[] args) {
		int[] a = { 3, 2, 5, 1 };
		System.out.println(findIndex(a));
		int[] b = { 1, 1, 1, 1, 0, 4, 0 };
		System.out.println(findIndex(b));
		int[] p = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		barGraph(p);

	}

	private static int findIndex(int[] input) {

		for (int i = 0; i < input.length; i++) {
			int leftSum = 0;
			int rightSum = 0;

			for (int j = 0; j < i; j++)
				leftSum += input[j];

			for (int j = i + 1; j < input.length; j++)
				rightSum += input[j];

			if (leftSum == rightSum)
				return i;

		}

		return -1;
	}

	private static void barGraph(int[] input) {
		int sum = 0;
		int currentSum;
		for (int i = 0; i < input.length; i++) {
			currentSum = 0;
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					int val = input[i] - input[j];
					currentSum = Math.max(currentSum, val);
				}
			}
			sum += currentSum;
		}
		System.out.println(sum);
	}
}
