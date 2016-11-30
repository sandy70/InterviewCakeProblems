package com.checkpt.LinkedList;

public class SingleLinkedList
{
	Node head = null;
	
	public SingleLinkedList(){
		
	}
	
	
	public void addNode(int n){
		if(this.head == null){
			this.head = new Node(n);
			return;
		}
		
		Node node = this.head;
		while(node.next != null){
			node = node.next;
		}
		
		Node newNode = new Node(n);
		node.next = newNode;
		
		return;
	}

	public void deleteNode(int n){
		 Node node = getNode(n);
		 
		 if(node ==null){
			return;
		 }
		
		 deleteNode(node);
	}
	
	public void deleteNode (Node n){
		
		if(n == null){
			System.out.println("Invalid node. Delete Failed");
			return;
		}
		
		if(this.head == null){
			System.out.println("Empty List. Delete Failed");
		}
		

		if(n.equals(head)){
			this.head = head.next;
			return;
		}
		
		Node node = this.head;
		while(node.next!=null && !node.next.equals(n)){
			node = node.next;
		}
		
		if(node.next == null && !node.equals(n)){
			System.out.println(n.value + "Node not found. Delete failed");
		}
		
		node.next = node.next.next;
		return;
	}
	public void sortLinkedList(){
		
	}
	
	public void insertNode(){
		
	}
	
	
	public Node getNode(int n){
		if(head == null){
			return null;
		}
		
		if(this.head.value == n){
			return this.head;
		}
		Node node = this.head.next;
		while(node!=null &&  node.value != n){
			node = node.next;
		}
		
		if(node == null){
			System.out.println(n + " Node not found");
			return null;
		}
		
		return node;
	}
	public Node getHead(){
		return this.head;
	}
	
	public Node getKNode(int k){
		Node kNode = null;
		int size = this.getSize();
		
		if(k < 0 || k > size || head == null){
			return kNode;
		}
		
		kNode = head;
		
		for (int i = 0; i < k-1; i++)
		{
			kNode = kNode.next;
		}
				
		return kNode;
	}
	
	public int getSize(){
		int size = 0;
		
		if(head == null){
			return size;
		}
		
		if(head.next == null){
			size++;
			return size;
		}
		size = 1;
		Node n = this.head.next;
		while(n.next!=null ){
			size++;
			n = n.next;
		}
		
		return ++size;
	}
	
	/*
	 * The idea is to have two references to the list and move them at different speeds. Move one forward by 1 node and the other by 2 nodes.
		If the linked list has a loop they will definitely meet.
		Else either of the two references(or their next) will become null.
	 * 
	 * */
	public boolean hasLoop()
	{
		// Iterate with 2 pointers.. If the linked list has a loop they will definitely meet.

		if(this == null || this.head == null || this.head.next == null){
			return false;
		}
		
		
		Node slow= this.head;
		Node fast = this.head;
		
		while(true)
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if( fast.next != null)
			{
				fast.next = fast.next.next;
			}
			else{
				return false;
			}
			
			if(slow == null || fast == null){
				
				return false;
			}
			if ( slow == fast)
			{
				return true;
			}
		}
	}
	public void printListFrom(int i){
		
		if(this.head == null){
			System.out.println("List Empty");
			return;
		}
		
		if(i <0 || i > this.getSize()){
			return;
		}
		
		Node n = getKNode(i);
		StringBuffer buffer = new StringBuffer();
		do{
			buffer.append(n.value).append("->");
			n = n.next;
		}while(n!=null);
		
		System.out.println(buffer.substring(0, buffer.toString().lastIndexOf("->")));
	}
	
	public static void main(String[] args)
	{
		
	}
}
