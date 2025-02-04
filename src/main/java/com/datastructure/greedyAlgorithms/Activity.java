package com.datastructure.greedyAlgorithms;

public class Activity {

	private int startTime;

	private int finishTime;

	private String name;

	// Constructor
	public Activity(String name, int startTime, int finishTime) {
		this.name = name;
		this.startTime = startTime;
		this.finishTime = finishTime;
	}

	@Override
	public String toString() {
		return "Activity :" + name + ", start time = " + startTime + ", finish time = " + finishTime;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
