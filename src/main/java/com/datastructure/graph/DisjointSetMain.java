package com.datastructure.graph;

import java.util.ArrayList;

import com.datastructure.node.WeightedNode;

public class DisjointSetMain {

	public static void main(String[] args) {

		ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();
		

		// create 10 nodes: 1-10
		for (int i = 0; i < 10; i++) {
			nodeList.add(new WeightedNode("" + (char) (65 + i)));
		}

		// Calling DisjointSet
		DisjointSet.driver(nodeList);
	}

}
