import java.util.ArrayList;

public class Graph {
    static class node{
        int surc;
        int dest;
        // int wt;

        public node(int s , int d ){

            this.surc = s ; 
            this.dest = d ; 
            // this.wt = w ; 
        }
    }

    static void creategraph(ArrayList<node> [] graph){
        for(int i = 0 ; i < graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new node(0, 1));
        graph[0].add(new node(0, 2));

        graph[1].add(new node(1, 0));
        // graph[1].add(new node(1, 2, 1));
        graph[1].add(new node(1, 3));

        graph[2].add(new node(2, 0));
        graph[2].add(new node(2, 4));

        graph[3].add(new node(3, 1));
        graph[3].add(new node(3, 5));
        graph[3].add(new node(3, 4));

        graph[4].add(new node(4, 3));
        graph[4].add(new node(4, 5));
        graph[4].add(new node(4, 2));
        
        graph[5].add(new node(5,3));
        graph[5].add(new node(5,4));

        graph[6].add(new node(6, 5));

    }

    public static void dfs(ArrayList<node> graph [], int curr , boolean vis[]){
        System.out.print(curr + " ");
        vis[curr] = true ;

        for(int i = 0 ; i < graph[curr].size() ; i++ ){

            node e = graph[curr].get(i);
            if(!vis[e.dest]){

                dfs(graph, e.dest , vis);
            }
        }
    }


    public static void calindeg(ArrayList<node> graph [] , int indeg[]){
        for(int i = 0 ; i < graph.length ; i++){
            int v = i ; 
            for(int j = 0 ; j < graph[v].size() ; j++){
                node n = graph[v].get(j);
                indeg[n.dest]++;
            }
        }
    }
    public static void topsort(ArrayList<node> graph[] ){
        int indeg = new int[graph.length];
        Queue<Integer> q = new Linkedlist<>();

        for(int i = 0 ; i < indeg.length ; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        while (!q.isEmpty()) {

            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i = 0 ; i < graph[curr].size() ;i++){
                node n = graph[curr].get(i);
                indeg[n.dest]--;

                if(indeg == 0){
                    q.add(n.dest);
                }

            }

        }
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<node>[] graph = new ArrayList[v];
        creategraph(graph);
        dfs(graph, 0, new boolean[v]);

        

        // for(int i = 0 ; i < graph[2].size() ; i++){
        //     node n = graph[2].get(i);
        //     System.out.println(n.dest);
        // }




    }
}
