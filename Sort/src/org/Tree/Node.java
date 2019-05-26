package org.Tree;



public class Node {
	 int data;
	 Node left,right;
	 public Node(int data){
		 this.data = data;
	 }
	 
	 public void insert(int value)
	 {
		 if(value <= data){
			 if (left == null){
				 left = new Node(value);
			 }
			 else {
				 left.insert(value);
			 }
		 }
		 else {
			 if(right == null){
				 right = new Node(value);
			 }
			 else {
				 right.insert(value);
			 }
			 
		 }
	 }
}
