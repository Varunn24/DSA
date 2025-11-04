import java.util.Scanner;

public class lecture23 {
    public static void oddoreven(int n ){
          int bitmask = 1;
          if((n &bitmask)==0){
            System.out.println(" given number i s even ");
          }
          else{
            System.out.println(" given number is odd");
          }
    }
    public static void main(String[] args) {
                    //   // and opretor
        // System.out.println( 5 &  6);


        // //  or opretor 
        // System.out.println(5|6);

        // //  Xor opretor
        // System.out.println(5 ^ 6);

        // // 1's compliment 
        // System.out.println(~7);

        // // left shift 
        // System.out.println(5<<2);

        // // right shift 
        // System.out.println(9>>1);


       // quetion odd or even
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       oddoreven(n);

    }
}
