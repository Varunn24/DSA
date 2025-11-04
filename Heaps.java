import java.util.ArrayList;
import java.util.PriorityQueue;

import Stack.stack;

public class Heaps {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    static class heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1; // Index of the newly added element
            int par = (x - 1) / 2; // Parent index

            // Heapify up
            while (x > 0 && arr.get(x) < arr.get(par)) {
                // Swap child and parent
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // Update x to parent index for the next iteration
                x = par;
                par = (x - 1) / 2;
            }
        }

        // Method to print the heap array
        public void printHeap() {
            System.out.println(arr);
        }

        public int peek(){
           return arr.get(0);
        }

        public void heaprify(int i){
            int left = 2*i+ 1;
            int right = 2*i + 2 ;
            int minidx = i ;

            if(left < arr.size() && arr.get(minidx) > arr.get(left)){
                minidx = left;
            }
            if(right < arr.size() && arr.get(minidx) > arr.get(right)){
                minidx = right ;
            }
            while (minidx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);

                heaprify(minidx);
            }
        }

        public boolean isempty(){
            return arr.size() == 0;
        }

        public int remove(){
            int data = arr.get(0);

            // swap the 1st and last node 
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //  removee the last element 
            arr.remove(arr.size()-1);

            // fix my heap using heapify function
            heaprify(0);
            return data;

        }
    }

    public static void hepify(int arr[] , int i , int size){
        int left = 2*i +1 ;
        int right = 2*i +2 ;
        int maxIdx = i ;

        if(left < size && arr[left] > arr[maxIdx] ){
            maxIdx = left;
        }

        if(right < size && arr[right] > arr[maxIdx] ){
            maxIdx = right;
        }

        while (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp ;

            hepify(arr, maxIdx, size);
            
        }
    }

    public static void heapsort(int arr[]){
        int n = arr.length;
        for(int i = n/2 ; i >= 0 ; i--){
            hepify(arr , i , n);
        }

        // largest push at end 
        for(int i = n-1 ; i > 0 ; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp ;

            hepify(arr,0 , i);
        }
    }


    static class point implements Comparable<point> {
        int x ;
        int y ;
        int ditsq ;
        public point(int x , int y , int ditsq){
            this.x = x ;
            this.y = y ;
            this.ditsq = ditsq;
        }
        @Override
        public int compareTo(point p2){
            return this.ditsq - p2.ditsq;
        }
    }
  
    public static void main(String[] args) {
        //heap h = new heap();
         //int[] arr = {5, 3, 8, 4, 1, 2};

        // // Add elements to the heap
        // for (int val : arr) {
        //     h.add(val);
        // }

        // // Print the heap
        // System.out.println("Heap after adding elements:");
        // h.printHeap();
        // System.out.println(h.peek());

        // h.add(3);
        // h.add(8);
        // h.add(7);
        // h.add(5);

        // while (!h.isempty()) {
        //     System.err.println(h.peek());
        //     h.remove();
        // }

        // for(int i = 0 ; i < arr.length ; i++){
        //     System.out.println(arr[i] + " ");
        // }

        //  PriorityQueue<Point> pq = new PriorityQueue<>();

        // // Add points to the priority queue
        // pq.add(new Point(1, 2, 5));
        // pq.add(new Point(3, 4, 10));
        // pq.add(new Point(0, 0, 1));

        // // Retrieve points in sorted order
        // while (!pq.isEmpty()) {
        //     System.out.println(pq.poll());
        // }
        

        int ropes[] = {4,3,2,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i < ropes.length ; i++){
            pq.add(ropes[i]);
        }

        int cost =0 ;
        while (pq.size() > 1) {
            int min = pq.remove();
            int min2 = pq.remove();
            cost+= min + min2 ;
            pq.add(min+min2);
        }

        System.out.println(" minimum cost of the  connect ropes is : " + cost);
    }

}
 
    