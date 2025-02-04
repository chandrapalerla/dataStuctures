package com.datastructure.graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

import com.datastructure.node.WeightedNode;

public class PathFindingByDijkstra {

	ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

	public PathFindingByDijkstra(ArrayList<WeightedNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addWeightedEdge(int i, int j, int Distance) {
		WeightedNode first = nodeList.get(i-1);
		WeightedNode second = nodeList.get(j-1);
		first.getNeighbors().add(second);
		first.getWeightMap().put(second, Distance);
	}

	public void dijkstra(WeightedNode node) {
		PriorityQueue<WeightedNode> queue = new PriorityQueue<WeightedNode>();
		// This will make sure that we start from this vertex in priority queue as
		// distance is min
		node.setDistance(0);
		queue.addAll(nodeList);
		while (!queue.isEmpty()) {
			// remove node with minimum distance from queue
			WeightedNode presentNode = queue.remove();
			for (WeightedNode neighbor : presentNode.getNeighbors()) { // for each neighbor
				if (queue.contains(neighbor)) { // if neighbor is not visited
					// if 'known distance' of neighbor is greater than new path then,
					// update 'distance' of neighbor
					// and also new parent as presentNode
					if (neighbor
							.getDistance() > (presentNode.getDistance() + presentNode.getWeightMap().get(neighbor))) {
						neighbor.setDistance((presentNode.getDistance() + presentNode.getWeightMap().get(neighbor)));
						neighbor.setParent(presentNode);
						// Refresh the Priority Queue
						queue.remove(neighbor);
						queue.add(neighbor);
					} // end of if block
				}
			}
		}

		// print table of node with minimum distance and shortest path from source
		for (WeightedNode nodeToCheck : nodeList) {
			System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.getDistance() + ", Path: ");
			pathPrint(nodeToCheck);
			System.out.println();
		}

	}

	private void pathPrint(WeightedNode node) {
		if (node.getParent() != null) {
			pathPrint(node.getParent());
			System.out.print("->" + node);
		} else
			System.out.print(node);

	}

}
