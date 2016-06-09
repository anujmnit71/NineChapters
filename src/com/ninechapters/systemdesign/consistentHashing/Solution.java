package com.ninechapters.systemdesign.consistentHashing;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

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
        
        TreeMap<Integer,int[]> map = new TreeMap<Integer, int[]>();
        
		for (int i = 0; i < intArray.length; i++) {			
			int max1 = intArray[i][1] - intArray[i][0];
			if(!map.containsKey(max1)){
			    map.put(max1, intArray[i]);		
			}
		}
		Entry entry = map.lastEntry();
		rt = (int[]) entry.getValue();
		System.out.println(Arrays.toString(rt));
		return rt;
	}
}
