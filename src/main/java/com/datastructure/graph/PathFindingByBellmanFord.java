package com.datastructure.graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

import com.datastructure.node.WeightedNode;

public class PathFindingByBellmanFord {
	ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

	public PathFindingByBellmanFord(ArrayList<WeightedNode> nodeList) {
		this.nodeList = nodeList;
		for (WeightedNode aNode : nodeList) {
			aNode.setDistance(Integer.MAX_VALUE / 10);
		}
	}

	public void addWeightedEdge(int i, int j, int distance) {
		WeightedNode first = nodeList.get(i - 1);
		WeightedNode second = nodeList.get(j - 1);

		first.getNeighbors().add(second);
		first.getWeightMap().put(second, distance);

	}

	public void bellmanFord(WeightedNode sourceNode) {
		sourceNode.setDistance(0); // set source distance to zero
		for (int i = 0; i < nodeList.size(); i++) { // repeat n-1 times
			for (WeightedNode presentNode : nodeList) { // for each Vertex
				// if distance of neighbor is greater than tentative new path then
				// update distance of neighbor with new parent as presentNode
				for (WeightedNode neighbor : presentNode.getNeighbors()) {
					// if distance of neighbor is greater than tentative new path then
					// update distance of neighbor with new parent as presentNode
					if (neighbor
							.getDistance() > (presentNode.getDistance() + presentNode.getWeightMap().get(neighbor))) {
						neighbor.setDistance((presentNode.getDistance() + presentNode.getWeightMap().get(neighbor)));
						neighbor.setParent(presentNode);
					}
				}

			}

		}
		System.out.println("Checking for Negative Cycle ...");
		// for each edge check if update possible, if true then negative cycle is there
		// report error
		for (WeightedNode presentNode : nodeList) {
			for (WeightedNode neighbor : presentNode.getNeighbors()) {
				// if distance of neighbor is greater than tentative new path then we have a
				// negative cycle, return from here..
				if (neighbor.getDistance() > (presentNode.getDistance() + presentNode.getWeightMap().get(neighbor))) {
					System.out.println("Negative cycle found: \n");
					System.out.println("Vertex Name: " + neighbor.getName());
					System.out.println("Old Distance: " + neighbor.getDistance());
					int newDistance = presentNode.getDistance() + presentNode.getWeightMap().get(neighbor);
					System.out.println("New distance: " + newDistance);
					return;
				}
			}
		} // end of loop
		System.out.println("Negative cycle not found !");
		// Print table of node with minimum distance and shortest path from source
		System.out.println("\n\nPrinting Paths now: ");
		for (WeightedNode nodeToCheck : nodeList) {
			if (nodeToCheck.getDistance() != Integer.MAX_VALUE / 10) {
				System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.getDistance() + ", Path: ");
				pathPrint(nodeToCheck);
			} else {
				System.out.print("No path for node " + nodeToCheck);
			}
			System.out.println();
		}

	}

	private void pathPrint(WeightedNode node) {

		if (node.getParent() != null) {
			pathPrint(node.getParent());
			System.out.print("->" + node);
		} else
			System.out.print(node);
	}// end of loop

}
