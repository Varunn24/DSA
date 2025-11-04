import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Greedyalgo2 {
    static class job{
        int profit;
        int id ; 
        int deadline ;
        public job(int p , int i , int d){
            id = i ; 
            profit = p ;
            deadline = d;
        }
    }
    public static void main(String[] args) {
        // int val[] = {10,20,30};
        // int wt []= {60,100,120};
        // int w = 50;

        // double ratio[][] = new double[val.length][2];

        // for(int i = 0 ; i < val.length ;i++){
        //     ratio[i][0] = i;
        //     ratio[i][1] = (val[i] /(double) wt[i]);

        // }

        // // assending order 
        // Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        // int capacity = 0 ;
        // int finalval = 0 ;
        // for(int i = ratio.length-1 ; i >= 0 ; i--){
        //     int idx = (int)ratio[i][0];
        //     if(capacity >= wt[idx]){
        //         finalval += val[idx];
        //         capacity -= wt[idx];

        //     }
        //     else{
        //         finalval += (capacity * ratio[i][1]);
        //         capacity=0;
        //         break;
        //     }
        // }
        // System.out.println("final value is = " + finalval);

        // int a[] = {4,1,8,7};
        // int b[]= {2,3,6,5};

        // Arrays.sort(a);
        // Arrays.sort(b);

        // int mindiff = 0 ;
        // for(int i = 0 ; i < a.length ; i++){
        //     mindiff += Math.abs(a[i] - b[i]);
        // }
        // System.out.println("minimum diff is =" + mindiff);

        // int pairs [][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        // Arrays.sort(pairs,Comparator.comparingDouble(o ->o[1]));

        // int chianlen = 1;
        // int chianend = pairs[0][1];

        // for(int i=1 ; i < pairs.length ; i++){
        //     if(pairs[i][0] > chianend){
        //         chianlen++;
        //         chianend = pairs[i][1];      
        //           }
        // }
        // System.out.println("total ans is =" + chianlen);

        // Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        // Arrays.sort(coins,Comparator.reverseOrder());

        // int coinsofcount = 0 ;
        // int amount = 790;
        // ArrayList<Integer> ans = new ArrayList<>();

        // for(int i = 0 ; i < coins.length ; i++){
        //     if(coins[i] <= amount){
        //         while (coins[i] <= amount) {
        //             coinsofcount++;
        //             ans.add(coins[i]);
        //             amount-=coins[i];
        //         }
        //     }
        // }
        // System.out.println("no of coins requrd for amount =" + coinsofcount);

        // int jobinfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        // ArrayList<job> jobs = new ArrayList<>();


        // for(int i = 0 ; i < jobinfo.length ; i++){
        //     jobs.add(new job(i, jobinfo[i][0], jobinfo[i][1]));
        // }
        // Collections.sort(jobs , (obj1,obj2) -> obj2.profit - obj1.profit);

        // ArrayList<Integer> seq = new ArrayList<>();

        // int time = 0 ;
        // for(int i = 0 ; i < jobs.size() ; i++){

        //     job curr = jobs.get(i);
        //     if(curr.deadline > time){
        //         seq.add(curr.id);
        //         time++;
        //     }
        // }
        // System.out.println("max jobs =" + seq.size());
        // for(int i = 0 ; i <seq.size(); i++){
        //     System.out.print(seq.get(i) + " ");
        // }
        // System.out.println();

        int m = 6 , n= 4 ;
        Integer costver[] = {2,1,3,1,4};
        Integer costhor[] = {4,1,2};

        Arrays.sort(costver,Collections.reverseOrder());
        Arrays.sort(costhor, Collections.reverseOrder());

        int h =0 , v= 0;
        int hp = 1 , vp  =1 ;

        int cost = 0 ;
        while (h < costhor.length & v < costver.length) {
            if(costver[v] <= costhor[h]){
                cost += (costhor[h] * vp);
                hp++;
                h++;
            }
            else{
                cost += (costver[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costhor.length) {
            cost += (costhor[h] * vp);
            hp++;
            h++;
        }
        while (v < costver.length) {
            cost += (costver[v] * hp);
                vp++;
                v++;
        }

        System.out.println("minimim cost of chocola = " + cost);

    }
}
