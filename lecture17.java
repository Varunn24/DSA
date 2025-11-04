import java.util.Scanner;

public class lecture17 {

    public static void Pattern2(int n ){
        for( int i = 1; i <= n ; i++){
            //  star i
            for( int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }


            //  space 2*(n-i)
            for(int j=1; j <=2*(n-i); j++){
                System.out.print(" ");
            }



            //  star  i
            for(int j=1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=n;  i>=1 ; i--){

             //  star i
             for( int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }


            //  space 2*(n-i)
            for(int j=1; j <=2*(n-i); j++){
                System.out.print(" ");
            }



            //  star  i
            for(int j=1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("enter your number :");
    //     int n = sc.nextInt();

    //     Pattern(n);
  
    // }

    // public static void  Pattern(int n){
    //     for(int i = 1 ; i <= n ; i++){
    //     //     space
    //     for(int j = 1; j <= (n-i); j++){
    //         System.out.print(" ");
    //     }

    //     // stars
    //     for(int j = 1; j <=n; j++){
    //         System.out.print("*");
    //     }
          
    //     System.out.println();
    //     }

     
    // }




    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("enter your number :");
    //     int n = sc.nextInt();



    //     Pattern(n);

    // }

    public static void Pattern1 (int n){
        for(int i = 1; i <= n; i++){
            //  space 
            for(int j= 1; j <= (n-i) ;j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n ; j++){
            
                if(i ==1 || i == n || j== 1 || j==n){
                    System.out.print("*");

                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     Pattern(n);
    // }
   


    public static void Pattern(int n){
        int count = 1;
        for(int i = 1; i <= n; i++){
            for(int j =1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }






    // public static void Pattern(int n){
    //     for(int i=1; i <= n ; i++ ){
    //         // space 
    //         for(int j = 1; j <= (n-i) ; j++){
    //             System.out.print(" ");
    //         }
    //         //  desending
    //         for(int j = i; j >=1  ; j--){
    //             System.out.print(j);
    //         } 


    //         // assending 
    //         for(int j =2 ; j<= i ; j++){
    //             System.out.print(j);

    //         }
    //         System.out.println();
    //     }

    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no ");
        int n = sc.nextInt();

        Pattern2(n);
    }



    // public static void Pattern(int n){
    //     for(int i = 1; i<=n; i++ ){
            
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("enter your no ");
    //     int n = sc.nextInt();

    //     Pattern(n);
    // }
    }

