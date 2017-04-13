package com.interview.codetest;

public class IntegerOperation implements GenericOperation<Integer, Integer> {

	@Override
	public Integer performOperation(Integer value) {
		return value + 1;
	}

}