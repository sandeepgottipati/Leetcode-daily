class Solution {
 public int maxSumAfterPartitioning(int[] arr, int k) {
		Integer[] memo = new Integer[arr.length];
		return maxSumAfterPartitioning_memo(arr, k, 0, memo);
	}

	private int maxSumAfterPartitioning_memo(int[] arr, int k, int i, Integer[] memo) {
		if (i == arr.length) {
			return 0;
		}
		if (memo[i] != null) {
			return memo[i];
		}

		int currMax = 0;
		int sumMax = 0;
		for (int j = 0; j < k; j++) {
			int to = i + j;
			if (to >= arr.length) {
				break;
			}
			currMax = Math.max(currMax, arr[to]);
			sumMax = Math.max(sumMax, (currMax * (j + 1)) + maxSumAfterPartitioning_memo(arr, k, to + 1, memo));
		}
		return memo[i] = sumMax;
	}
}

