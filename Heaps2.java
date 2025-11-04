import java.util.PriorityQueue;

// import Heaps.point;

public class Heaps2 {

    static class pair implements Comparable<pair>{
        int val , idx ;

        public pair(int val , int idx){
            this.val = val;
            this.idx = idx;
            
            
        }
        @Override
        public int compareTo(pair p2){
            //  assending order
            // return this.val - p2.val;
            //  disending order
            return p2.val - this.val;
        }

    }
    public static void main(String[] args) {
        int arr [] = {1,3,-1,-3,5,3,6,7};
        int k = 3 ;
        int res []= new int[arr.length-k+1];

        PriorityQueue<point> pq = new PriorityQueue<>();

        for(int i = 0 ; i < k ; i++){
            pq.add(new pair(arr[i], i));

        }

        res[0] = pq.peek().val;

        for(int i = k ; i < arr.length ; i++){
            while (pq.size() >0 && pq.peek().val <= (i-k)) {
                pq.remove();
            }
            pq.add(new pair(arr[i], i));
            res[arr.length-k+1] = pq.peek().val;

        }

        //  print array
        for(int i = 0 ;i < res.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
