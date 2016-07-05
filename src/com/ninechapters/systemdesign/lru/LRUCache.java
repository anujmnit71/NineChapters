package com.ninechapters.systemdesign.lru;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
/**
 * Node
 * @author lduan
 *
 */
	private class Node{
		private int key;
		private int value;
		private Node pre;
		private Node next;
		
		public Node(int key, int value, Node pre, Node next) {
			super();
			this.key = key;
			this.value = value;
			this.pre = pre;
			this.next = next;
		}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public Node getPre() {
			return pre;
		}
		public void setPre(Node pre) {
			this.pre = pre;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
		
		
	}
	
	public Node head= new Node(-1,-1,null,null);
	public Node tail= new Node(-1,-1,null,null);
	private Map<Integer, Node> h = new HashMap<Integer, Node>();
	private int capacity=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int get(int key){
		if(!h.containsKey(key)){
			return Integer.MAX_VALUE;
		}	
		int returnValue=h.get(key).getValue();
		moveToTail(h.get(key));
		return returnValue;
	}
	
	private void moveToTail(Node node){
		Node current = node;
		current.pre.next=node.next;
		current.next.pre=node.pre;
		
		Node temp = tail.pre;
		temp.next=node;
		node.pre=temp;
		node.next=tail;
		tail.pre = node;	
	}
	public void set(int key,int value){
		Node node = new Node(key,value,null,null);
		if(h.size()==capacity){	
			h.remove(head.next.value);
			Node temp = head.next.next;
			head.next = temp;
			temp.pre=head;
						
		}
			Node current = head.next; 
			current.pre = node;			
			head.next=node;
			node.pre=head;
			node.next=current;			
			h.put(node.getKey(), node);						
	}
	
	
	public LRUCache(int capacity) {
		super();
		this.capacity = capacity;
		head.next=tail;
		tail.pre=head;
	}
	
	public void pringNode(Node node){
		
		if(node.pre!=null){
			pringNode(node.pre);
		}
			System.out.print(node.value+ " ");
		
		
		
	}

}
