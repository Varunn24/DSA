import java.util.*;
import java.util.Queue;

public class BinarytreeB {

    //public static void Binarytree(int nodes[]){
        static class node {
        int root;
        node left;
        node right;
                public char[] data;
            
                node(int data){
                    this.root= data;
                    this.left = null;
                    this.right = null;
                }
                    
                }
        
                static class Binarytree {
                static int idx = - 1;
        
                public static node Buildtree(int nodes[]){
                    idx++;
                    
                    if(nodes[idx] ==-1){
                        return null;
                    }
        
                    node newnode = new node(nodes[idx]);
                    newnode.left = Buildtree(nodes);
                    newnode.right= Buildtree(nodes);
                    return newnode;
                }

                public static void preorder(node root){


                    if(root == null ){
                        return ;
                    }
                    System.out.println(root.data + " ");
                    preorder(root.left);
                    preorder(root.right);
                }
                public static void postorder(node root){


                    if(root == null ){
                        return ;
                    }
                    preorder(root.left);
                    preorder(root.right);
                    System.out.println(root.data + " ");
                   
                }

                public static void Bfs(node root){
                    if(root == null){
                        return;
                    }

                    Queue<node> q = new LinkedList<>();
                    q.add(root);
                    q.add(null);

                    while (! q.isEmpty()) {
                        node currnode  = q.remove();
                        if(currnode == null){
                            System.out.println();
                            if(q.isEmpty()){
                                break;
                            }
                            else{
                                q.add(null);
                            }
                        }
                        else{

                            System.out.print(currnode.data + " ");
                            if(currnode.left != null){
                                q.add(currnode.left);

                            }
                            if(currnode.right != null){
                                q.add(currnode.right);

                            }
                            
                        }
                    }


                }

                
                    
                }
            
            public static void main(String[] args) {
                int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
                
                // System.out.println(root.data);

                Binarytree tree = new Binarytree();
                node root = tree.Buildtree(nodes);
                tree.Bfs(root);
        
    }
}
