package com.interview.codetest;

public class Queue {

	Node first, last;

	public void enqueue(Node n) {
		if (first == null) {
			first = n;
			last = first;
		} else {
			last.next = n;
			last = n;
		}
	}

	public Node dequeue() {
		if (first == null)
			return null;
		Node temp = new Node(first.value);
		first = first.next;
		return temp;
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(new Node(19));
		q.enqueue(new Node(89));
		q.enqueue(new Node(99));
		q.enqueue(new Node(39));
		System.out.println(q.dequeue().value);
		System.out.println(q.dequeue().value);
	}

}