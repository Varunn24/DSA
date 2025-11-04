public class DoublyLL {
    public class  node  {
        int data ;
        node next ;
        node prev ; 

        public node(int data ){
            this.data = data ;
            this.next = null ;
            this.prev = null;
        }
        
    }
    public static node head;
        public static node tail;
    
        public static int size ;
    
        // private int size;
        // add
        public void AddFirst(int data){
            node newnode = new node(data);
            size++ ;

            if(head == null){
                head = tail = newnode;
                return;
            }

            newnode.next = head;
            head.prev = newnode;
            head = newnode;

    }
    //  print 
    public static void print(){
        node temp = head;
        while (temp != null) {
            System.err.print(temp.data + " <->");
            temp = temp.next;
            
        }
        System.out.println("null");
    }

    public void Remove(){
        if(head == null){
            System.out.println("ll is empty");
        }

        if(size == 1 ){
            head = tail = null;

        }
        int val = head.data;
        head = head.next;
        head.prev =null;
        


    }

    public void reverce(){
        node curr = head;
        node prev = null ;
         node next;

         while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
         }
         head = prev;

    }

    // remove
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.AddFirst(2);
        dll.AddFirst(3);
        dll.AddFirst(4);
        // dll.Remove();
        // dll.print();
        // dll.Remove();
        // dll.print();
        // dll.Remove();
        // dll.print();
        // dll.Remove();
        // dll.print();
        dll.print();;
        dll.reverce();
        dll.print();

    }
}
