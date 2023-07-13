import java.util.ArrayList;

public class CycleDetection1 {
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

        graph[1].add(new Edge(1,0));
            
        graph[2].add(new Edge(2,3));
            
        graph[3].add(new Edge(3,0));
    }

   public static boolean isCycleDirected(ArrayList<Edge> graph[], boolean vist[], int curr, boolean rec[]){
        vist[curr] = true;
        rec[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dest] == true){
                return true;
            }
            else if(vist[e.dest] == false){
                if(isCycleDirected(graph, vist, e.dest, rec)){
                    return true;
                }
            }
        }

        rec[curr] = false;
        return false;
   }

    public static void main(String[] args) {
        int v = 4;
        
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        // for diconnected components
        boolean vist[] = new boolean[v];
        boolean rec[] = new boolean[v];
        for(int i=0; i<v; i++){
            if(!vist[i]){
                boolean isCycle  = isCycleDirected(graph, new boolean[v], 0, new boolean[v]);
                if(isCycle == true){
                    System.out.println(isCycle);
                    break;
                }
            }
        }

        // for normal graph
        System.out.println(isCycleDirected(graph, new boolean[v], 0, new boolean[v]));

    }
}
