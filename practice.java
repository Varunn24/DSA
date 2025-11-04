import java.util.Arrays;

public class practice {
    
    public static int  Maxval(int number[]){
        int max = Integer.MAX_VALUE;
        // int min = Integer.MIN_VALUE;
    
        for(int i = 0; i < max ; i++){

            if(number[i] > max){
                max = number[i];
            }
            // else{
            //     min = number[i];
            // }

        }
        return max;
        // System.out.println("max number is " + max);
        // System.out.println("min value is " + min);

    }
    public static void main(String[] args) {
        int [] number={2,8,7,5,1,3};
        int N = number.length;
        System.out.println("max value is a " + Maxval(number));
        // Maxval(number);

    }
}
