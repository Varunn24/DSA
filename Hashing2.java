import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hashing2 {
    public static boolean isAnagram(String s , String t){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            Character ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i = 0 ; i < t.length() ; i++){
            Character ch = t.charAt(i);
            if(map.get(ch) != null){

                if(map.get(ch) == 1){
                    map.remove(ch);
                }
                else{
                    map.put(ch, map.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        // LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
        // hm.put("india", 150);
        // hm.put("pok", 3);
        // hm.put("delhi", 6);
        // System.out.println(hm);

        // TreeMap<String,Integer> tm = new TreeMap<>();
        // tm.put("india", 150);
        // tm.put("us", 60);
        // tm.put("uk", 80);
        // tm.put("canada", 25);
        // System.out.println(tm);

        // int [] num = { 1,2,3,5,1,3,1,5,1,3};
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i =0 ; i < num.length ; i++){
        //     if(map.containsKey(num[i])){
        //         map.put(num[i], map.get(num[i] )+1);
        //     }
        //     else{
        //         map.put(num[i], 1);
        //     }
        // }

        // // Set<Integer> keySet = map.keySet();
        // for (int key : map.keySet()) {
        //     if(map.get(key) > num.length/3){
        //         System.out.println(key);
        //     }
        // }

        // String s = "race";
        // String t = "care";
        // System.out.println(isAnagram(s, t));

        // TreeSet<String> hs = new TreeSet<>();
        // hs.add("mumbai");
        // hs.add("banlore");
        // hs.add("delhi");
        // System.out.println(hs);

        // int [] num = {4,3,2,5,6,7,3,4,2,1};

        // HashSet<Integer> st = new HashSet<>();
        // for(int i=0 ; i <num.length ;i++){
        //     st.add(num[i]);
        // }
        // System.out.println("Ans =" +st.size());

        // int arr1[] = {7,3,9};
        // int arr2[] = {6,2,3,2,9,4};

        //== HashSet<Integer> set = new HashSet<>();

        // for(int i = 0 ; i < arr1.length ; i++){
        //     set.add(arr1[i]);

        // }
        // for(int i = 0 ; i < arr2.length ; i++){
        //     set.add(arr2[i]);
        // }

        // System.out.println("union " + set.size());

        // // intersection

        // set.clear();
        // for(int i = 0 ; i < arr1.length ; i++){
        //     set.add(arr1[i]);
        // }
        // int count = 0 ;
        // for(int i = 0 ; i < arr2.length ; i++){
        //     if(set.contains(arr2[i])){
        //         count++;
        //         set.remove(arr2[i]);
        //     }
        // }

        // System.out.println("intrsection = " + count);

        // int arr[] = {15,-2,2,-8,1,7,10,2,3};

        // HashMap<Integer , Integer> set = new HashMap<>();

        // int sum = 0 , len = 0 ;

        // for(int j = 0 ; j < arr.length ; j++){

        //     sum += arr[j];
        //     if(set.containsKey(sum)){
        //         len = Math.max(len, j-set.get(sum));
        //     }
        //     else{
        //         set.put(sum, j);
        //     }
        // }
        // System.out.println("largest sub array = " + len);

        int arr[] = {10,2,-2,-20,10};
        int k = -10;

        HashMap<Integer ,Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0 ;
        int ans = 0 ;

        for(int j = 0 ; j < arr.length ; j++){

            sum+=arr[j];
            if(map.containsKey(sum-k)){

                ans+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(sum);

    }
}
