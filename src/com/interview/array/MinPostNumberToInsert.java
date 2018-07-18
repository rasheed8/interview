package com.interview.array;

/*
 * 
 * Minimum positive integer required to split the array equally
 Given an array of N positive integers, the task is to find the smallest positive integer that can be placed between any two elements of the array such that, the sum of elements in the subarray occurring before it, is equal to the sum of elements occurring in the subarray after it, with the newly placed integer included in either of the two subarrays.

 Examples:

 Input : arr = { 3, 2, 1, 5, 7, 8 }
 Output : 4
 Explanation
 The smallest possible number that can be inserted is 4 between elements 5 and 7
 as part of the first subarray so that the sum of the two subarrays becomes
 equal i.e, 3 + 2 + 1 + 5 + 4 = 15 and 7 + 8 = 15.

 Input : arr = { 3, 2, 2, 3 }
 Output : No Extra Element required
 */
public class MinPostNumberToInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 3, 2 };
		// { 3, 2, 1, 5, 7, 8 };
		// {3,2,3,2};

		int i = 0;
		int j = arr.length - 1;

		int sum_left = arr[0];
		int sum_right = arr[j];
		int diff = Integer.MAX_VALUE;

		while (i < j) {


			if (sum_left == sum_right) {
				diff = 0;
				break;
			}

			if (i > 0 && sum_left < sum_right) {
				sum_left = arr[i] + sum_left;
			}
			if (j < arr.length - 1 && sum_right < sum_left) {
				sum_right = arr[j] + sum_right;
			}
			if (sum_left < sum_right) {

				int extra = sum_right - sum_left;

				diff = extra;

				i++;
			}
			if (sum_left > sum_right) {

			
				j--;
			}

		}
		System.out.println("element to be added--" +diff);

	}

}
