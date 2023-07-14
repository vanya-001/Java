import java.util.*;

public class Cycle {
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

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,4));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,2));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,4));
    }

    public static boolean hasCycleUndirected(ArrayList<Edge> graph[], boolean vist[], int curr, int parent){
        vist[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vist[e.dest] == true && e.dest != parent){
                return true;
            }
            else if(!vist[e.dest]){
                if(hasCycleUndirected(graph, vist, e.dest, curr) == true){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 6;

        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        System.out.println(hasCycleUndirected(graph, new boolean[v], 0, -1));
    }
}