package Algorithms;
import java.util.*;

public class Kosaraju {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
    }

    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vist[], Stack<Integer> s){
        vist[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vist[e.dest]){
                topSort(graph, e.dest, vist, s);
            }
        }

        s.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vist[]){
        vist[curr] = true;
        System.out.print(curr + " ");

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vist[e.dest]){
                dfs(graph, e.dest, vist);
            }
        }
    }

    public static void kosarajuAlgo(ArrayList<Edge> graph[], int V){
        // Step 1 - O(V+E)
        Stack<Integer> s = new Stack<>();
        boolean vist[] = new boolean[V];

        for(int i=0; i<V; i++){
            if(!vist[i]){
                topSort(graph, i, vist, s);
            }
        }

        // Step 2 - O(V+E)
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for(int i=0; i<transpose.length; i++){
            vist[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }

        for(int i=0; i<V; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);  //e.src -> e.dest
                transpose[e.dest].add(new Edge(e.dest, e.src));  //e.dest -> e.src
            }
        }

        // Step 3 - O(V+E)
        while(!s.isEmpty()){
            int curr = s.pop();
            if(!vist[curr]){
                dfs(transpose, curr, vist);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;

        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        kosarajuAlgo(graph, v);
    }
}
