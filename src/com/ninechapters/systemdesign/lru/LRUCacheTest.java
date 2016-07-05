package com.ninechapters.systemdesign.lru;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LRUCacheTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGet() {
		LRUCache l = new LRUCache(3);
		l.set(1,11);
		l.set(2, 22);
		l.set(3,33);
		System.out.println( " ");
		l.pringNode(l.tail);
		l.get(3);
		System.out.println( " ");
		l.pringNode(l.tail);
		
		
	}

	//@Test
	public void testSet() {
		LRUCache l = new LRUCache(2);
		l.set(1,11);
		l.set(2, 22);
		l.pringNode(l.tail);
		l.set(3, 33);
		System.out.println( " ");
		l.pringNode(l.tail);
		//l.set(3, 33);
	}

//	@Test
//	public void testLRUCache() {
//		fail("Not yet implemented");
//	}

}
