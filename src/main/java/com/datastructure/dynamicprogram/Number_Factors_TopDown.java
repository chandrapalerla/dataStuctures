package com.datastructure.dynamicprogram;

public class Number_Factors_TopDown {

	public static void main(String[] args) {

		System.out.println("How many ways to ofgenrate given value using 1,3,4");

		// divide and conquer method
		System.out.println(wayToGenNumFactors(4));
		System.out.println(wayToGenNumFactors(5));
		System.out.println(wayToGenNumFactors(6));

		// Dynamic programming using to-down approach
		
		System.out.println("To- down operations");

		int dp[] = null;

		System.out.println(wayToGenNumFactorsTopDown(4, dp));
		System.out.println(wayToGenNumFactorsTopDown(5, dp));
		System.out.println(wayToGenNumFactorsTopDown(6, dp));
		
		System.out.println("Bottom Up operations");
		System.out.println(waysToGetNBottomUp(4));
		System.out.println(waysToGetNBottomUp(5));
		System.out.println(waysToGetNBottomUp(6));
	}

	private static int waysToGetNBottomUp(int n) {
		int dp[] = new int[n + 1];
		dp[0] = dp[1] = dp[2] = 1; // BaseCases
		dp[3] = 2; // BaseCases

		for (int i = 4; i <= n; i++)
			dp[i] = dp[i - 1] + dp[i - 3] + dp[i - 4];

		return dp[n];
	}

	private static int wayToGenNumFactorsTopDown(int n, int[] dp) {
		dp = new int[n + 1];
		// base condition
		if (n == 0 || n == 1 || n == 2)
			return 1;
		if (n == 3)
			return 2;
		if (dp[0] == 0) {
			int c1 = wayToGenNumFactors(n - 1);
			int c2 = wayToGenNumFactors(n - 3);
			int c3 = wayToGenNumFactors(n - 4);

			dp[n] = c1 + c2 + c3;
		}

		return dp[n];

	}

	private static int wayToGenNumFactors(int n) {
		// base condition
		if (n == 0 || n == 1 || n == 2)
			return 1;
		if (n == 3)
			return 2;

		int c1 = wayToGenNumFactors(n - 1);
		int c2 = wayToGenNumFactors(n - 3);
		int c3 = wayToGenNumFactors(n - 4);

		return c1 + c2 + c3;
	}

}
