import Stack.stack;

import java.util.Queue;
import java.util.*;

public class BinarytreeA {
    static class node{
        int data;
        node left , right ; 
        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int Hight(node root){
        if(root == null){
            return 0 ;
        }
        int lh = Hight(root.left);
        int rh = Hight(root.right);
        int ans = Math.max(lh, rh)+1;
        return ans;
    }

    public static int Count(node root){
        if(root == null){
            return 0 ;

        }
        int Lcount = Count(root.left);
        int Rcount = Count(root.right);
        int mycount = Lcount + Rcount + 1 ;
        return mycount;

    }

    public static int Daimeter(node root){
        if(root == null){
            return 0 ;
        }

        int Ldaim = Daimeter(root.left);
        int Rdaim = Daimeter(root.right);
        int Lhigh = Hight(root.left);
        int Rhigh = Hight(root.right);

        int selfdaime = Rhigh + Lhigh + 1;

        int ans = Math.max(Math.max(Rdaim, Ldaim), selfdaime);
        return ans ;

    }

    // static class  info {
    //     int daim ;
    //     int hi;
    //     public info(int daim , int hi){
    //         this.daim = daim;
    //         this.hi = hi;
    //     }
        
    // }
    // public static info Daimeter2(node root ){

    //     if(root == null){
    //         return new info(0, 0);
    //     }

    //     info Leftinfo = Daimeter2(root.left);
    //     info rightinfo = Daimeter2(root.right);

    //     int daim = Math.max(Math.max(Leftinfo.daim, rightinfo.daim),(Leftinfo.hi + rightinfo.hi)+1 );
    //     int hi = Math.max(Leftinfo.hi, rightinfo.hi)+1;

    //     return new info(daim, hi);
    // }

    public static boolean isidentical(node node , node subroot){
        if(node == null && subroot == null){
            return true;
        }
        else if(node == null || subroot == null){
            return false;
        }

        if(!isidentical(node.left, subroot.left)){
            return false;
        }
        if(!isidentical(node.right, subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean issubroot(node root , node subroot){
        if(root == null){
            return false;
        }

        if(root.data == subroot.data){
            if(isidentical(root , subroot)){
                return true ;
                // boolean lsub = issubroot(root.left, subroot);
                // boolean rsub = issubroot(root.right, subroot);

               

            }
        }
        return issubroot(root.right, subroot) ||issubroot(root.left, subroot);
    }


    static class Info{
        int hd;
        node Node ;
        public Info(int hd , node Node){
            this.hd = hd ;
            this.Node = Node;
        }

    }

     public static void topView(node root) {
        if (root == null) {
            return;
        }

        Queue<Info> q = new LinkedList<>();
        Map<Integer, node> map = new HashMap<>();

        int min = 0, max = 0;

        q.add(new Info(0, root));

        while (!q.isEmpty()) {
            Info curr = q.poll();

            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.Node);
            }

            if (curr.Node.left != null) {
                q.add(new Info(curr.hd - 1, curr.Node.left));
                min = Math.min(min, curr.hd - 1);
            }

            if (curr.Node.right != null) {
                q.add(new Info(curr.hd + 1, curr.Node.right));
                max = Math.max(max, curr.hd + 1);
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void Kthlevel(node root , int leval , int k ){
        if(root == null){
            return;
        }
        if(leval == k){
            System.out.print(root.data);
            return;
        }
        Kthlevel(root.left, leval+1, k);
        Kthlevel(root.right, leval+1, k);
    }

    public static boolean getpath(node root ,int n , ArrayList<node> path){
        if(root == null){
            return false;
        }

        path.add(root);

        if(root.data == n){
            return true;
        }

        boolean getlrft = getpath(root.left, n, path);
        boolean getright = getpath(root.right, n, path);

        if(getlrft || getright){
            return true;

        }
        path.remove(path.size()-1);
        return false;

    }

    public static node lca(node root , int n1 , int n2){

        ArrayList<node> path1 = new ArrayList<>();
        ArrayList<node> path2 = new ArrayList<>();

        getpath(root,n1,path1);
        getpath(root,n2,path2);

        int i = 0 ;
        for(; i < path1.size() & i < path2.size() ; i++){
            if(path1.get(i) != path2.get(i)){
                break ;

            }

            
        }
        node lac = path1.get(i-1);
        return lac;
    }

    public static node lca2(node root , int n1 , int n2 ){
        if(root == null || root.data == n1 || root.data == n2){ // root are only present 
            return root;
        }

        node leftlca2 = lca2(root.left, n1, n2);    //update left
        node rightlca2 = lca2(root.right, n1, n2); // update right 

        if(rightlca2 == null){// right side is null then lca is present is leftside
            return leftlca2;
        }
        if(leftlca2 == null){//left side is null then lca is present in right side
            return rightlca2;
        }

        return root;  // lca not present in both lrft and right side then lca is root
    }



    public static int Distence(node root , int n){
        if(root == null){
            return -1 ;
        }
        if(root.data == n){
            return 0 ;

        }
        int leftdi = Distence(root.left, n);
        int rightdi = Distence(root.right, n);

        if(leftdi == -1 || rightdi == -1 ){
            return -1 ;
        }
        else if(leftdi == -1){

            return rightdi+1;
        }
        else{
            return leftdi+1;
        }

    
    }
    public static int maxdistance(node rrot , int n1 , int n2){
        node Lca =lca2(rrot, n1, n2);

        int dist1 = Distence(Lca,n1);
        int dist2 = Distence(Lca, n2);

        return dist1+dist2;
    }

    public static int kthancester(node root , int n , int k){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0 ;
        }

        int leftdi = kthancester(root.left, n, k);
        int rightdi = kthancester(root.right, n, k);

        if(leftdi == -1 && rightdi == -1){
            return - 1;

        }

        int max = Math.min(leftdi, rightdi);

        if(max+1 == k){
            System.out.println(root.data + " ");
        }
        return max+1;
    }  //transform tree 

    public static int transformtree(node root){
        if(root == null){
            return 0 ;
        }

        int leftchild = transformtree(root.left);
        int rightchild = transformtree(root.right);

        int data = root.data;
        root.data = root.left.data + leftchild + root.right.data + rightchild ;

        return data ;
    }

    public static void priorder(node root ){
        System.out.print(root.data+ " ");
        priorder(root.left);
        priorder(root.right);
    }
    public static void main(String[] args) {

        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        // int k = 2 ;
        // int n1 = 4 ;
        // int n2 = 7;

    //     node subroot = new node(2);
    //     subroot.left = new node(4);
    //     subroot.right = new node(5);

    //     System.out.println(Hight(root));
    //     System.out.println(Count(root));
    //     System.out.println(Daimeter(root));
    //    // System.out.println(Daimeter2(root).daim);
    //     System.out.println(issubroot(root, subroot));
    //     topView(root);
    //     Kthlevel(root, 0, k);
        // System.out.println(lca(root, n1, n2).data);
        // System.out.println(lca2(root, n1, n2).data);
        // System.out.println(maxdistance(root, n1, n2));


        // int n = 5 , k = 1;
        // System.out.println(kthancester(root, n, k));

        System.out.println(transformtree(root));
        priorder(root);
        

        
    }
}
