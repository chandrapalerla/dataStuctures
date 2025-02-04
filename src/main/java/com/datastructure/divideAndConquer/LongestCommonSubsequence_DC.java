package com.datastructure.divideAndConquer;

public class LongestCommonSubsequence_DC {

	public static void main(String[] args) {

		LongestCommonSubsequence_DC lcs = new LongestCommonSubsequence_DC();
		System.out.println(lcs.findLCSLength("houdini", "hdupti"));
	}

	private int findLCSLength(String s1, String s2) {
		return findLCSLengthAux(s1, s2, 0, 0);
	}

	private int findLCSLengthAux(String s1, String s2, int startIndex, int endIndex) {

		if (startIndex == s1.length() || endIndex == s2.length())// Base Case
			return 0;

		int c1 = 0;
		if (s1.charAt(startIndex) == s2.charAt(endIndex)) {
			return c1 = 1 + findLCSLengthAux(s1, s2, startIndex + 1, endIndex + 1);
		}

		int c2 = findLCSLengthAux(s1, s2, startIndex, endIndex + 1);

		int c3 = findLCSLengthAux(s1, s2, startIndex + 1, endIndex);

		return Math.max(c1, Math.max(c2, c3));
	}

}
