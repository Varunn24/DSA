public class AVL {
    static class Node{
        int data , height;
        Node left , right ;

        public Node(int data ){
            this.data = data ;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root){
        if(root == null){
            return 0 ;
        }
        return root.height;
    }

    static int max (int a , int b){
        return(a > b) ? a : b;
    }

    public static int grtbalance(Node root){
        if(root == null){
            return 0 ;
        }
        return height(root.left) - height(root.right);
    }


    public static Node rightRotate(Node y){
        Node x = y.right;
        Node t2 = x.left;

        x.left = y ;
        y.right = t2;

        x.height = max(height(x.left), height(x.right))+1;
        y.height = max(height(y.left) , height(y.right))+1;

        return x ;
    }
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node t2 = y.left;

        y.left = x ;
        x.right = t2;

        x.height = max(height(x.left), height(x.right))+1;
        y.height = max(height(y.left) , height(y.right))+1;

        return y ;
    }
    public static Node insert(Node root , int key){
        if(root == null){
            return new Node(key);
        }
        if(root.data > key){
            root.left = insert(root.left, key);
        }
        else if(root.data < key){
            root.right = insert(root.right, key);
        }
        else{
            return root ;
        }
        root.height = 1+ Math.max(height(root.left), height(root.right));

        int bf = grtbalance(root);


        // LL rotation
        if(bf > 1 && key < root.left.data){
            return rightRotate(root);
        }

        //RR rotatiom
        if(bf < -1  && key > root.right.data){
            return leftRotate(root);
        }

        // left rifht roatation
        if(bf > 1&& key> root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // right left rotation
        if(bf < -1 && key < root.right.data){
            root.right  = rightRotate(root.right);
            return leftRotate(root);
        }

        return root ; // returend avl is balanced
    }

    public static void priorder(Node root ){


        if(root == null){
            return ;
        }
        System.out.println(root.data + " ");
        priorder(root.left);
        priorder(root.right);
    }
    public static void main(String[] args) {
        root = insert(root,10);
        root = insert(root,20);
        root = insert(root,30);
        root = insert(root,40);
        root = insert(root,50);
        root = insert(root,25);

        priorder(root);
    }
}
