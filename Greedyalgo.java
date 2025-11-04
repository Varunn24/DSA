import java.util.*;

public class Greedyalgo {
    public static void main(String[] args) {
        int start[] = {10,12,25};
        int end[] = {30,20,11};
        // unsoreted end time 
        int activity[][] = new int[start.length][3];
        for(int i = 0 ; i < start.length ; i++){
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i]; 
        }
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        // end time bacis sorted
        int maxact = 0; 
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxact =1;
        ans.add(activity[0][0]);
        int lastend = activity[0][2];
        for(int i= 1 ; i < end.length ; i++){
            if(activity[i][1] >= lastend){
                maxact++;
                ans.add(activity[i][0]);
                lastend =activity[i][2];
            }
        }
        System.out.println("max activitys = " + maxact);
        for(int i = 0 ; i<ans.size() ; i++){
            System.out.print("A" + ans.get(i) + " ");
        }


        System.out.println();
    }
    

}
