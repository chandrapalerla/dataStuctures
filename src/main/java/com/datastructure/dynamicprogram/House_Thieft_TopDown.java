package com.datastructure.dynamicprogram;

public class House_Thieft_TopDown {

	public int maxMoney(int[] HouseNetWorth) {
		int dp[] = new int[HouseNetWorth.length];
		return maxMoney_TopDown(dp, HouseNetWorth, 0);
	}


	private int maxMoney_TopDown(int[] dp, int[] HouseNetWorth, int currentIndex) {
		if (currentIndex >= HouseNetWorth.length)
			return 0;

		if (dp[currentIndex] == 0) {
			int stealCurrent = HouseNetWorth[currentIndex] + maxMoney_TopDown(dp, HouseNetWorth, currentIndex + 2);
			int skipCurrent = maxMoney_TopDown(dp, HouseNetWorth, currentIndex + 1);
			dp[currentIndex] = Math.max(stealCurrent, skipCurrent);
		}
		return dp[currentIndex];
	}
	
	public int findMaxSteal(int[] wealth) {
		int dp[] = new int[wealth.length + 2]; // '+1' to handle the zero house
		dp[wealth.length] = 0; // if there are no houses, the thief can't steal anything
		for (int i = wealth.length - 1; i >= 0; i--) {
			dp[i] = Math.max(wealth[i] + dp[i + 2], dp[i + 1]);
		}
		return dp[0];
	}

	
	public static void main(String[] args) {
		House_Thieft_TopDown ht = new House_Thieft_TopDown();
		int[] HouseNetWorth = {6, 7, 1, 30, 8, 2, 4};
		System.out.println(ht.maxMoney(HouseNetWorth));
		HouseNetWorth = new int[] {20, 5, 1, 13, 6, 11, 40};
		System.out.println(ht.maxMoney(HouseNetWorth));
		
		int[] wealth = { 6, 7, 1, 30, 8, 2, 4 };
		System.out.println(ht.findMaxSteal(wealth));
		wealth = new int[] { 20, 5, 1, 13, 6, 11, 40 };
		System.out.println(ht.findMaxSteal(wealth));
	}
}
