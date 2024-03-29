import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class minimumWireRequiredToConnectAllPC {

    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static class Pair implements Comparable<Pair> {

        int v;
        int nv;
        int wt;

        Pair(int v, int nv, int wt){
            this.v = v;
            this.nv = nv;
            this.wt = wt;
        }

        public int compareTo(Pair p){
            return this.wt - p.wt;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        boolean[] visited = new boolean[vtces];
        findCheapestPath(graph, visited);

    }

    public static void findCheapestPath(ArrayList<Edge>[] graph, boolean[] visited){

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, -1, 0));

        while(pq.size()>0){

            Pair r = pq.remove();

            if(visited[r.v])
                continue;

            visited[r.v] = true;
            if(r.nv!=-1)
                System.out.println("["+r.v+"-"+r.nv+"@"+r.wt+"]");

            for(Edge e : graph[r.v]){
                if(!visited[e.nbr])
                    pq.add(new Pair(e.nbr, r.v, e.wt));
            }
        }
    }
}