import java.util.*;

// Topological Sorted Order

public class TopologyOrder {
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

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

    }

    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vist[], Stack<Integer> stack){
        vist[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vist[e.dest]){
                topSort(graph, e.dest,vist,stack);
            }
        }

        stack.push(curr);
    }

    public static void topOrder(ArrayList<Edge> graph[], int v){
        boolean vist[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<v; i++){
            if(!vist[i]){
                topSort(graph, i, vist, stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int v = 6;

        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        topOrder(graph, v);
    }
}
