import java.util.*;
import java.util.Queue;

public class ClassRoom {
    // public static void PrintFirstNonReprating(String s){
    //     int freq[] = new int[26];

    //     Queue<Character> q = new LinkedList<>();

    //     for(int i = 0 ; i < s.length() ; i++){
    //         char ch = s.charAt(i);
    //         q.add(ch);
    //         freq[ch-'a']++;

    //         while (!q.isEmpty() && freq[q.peek() -'a'] >1) {
    //             q.remove();
    //         }
    //         if(q.isEmpty()){
    //             System.out.println(-1);
    //         }
    //         else{
    //             System.out.println(q.peek());
    //         }
    //         System.out.println();
    //     }

        

    // }

    // public static void Interleave(Queue<Integer>q){
    //     int size = q.size();
    //     Queue<Integer> FirstHalf = new LinkedList<>();

    //     for(int i = 0 ; i < size/2; i++){
    //         FirstHalf.add(q.remove());
    //     }
        
    //     while (!FirstHalf.isEmpty()) {
    //         q.add(FirstHalf.remove());
    //         q.add(q.remove());
    //     }
       
    // }

    // public static void reversal(Queue<Integer> q){
    //     Stack<Integer> s = new Stack<>();
    //     int size = q.size();

    //     for(int i = 0 ; i < size ; i++){
    //         s.push(q.remove());
    //     }

    //     while (!s.isEmpty()) {
    //         q.add(s.pop());
    //     }
    // }

    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public  void add(int data){
            deque.addLast(data);
        }
        public int  remove(){
            return  deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    } 
    static class Queue{
        Deque<Integer> deque = new LinkedList<>();

        public  void add(int data){
            deque.addLast(data);
        }
        public int remove(){
           return deque.removeFirst();
        }
        public int peek(){
           return deque.getFirst();
        }
    } 
    public static void main(String[] args) {
        // String s = "aabccxb";
        // PrintFirstNonReprating(s);

        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // q.add(6);
        // q.add(7);
        // q.add(8);
        // q.add(9);
        // q.add(10);
        // // Interleave(q);
        // reversal(q);
        // while (!q.isEmpty()) {
        //     System.out.print(q.remove() + " ");
        // }
        // System.out.println();

    //     Deque<Integer> Deque = new LinkedList<>();
    //     Deque.addFirst(1);
    //     Deque.addFirst(2);
    //    Deque.addLast(3);
    //    System.out.println(Deque);
    //    Deque.removeFirst();
    //    Deque.removeLast();
    //    System.out.println(Deque);
    //    Deque.addFirst(2);
    //    Deque.addFirst(3);
    //    Deque.addLast(4);
    //    Deque.addLast(5);
    //    System.out.println(Deque.getFirst());
    //    System.out.println(Deque.getLast());
    //    System.out.println(Deque);
    // Stack s = new Stack();
    // s.add(1);
    // s.add(2);
    // System.out.println("print data" + s.peek());
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    System.out.println("print data" +q.peek());
    System.out.println(q.remove());

    System.out.println(q.remove());
    System.out.println(q.remove());

    }
}
