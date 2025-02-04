package com.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMofication {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		for (Integer integer : list) {

			System.out.println(integer);
			// concurrent modification exception avoid the this exception use
			// CopyOnWriteArrayList
			// class instead of Arraylist class but program will execute will get
			// ArrayIndexOutOfBoundsException
			// list.remove(1);
		}
		Map<Integer, String> map1 = new ConcurrentHashMap<Integer, String>();

		map1.put(1, "chandu");
		map1.put(2, "shekar");

		Set<Integer> keys = map1.keySet();

		for (Integer integer : keys) {
			System.out.println("key::" + integer + "value:::" + map1.get(integer));
			
			
			map1.remove(integer);
		}

	}

}
