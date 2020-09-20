package main.java.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* Graph building and print. Graph problem can be done using array or list. Array occupies space, list is better. Adding vertex is O(n2) for array
*/
public class UnDirectedGraphUsingList {
    public static void main(String []a){
        new UnDirectedGraphUsingList().de();
    }

    Map<String, List<Integer>> graph = new HashMap<>();
    public void de(){
        addEdge(0, 1);
        addEdge(0, 4);
        addEdge(1, 4);
        addEdge(1, 3);
        addEdge(1, 2);
        addEdge(3, 2);
        addEdge(3, 4);

        printVertex();
    }

    public void addEdge(int from, int to){
        if(graph.containsKey("" + from) == false){
            graph.put("" + from, new ArrayList<>());
        }
        if(graph.containsKey("" + to) == false){
            graph.put("" + to, new ArrayList<>());
        }
        List<Integer> values = graph.get("" + from);
        values.add((Integer) to);


        List<Integer> toValues = graph.get("" + to);
        toValues.add((Integer) from);
    }

    private void printVertex() {
        for(int i=0; i< graph.size(); i++){
            List<Integer> values = graph.get("" + i);
            System.out.print("Vertex: " + i + " => ");
            for(int j=0; j< values.size(); j++){
                System.out.print(values.get(j) + " -> ");
            }
            System.out.println("");
        }
    }
}
