import java.util.ArrayList;

public class lecture30 {

    static boolean Piarssum(  ArrayList<Integer>list , int target){
        for(int i = 0 ; i < list.size() ; i++){
            for(int j = i+1 ; j< list.size() ; j++){
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }


    static boolean Pairsum2(  ArrayList<Integer>list , int target){
        int lp = 0 , rp = list.size()-1;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            if(list.get(lp) + list.get(rp) > target){
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 8 ;

        // System.out.println(Piarssum(list, target));
        System.out.println(Pairsum2(list, target));
    }
}
