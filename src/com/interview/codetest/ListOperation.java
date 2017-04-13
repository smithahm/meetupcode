package com.interview.codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperation {

	public List<Integer> updateList(List<Integer> value, GenericOperation<Integer, Integer> operation) {

		List<Integer> toReturn = new ArrayList<Integer>(value.size());

		for (Integer i : value) {
			toReturn.add(operation.performOperation(i));
		}
		return toReturn;
	}

	public static void main(String[] args) {
		ListOperation l = new ListOperation();
		List<Integer> result = l.updateList(Arrays.asList(10, 12, 14, 16, 18, 20, 22, 24), new IntegerOperation());
		for (Integer i : result) {
			System.out.print(i + " ");
		}
	}
}