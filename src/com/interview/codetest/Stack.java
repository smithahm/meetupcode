package com.interview.codetest;

public class Stack {

	Node top;

	public void push(Node n) {
		if (n != null) {
			n.next = top;
			top = n;
		}
	}

	public Node pop() {
		if (top == null)
			return null;
		Node tmp = new Node(top.value);
		top = top.next;
		return tmp;

	}

	public Node peek() {
		if (top != null)
			return top;
		return null;

	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(new Node(19));
		s.push(new Node(89));
		s.push(new Node(99));
		s.push(new Node(39));
		System.out.println(s.peek().value);
		System.out.println(s.pop().value);
	}

}