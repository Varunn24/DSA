import java.util.ArrayList;

public class Graph2 {
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

    public static void allpath(ArrayList<node> graph [] , int src , int dest , String path){
        if(src == dest){
            System.out.print(path+dest);
            return;
        }

        for(int i = 0 ; i < graph[src].size() ; i++){
            node n = graph[src].get(i);
            allpath(graph, n.dest, dest, path);
            return;
        }
    }

    public static void main(String[] args) {
        int v = 7 ;
        ArrayList<node> graph [] = new ArrayList[v];
        creategraph(graph);

        int src = 0 , dest = 5;
        allpath(graph, src, dest, "");
    }
}
