package com.ninechapters.systemdesign.consistentHashing;

import java.util.ArrayList;
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
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		List<Integer> machine = new ArrayList<Integer>();
		machine.add(0);
		machine.add(359);
		machine.add(1);
		results.add(machine);
		for (int i = 1; i < n; ++i) {
			List<Integer> new_machine = new ArrayList<Integer>();
			int index = 0;
			for (int j = 1; j < i; ++j) {
				System.out.println("j is " + j+" minus is "+ (results.get(j).get(1) - results.get(j).get(0) + 1));
				System.out.println("index is " + index+" minus is "+ (results.get(index).get(1) - results.get(index).get(0) + 1));				
				if (results.get(j).get(1) - results.get(j).get(0)  > results
						.get(index).get(1) - results.get(index).get(0) ) {
					index = j;
					System.out.println("index change is " + index);
				} else {
					System.out.println("index doesn't change");
				}
			}

			int x = results.get(index).get(0);
			int y = results.get(index).get(1);
			results.get(index).set(1, (x + y) / 2);

			new_machine.add((x + y) / 2 + 1);
			new_machine.add(y);
			new_machine.add(i + 1);
			results.add(new_machine);
		}
		return results;
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
		int[] rt = { 0, 0 };
		int rtValue = 0;

		TreeMap<Integer, int[]> map = new TreeMap<Integer, int[]>();

		for (int i = 0; i < intArray.length; i++) {
			int max1 = intArray[i][1] - intArray[i][0];
			if (!map.containsKey(max1)) {
				map.put(max1, intArray[i]);
			}
		}
		Entry entry = map.lastEntry();
		rt = (int[]) entry.getValue();
		System.out.println(Arrays.toString(rt));
		return rt;
	}
}
