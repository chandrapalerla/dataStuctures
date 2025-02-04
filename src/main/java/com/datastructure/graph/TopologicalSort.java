package com.datastructure.graph;

import java.util.ArrayList;
import java.util.Stack;

import com.datastructure.node.GraphNode;

public class TopologicalSort {

	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

	public TopologicalSort(ArrayList<GraphNode> nodeList2) {
		this.nodeList = nodeList2;
	}

	public void addEdge(int i, int j) {
		GraphNode first = nodeList.get(i - 1);
		GraphNode second = nodeList.get(j - 1);
		first.getNeighbors().add(second);

	}

	public void topologicalSort() {
		Stack<GraphNode>stack = new Stack<>();
		for (GraphNode node : nodeList) { // if a node is unvisited then run topologicalSort on it
			if (!node.isVisited())
				topologicalVisit(node,stack);
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop().getName()+" ");
		}
		
	}

	private void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
		for (GraphNode neighbor : node.getNeighbors()) { // if neighbor is not visited then recursive call to it
			if (!neighbor.isVisited()) {
				topologicalVisit(neighbor, stack);
			}
		}
		node.setVisited(true);
		stack.push(node);

	}

}
