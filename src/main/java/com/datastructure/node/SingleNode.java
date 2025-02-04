package com.datastructure.node;

public class SingleNode {

	private int value;

	private SingleNode nextValue;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public SingleNode getNextValue() {
		return nextValue;
	}

	public void setNextValue(SingleNode nextValue) {
		this.nextValue = nextValue;
	}
	
	@Override
	public String toString() {
		return  value + "";
	}

}
