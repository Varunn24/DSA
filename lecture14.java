// loops practice

import java.util.*;

public class lecture14 {
    public static void main(String[] args) {
    // int counter  = 1;
    // int sum = 0;


    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    
    //     while (counter <= n){

    //         sum = sum + counter;
    //         // System.out.print(sum);

    //         counter  ++;
           
    //     }
    //     System.out.print(sum);



    // for loop lecture
    // int i = 0;


    // for (i = 0 ; i<4 ; i++){
    //     System.out.println("****");

    // }


    int n = 452229610;
    int rev = 0;

    while (n>0) {
        int lastdigit = n % 10;
        rev = (rev * 10) +  lastdigit;
        n = n / 10;
        System.out.print(rev + " ");
    

    }
    System.out.print(rev);

    // int counter =0;


    // do {
    //     System.out.println("hello w");
    //     counter ++;
    //     break;

        
    // } while (counter <= 10);

    // int i = 0;

    // for (i = 0; i <=10 ; i++){
    //     if(i <= 5){
    //         // System.out.println("hello duniya");
    //         break;
            


    //     }
    //     System.out.println(i);
        
    // }
    // System.out.println("i am out of the loop");


    // Scanner sc = new Scanner(System.in);

    // do {
    //     System.out.println("enter your number : ");
    //     int n = sc.nextInt();
    //     if(n % 10 == 0){
    //         break;
    //     }
    //     System.out.println(n);
    // } while (true);


    // int i = 0;

    // for(i = 0; i < 7 ; i++){
    //     if(i==3){
    //         continue;
    //     }
    //     System.out.println(i);
    // }

    // Scanner sc = new Scanner(System.in);
    // do {
    //     System.out.println("enter youer number:");
    //     int v = sc.nextInt();
    //     if(v % 10 == 0){
    //         continue;
    //     }
    //     System.out.println("number was :"  + v);
    // } while (true);

    // prime number example


    // Scanner sc = new Scanner(System.in);
    // System.out.print("enter your number : ");
    // int n = sc.nextInt();

    

    // if(n == 2){System.out.println(" n is prime");}
    // else{
    //     boolean isprime = true ;
    // for (int i= 2; i<=Math.sqrt(n); i++){
    //     if(n % i ==0){
    //         isprime = false;

    //     }

    // }

    // if(isprime == true ){
    //     System.out.println("n is prime");
    // }
    // else{System.out.println("not prime");}

    // }



    //  test quation
  
        // for(int i=0; i<5; i++) {
        // System.out.println("Hello");
        // i+=2;
        // }
        
//         Scanner sc = new Scanner(System.in);
//         int number;
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;
//         do {
//         System.out.print("Enter the number ");
//         number = sc.nextInt();
//         if( number % 2 == 0) {
//         evenSum += number;
//         } else {
//         oddSum += number;
//         }
//         System.out.print("Do you want to continue? Press 1 for yes or 0 for");
        
//         choice = sc.nextInt();
//         } while(choice==1);
//         System.out.println("Sum of even numbers: " + evenSum);
//         System.out.println
        
//         ("Sum of odd numbers: " + oddSum);
        
        
// }
    
}
}

