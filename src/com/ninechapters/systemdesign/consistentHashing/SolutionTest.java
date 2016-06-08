package com.ninechapters.systemdesign.consistentHashing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
	Solution s = new Solution();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSplitInt() {
		s.splitInt(0, 359, 1,2);
	}
	/**
	 * [
  	[0,179,1],
  	[180,359,2]		]
	for n = 3, return
	[
  		[0,89,1]
  		[90,179,3],
  		[180,359,2]
	]
	 */
	@Test
	public void testSplitInt2() {
		s.splitInt(0, 179, 1,3);
	}
	
	
	@Test
	public void test() {
		int[][] testValue = {{0, 89, 1},{180, 359, 2},{90, 179, 3}}; 
	  int[] rt = 	s.getMinIntArray(testValue);
	  System.out.println(Arrays.toString(rt));
	}
	

}
