package com.ninechapters.systemdesign.consistentHashing;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> consistentHashing(int n) {
		// Write your code here
		return null;
	}

	public int[][] splitInt(int start, int end, int serverNu1, int serverNu2) {
		int[][] rt = new int[2][3];
		// int count=0;
		// for(int i=0; i<=end;i++){
		// count++;
		// }
		// System.out.println("count "+count);
		int split = (start + end) / 2;
		rt[0][0] = start;
		rt[0][1] = split;
		rt[0][2] = serverNu1;

		System.out.println("1 " + (split - start));

		rt[1][0] = split + 1;
		rt[1][1] = end;
		rt[1][2] = serverNu2;
		System.out.println("2 " + (end -= split + 1));
		System.out.println(Arrays.deepToString(rt));
		return rt;
	}

	public int[] getMinIntArray(int[][] intArray) {
		int[] rt = {0,0};
        int rtValue = 0;
		for (int i = 0; i < intArray.length; i++) {
			int temp = i;
			
			int min1 = intArray[i][1] - intArray[i][0];
			int min2 = intArray[i++][1] - intArray[i++][0];
			if (min1 <= min2&&rtValue>min1) {
				rt = intArray[temp];
				rtValue=min1;
			} else if(rtValue>min2) {
				rt = intArray[temp + 1];
				rtValue=min2;
			}else{
			   System.out.println("Keep value");
			}
		}
		System.out.println(Arrays.toString(rt));
		return rt;
	}
}
