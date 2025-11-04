import java.util.ArrayList;
import java.util.*;
public class lecture29 {
    public static void Swoap(ArrayList<Integer> list , int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1 , list.get(indx2));
        list.set(indx1, temp);
    }

    public static int StoredWater(ArrayList<Integer>list){
        int maxwater = 0 ;
        int lp = 0 , rp =list.size();

        while (lp < rp ) {
            //  curr water 
            int ht = Math.min(list.get(lp), list.get(rp));
            int wd = rp - lp ; 
            int currwater = ht*wd;

            maxwater = Math.max(maxwater, currwater);

            //  pointer incress
            if (list.get(lp) < list.get(rp)) {
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(6);
        list.add(9);
        // // System.out.println(list);
        // list.add(1,7);
        // System.out.println(list);
        // //  get 
        // int element = list.get(3);
        // System.out.println(element);

        // // remove 
        // list.remove(1);
        // System.out.println(list);

        // // consil element 
        //  System.out.println(list.contains(3));
        // System.out.println(list.contains(11));

        // System.out.println(list.size());
        // System.out.println();

        // for(int i = 0 ; i < list.size() ; i++){
        //     System.out.print(list.get(i) + " ");
        // }


        //  reverse list
        // for(int i = list.size()-1 ; i >= 0 ; i-- ){
        //     System.out.print(list.get(i) + " ");
            
        // }
        // System.out.println();

        // get max element
        // int max = Integer.MIN_VALUE;
        // for(int i = 0 ; i < list.size(); i++){
        //     if (max < list.get(i)) {
        //         max = list.get(i);
                
        //     }
        // }
        // System.out.println("element of max value is : " + max);

        // int indx1 = 1 , indx2 = 3;
        // Swoap(list, indx1, indx2);
        // System.out.println(list);

        // Collections.sort(list);
        // System.out.println(list);
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);

        // ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();

        // for(int i = 0 ; i <=5 ; i++){

        //     list1.add(1*i);
        //     list2.add(2*i);
        //     list3.add(3*i);
        // }

        // main.add(list1);
        // main.add(list2);
        // main.add(list3);

        // System.out.println(main);

        // for(int i = 0 ; i < main.size() ; i++){
        //     ArrayList<Integer> currlist =main.get(i);
        //     for(int j = 0 ; j< currlist.size() ; j++){
        //         System.out.print(currlist.get(j));
        //     }
        //     System.out.println();
        // }



        System.err.println(StoredWater(list));

    }
}
