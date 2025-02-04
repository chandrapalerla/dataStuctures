package com.datastructure.graph;

import java.util.ArrayList;

import com.datastructure.node.GraphNode;

public class TopologicalSortMain {

	public static void main(String[] args) {
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
		
		//create 10 nodes: v1-v10
		for(int i=1;i<11; i++) {
			nodeList.add(new GraphNode("V"+i));
		}
		
		
		//Constructor
		TopologicalSort topsort = new TopologicalSort(nodeList);
			
		topsort.addEdge(1, 2);
		topsort.addEdge(1, 4);
		topsort.addEdge(2, 3);
		topsort.addEdge(2, 5);
		topsort.addEdge(3, 6);
		topsort.addEdge(3, 10);
		topsort.addEdge(4, 7);
		topsort.addEdge(5, 8);
		topsort.addEdge(6, 9);
		topsort.addEdge(7, 8);
		topsort.addEdge(8, 9);
		topsort.addEdge(9, 10);
  
        System.out.println("Following is a Topological " + 
                           "sort of the given graph"); 
        topsort.topologicalSort(); 

	}

}
