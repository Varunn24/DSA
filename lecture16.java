

import java.util.*;
public class lecture16 {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static void main(String[] args) {
    //    Scanner sc =new Scanner(System.in);
    //    System.out.println("enter your name");
    //    String name = sc.next();
    //    printMyName(name);

    // }
//     public static int mySum(int a , int b){

//         int Sum = a+ b ;
//         return Sum ;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print(" enter value of a ");
//         int a = sc.nextInt();
//         System.out.print("enetr value of b ");
//         int b = sc.nextInt(); 


//         int sum =mySum(a , b);
//         System.out.println("sum of two number : " +sum);
//     }


// public static int calculateProduct(int a , int b){
//     return a + b ;
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print(" enter value of a ");
//     int a = sc.nextInt();
//     System.out.print("enetr value of b ");
//     int b = sc.nextInt(); 

//     int sum = calculateProduct(a , b);
//     System.out.println(" sum of product " + sum);



    
// }

// public static void prFactorial(int n){
//     int Factorial = 1;
//     for (int i = n ; i>= 1 ; i--)
//     {Factorial = Factorial * i;}
//     System.out.println(Factorial);
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print(" enter number ");
//     int n = sc.nextInt();


//     System.out.println(" factorial of no ");

//     prFactorial(n);
// }
public static int ans( int n){
    int factorial = 1;
    for (int i = n ; i >= 1 ; i--){
        factorial = factorial * i ;
        
    }
    System.out.println( factorial);
    return n;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();


    ans(n);



}





 }
