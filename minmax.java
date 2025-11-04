import java.util.Arrays;
import java.util.Scanner;


public class minmax {
   

    // /**
    //  * Finds the minimum element in an array of integers.
    //  *
    //  * @param A The input array.
    //  * @param N The size of the array.
    //  * @return The minimum element in the array.
    //  */
    // public static int setmini(int A [])
    // {
    //     int mini = Integer.MAX_VALUE;
    //     for (int i = 0; i < A.length; i++) {
    //         if (A[i] < mini) {
    //             mini = A[i];
    //         }
    //     }
    //     System.out.println(" the minimum value is the : " + mini);
    //     return mini;
    // }

    // /**
    //  * Finds the maximum element in an array of integers.
    //  *
    //  * @param A The input array.
    //  * @param N The size of the array.
    //  * @return The maximum element in the array.
    //  */
    // public static int setmaxi(int A [])
    // {
    //     int maxi = Integer.MIN_VALUE;

    //     for (int i = 0; i < A.length; i++) {
    //         if (A[i] > maxi) {
    //             maxi = A[i];
    //         }
    //     }
    //     System.out.println("max value is the :"  + maxi);
    //     return maxi;
    // }

    // public static void main(String[] args)
    // {
    //     int A [] = { 4, 9, 6, 5, 2, 3 };
    //     // int N = A.length;
    //     setmini(A );
    //     setmaxi(A);
     
    // }

    public static int revers(int num[]){
        int rev [] = new int[num.length];
        for(int i = 0; i < num.length ; i++){
            rev [i]= num[num.length-i-1];
            
        }
        System.out.println(" reversed array is :");
        for(int i : rev ){
            System.out.print(i + " ");
        }

        return 1;
    
    }
    public static void BUbblesort(int num []){
        for(int i = 0 ; i < num.length-1; i++){
            int swap = 0;
            // System.out.println("swaping ");
            for(int j = 0; j < num.length-1; j++){
                while (num[j+1] < num[j]) {
                    int temp = num[j+ 1];
                    num[j+ 1]= num[j];
                    num[j] = temp;
                    swap++;
                    
                }
            }
            // System.out.print( num[i]);

        }
    }



    public static void print (int num[]){
        for (int i = 0 ; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println( );
    }

    public static void insertion(int num[]){
        for(int i =0; i < num.length ; i++ ){
            int curr = i;
            int prev = i +1;
            while (prev > 0 && num[prev] > curr) {
                num[prev] = num[prev+1];
                i++;

                
            }
            num[prev]= curr;
        }
    }

    // public static void selection(int num[]){
    //     for(int i = 0 ; i < num.length-1; i++){
    //         int minpose = i;
    //         int swap = 0;
    //         for(int j = i+1; j < num.length ; j++){
    //            if(num[minpose ] < num[j]){
    //             minpose = j;

    //            } swap++;

                    
    //             }
    //             // System.out.print(" swap is the : " + swap);
    //             int temp = num[minpose];
    //             num[minpose]= num[i];
    //             num[i] = temp;

    //             // System.out.print( swap + " ");

    //         }
    //     }



        
    

    // public static void main(String[] args) {
    //     int num [] = {3,  2, 8, 4, 1, 7, 4, 5, 3, 1,};
    //     selection(num);
    //     print(num);

    // }


    // public static void main(String[] args) {
    //     int row = 3 , col = 3;
    //     int matrix [][] = {{4,8,7} , {8,8,7},{7,6,4}};

    //     // int sum= 0 ;
    //     // for(int i = 0; i < array.length ; i++){
    //     printMatrix(matrix);
           
        
    //     int transpoce[][] = new int[col][row];
    //     for(int i  = 0 ;  i < row ; i++){
    //         for( int j = 0; j < col ; j++){
    //             transpoce[j][i]= matrix[i][j];

    //         }

    //     }

    //     printMatrix(transpoce);

    //     // for( int j = 0 ; j < array[0].length ; j++){

    //         //     sum+=array[2][j];
    //             // if (array[i][j] == array[1][j] ) {
    //             //     sum+=array[1][j];
                    
    //             // }
    //         }
    //         public static void printMatrix(int matrix[][]){
    //             for(int i = 0; i <matrix.length; i++){
    //                 for(int j = 0 ; j <matrix[0].length; j++){
    //                     System.out.print(matrix[i][j] + "  ");
    //                 }
    //                 System.out.println();
    //             }
                
    //         }

    public static void main(String[] args) {
        int matrix [][] = new int[4][5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < matrix.length ;i ++){
            for( int j = 0; j < matrix[0].length; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        for(int i = 0 ; i < matrix.length ;i ++){
            for( int j = 0; j < matrix[0].length; j++){
              System.out.print(matrix);
            }
            System.out.println();
        }

    }

        // }
        // System.out.println("row sum is :" + sum);
    }



