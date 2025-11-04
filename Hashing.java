import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.LinkedList;

public class Hashing {

    static class HashMap<K,V>{
        public class Node{
            K key ;
            V value;

            public Node(K key , V value){
                this.key = key ;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> bukets[];
        @SuppressWarnings("unchangrd")
        public HashMap(){
            this.N = 4;
            this.bukets = new LinkedList[4];
            for(int i = 0 ; i < 4 ; i++){
                this.bukets[i] = new LinkedList<>();
            }
        }
        private int hashfunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % bukets.length;
        }

        private int searchll(K key , int bi){
            LinkedList<Node> ll = bukets [bi];

            int di = 0 ;
            for(int i = 0 ; i <ll.size() ; i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;

                }
                di++;
            }
            return -1;


        }

        private void rihash(){
            LinkedList<Node> oldbuket[] = bukets;
            bukets = new LinkedList[N*2];
            N =  2 *N;
            for(int i = 0 ; i < bukets.length ; i++){
                bukets[i] = new LinkedList<>();
            }

            // nodes -> add in buckets
            for(int i = 0 ; i < bukets.length ; i++){
                LinkedList<Node> ll = oldbuket[i];
                for(int j = 0 ; j<ll.size() ; j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key , V value){

            int bi = hashfunction(key);
            int di = searchll(key, bi);

            if(bi != -1){
                Node node = bukets[bi].get(di);
                node.value = value;
            }
            else{
                bukets[bi].add(new Node(key, value));
                n++;
            }

            double lambda =  n/N;

            if(lambda > 2.0){

                rihash();
            }
        }

        public boolean containsKey(K key){
            int bi = hashfunction(key);
            int di = searchll(key, bi);

            if(bi != -1){
                return true;
            }
            else{
                return false;
            }
        }

        public V get(K key){
            int bi = hashfunction(key);
            int di = searchll(key, bi);

            if(bi != -1){
                Node node = bukets[bi].get(di);
                return node.value;
            }
            else{
               return null;
            }
        }

        public V remove(K key){
            int bi = hashfunction(key);
            int di = searchll(key, bi);

            if(bi != -1){
                Node node = bukets[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }

        public ArrayList<K> keySet(){

            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0 ; i <bukets.length ; i++){
                LinkedList<Node> ll = bukets[i];
                for (Node  node : ll) {
                    keys.add(node.key);
                }
                
            }
            return keys ;
        }
    }
    public static void main(String[] args) {
        HashMap <String,Integer> hm = new HashMap<>();
    //     hm.put("india", 150);
    //     hm.put("chaina", 190);
    //     hm.put("nepal", 5);

    // //     System.out.println(hm);

    // //     hm.put("india", 155);
    // //     hm.put("us",50 );

    // //     System.out.println(hm);

    // //     int population = hm.get("us");
    // //     // int population1 =hm.get("pak");
    // //     // System.out.println(population1);

    // //     System.out.println(hm.containsKey("pak"));

    // //    hm.remove("us");
    // //    System.out.println(hm);

    // Set<String> key = hm.keySet();
    // System.out.println(key);

    // for (String k: key) {
    //     System.out.println("keys " + k + " , value " + hm.get(k));
    // }

    hm.put("india", 170);
    hm.put("chaina", 300);
    hm.put("nepal", 90);

    ArrayList<String> key = hm.keySet();
    for (String string : key) {
        System.out.println(key);
    }

       
    }
}
