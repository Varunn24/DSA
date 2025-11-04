import java.util.ArrayList;

import Stack.stack;

public class BST {

    static class Node{
        int data;
        Node left ;
        Node right;
        public Node(int data){
            this.data = data;
        }

    }

    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data < val){
            root.right = insert(root.right, val);

        }
        else{
            root.left= insert(root.left, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " "  );
        inorder(root.right);
    }

    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }


    public static Node FindinorderSuceesor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node Delete(Node root , int key){
        if(root.data > key){
            Delete(root.left, key);
        }
        else if(root.data < key){
            Delete(root.right, key);
        }
        else{
            if(root.left == null && root.right == null){ //no node connrct in last node 

                return null;
        }
        if(root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.right;
        }

        Node is = FindinorderSuceesor(root.right);
        root.data = is.data;
        root.right = Delete(root.right, is.data);

        
    }
    return root;
}

public static void ptintInrange(Node root , int k1 , int k2){
    if(root == null){
        return;
    }

    if(root.data >= k1 &&  root.data<= k2){

        ptintInrange(root.left, k1, k2);
        System.out.println(root.data + " ");
        ptintInrange(root.right, k1, k2);
    }
    else if(root.data > k2){
        ptintInrange(root.right, k1, k2);
    }
    else{
        ptintInrange(root.left, k1, k2);
    }
}

public static void pripath(ArrayList<Integer> path){
    for(int i = 0 ; i < path.size (); i++){

        System.out.print(path.get(i) + "->");
    }
    System.out.println("null");
}
 public static void Printpath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            pripath(path);
        }

        Printpath(root.left, path);
        Printpath(root.right, path);

        path.remove(path.size() - 1);
    }

public static boolean isVailid(Node root , Node min , Node max){
    if(root == null){
        return true;
    }
    if(min!= null && min.data >= root.data){

        return false;
    }
    else if(max != null && max.data <= root.data){
        return false;
    }

    return isVailid(root.left, min, root)
    && isVailid(root.right, root, max);
}

public static Node Mirror(Node root){
    if(root == null){
        return null;
    }

    Node lefts = Mirror(root.left);
    Node rights = Mirror(root.right);

    root.left = rights;
    root.left = lefts ;

    return root ;

}

public static void priorder(Node root){
    if(root == null){
        return ;
    }

    System.out.print(root.data + " ");
    priorder(root.left);
    priorder(root.right);
}

public static Node CreateBst(int arr[] , int st , int end){
    if(st > end){
        return null;
    }
    int mid = (st+end)/2;
    Node root = new Node(arr[mid]);
    root.left = CreateBst(arr, st, mid-1);
    root.right = CreateBst(arr, mid+1, end);

    return root ;

}

public static void Inorder(Node root , ArrayList<Integer> inorder){
    if(root == null){
        return;
    }

    Inorder(root.left, inorder);
    inorder.add(root.data);
    Inorder(root.right, inorder);
}

public static Node BalanceBST(Node root){

    // inorder seqeunce
    ArrayList <Integer> inorder = new ArrayList<>();
    Inorder(root, inorder);

    // create bst in sorted from
    CreateBst(null, 0, inorder.size()-1);

    return root ;

}
    public static void main(String[] args) {
        // int vlaues[] = {5,1,3,2,4,7};
        // Node root = null;
        // for(int i = 0 ; i < vlaues.length ; i++){
        //      root = insert(root, vlaues[i]);
        // }

        // inorder(root);
        // System.out.println();
        // if(search(root, 11)){
        //     System.out.println("is found");
        // }
        // else{
        //     System.out.println("not found");
        // }

        // root = Delete(root, 7);
        // inorder(root);

        // int k1 = 5 , k2 = 12;
        // ptintInrange(root, k1, k2);

        // Printpath(root, new ArrayList<>());
        // if(isVailid(root, null, null)){

        //     System.out.println("is vaild BST");
        // }
        // else{
        //     System.out.println(" is not vaild");
        // }

        // Node Root = Mirror(root);
        // priorder(Root);

        // int arr[] = {3,5,6,8,10,11,12};
        // Node root = CreateBst(arr, 0, arr.length-1);
        // priorder(root);

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = BalanceBST(root);
        priorder(root);
    }
}
