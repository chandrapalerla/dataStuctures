package com.datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;

import com.datastructure.node.GraphNode;

public class PathFindingByBFS {

	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

	public PathFindingByBFS(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addUndirectedEdge(int i, int j) {

		GraphNode first = nodeList.get(i);
		GraphNode second = nodeList.get(j);

		first.getNeighbors().add(second);
		second.getNeighbors().add(first);
	}

	public void BFSForSSSP(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
		queue.add(node);
		while (!queue.isEmpty()) {
			GraphNode presentNode = queue.remove();
			presentNode.setVisited(true);
			System.out.print("Printing path for node " + presentNode.getName() + ": ");
			pathPrint(presentNode);
			System.out.println();
			for (GraphNode neighbor : presentNode.getNeighbors()) { // for each neighbor of present node
				if (!neighbor.isVisited()) {
					queue.add(neighbor);
					neighbor.setVisited(true);
					neighbor.setParent(presentNode);
				} // end of if
			} // end of for loop

		}
	}

	private void pathPrint(GraphNode node) {
		if (node.getParent() != null) {
			pathPrint(node.getParent()); // recursive call to parent
			System.out.print(node + " ");

		}

	}

}
