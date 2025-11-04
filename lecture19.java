 public class lecture19 {

    // prfix sum algoritam

// 
//     public static void PreSuba(int number[]){
//         int currsum = 0;
//         int Max = Integer.MAX_VALUE;
//         int prefix[]= new int [number.length];

//         prefix[0]=number[0];

//         // callculet prefix
//         for(int i =1; i<prefix.length ; i++){
//             prefix[i] = prefix[i-1] + number[i];
//         }

//         for(int i = 0; i < number.length ; i++ ){
//             int start = i;
//             for(int j = 0; j < number.length ; j++ ){
//                 int end = j;
//                 currsum = start ==0 ? prefix[end] :prefix[end]-prefix[start-1];
          
//                 if(Max < currsum){
//                     Max = currsum;
//                 }
          
//             }


//         }
//         System.out.println("max sum =" + Max);
//     }
//     public static void main(String[] args) {
//         int number [] ={1,2,3,4,5,6,7,8};
//         PreSuba(number);

//     }



    //   kadas algoritham


    public static void Karsuba(int number[]){
        int currsum=0;
        int Maxsum = Integer.MAX_VALUE;
        for(int i = 0; i < number.length; i++){
            currsum +=number[i];
            if(currsum <0 ){
                currsum = 0;
            }
            Maxsum = Math.max(currsum,Maxsum);
        }
        System.out.println("our max sum is :" + Maxsum);
    }
    public static void main(String[] args) {
                int number [] ={-2,-3,4,-1,-2,1,5,-3};
                Karsuba(number);
        
            }


    // trapping raibwater

    // public static int trappedRain(int hight[]){
    //     // calucluet left max boundry 
    //     int leftmax[] = new int[hight.length];
    //     leftmax[0]= hight[0];
    //     for(int i=1; i<hight.length; i++){
    //         leftmax[i] =Math.max(hight[i], leftmax[i-1]);

    //     }
    //     //  calculet right max boundry
    //     int rightmax[]= new int[hight.length];
    //     rightmax[hight.length-1]= hight[hight.length-1];
    //     for(int i =hight.length-2; i>0; i--){
    //         rightmax[i]= Math.max(hight[i], rightmax[i+2]);
    //     }


    //     int trappewater = 0;
    //     //  loop
    //     for(int i=0; i<hight.length ; i++){
    //         int waterlevel = Math.min(leftmax[i] , rightmax[i]);
    //         trappewater += waterlevel-hight[i];


    //     }
    //     System.out.println("");
    //     return trappewater;
    // }

    // public static void main(String[] args) {
    //     int hight[] = {4 , 2, 0, 6, 3, 2, 5};
    //     System.out.println(trappedRain(hight));
    // }


//     import java.util.Arrays;

// // public class MinMaxFinder {

//     /**
//      * Finds the minimum element in an array of integers.
//      *
//      * @param A The input array.
//      * @param N The size of the array.
//      * @return The minimum element in the array.
//      */
//     public static int setmini(int[] A, int N)
//     {
//         int mini = Integer.MAX_VALUE;
//         for (int i = 0; i < N; i++) {
//             if (A[i] < mini) {
//                 mini = A[i];
//             }
//         }
//         return mini;
//     }

//     /**
//      * Finds the maximum element in an array of integers.
//      *
//      * @param A The input array.
//      * @param N The size of the array.
//      * @return The maximum element in the array.
//      */
//     public static int setmaxi(int[] A, int N)
//     {
//         int maxi = Integer.MIN_VALUE;

//         for (int i = 0; i < N; i++) {
//             if (A[i] > maxi) {
//                 maxi = A[i];
//             }
//         }
//         return maxi;
//     }

//     public static void main(String[] args)
//     {
//         int[] A = { 4, 9, 6, 5, 2, 3 };
//         int N = A.length;
//         System.out.println("Minimum element is: "
//                            + setmini(A, N));
//         System.out.println("Maximum element is: "
//                            + setmaxi(A, N));
    
// }

        
 }
