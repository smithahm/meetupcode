package com.interview.codetest;

public interface GenericOperation<A, B> {
	B performOperation(A value);
}