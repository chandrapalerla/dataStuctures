package com.datastructure.queue;

public class QueueByArrayMain {

	public static void main(String[] args) {
		
		System.out.println("Creating an empty queue...");
		QueueByArray array = new QueueByArray(5);
		
		System.out.println("Enqueuing 5 values in the queue...");
		for(int i=1;i<=5;i++) {
			array.enQueue(i*10);
		}
		
		System.out.println("Peek value from queue...");
		array.peekOperation();
		
		System.out.println("Dequeue 6 values from queue...");
		for (int i = 0; i <= 4; i++) {
			array.deQueue();
		}

		System.out.println("Deleting the entire Queue...");
		array.deleteQueue();
	}
	
	

}
