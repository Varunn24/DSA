//  array
import java.util.*;
public class lecture18 {
    // public static void update(int marks[]){
    //     for( int i=0; i<marks.length; i++){
    //         marks[i]= marks[i] + 1; 
    //     }

    // }

    // /**
    //  * @param args
    //  */
    // public static void main(String[] args) {
    //     int marks[]= {97, 98 , 99};
    //     update(marks);

    //     for( int i=0; i<marks.length; i++){
    //         System.out.println(marks[i]+" "); 
    //     }

    //     System.out.println();
    // }

//     public static int linear(int number[], int key){
//         for(int i=0; i<number.length ; i++){
//             if(number[i] == key) {
//                 return i;

//             }
//         }
//         return -1;
        
//     }



//     public static void main(String[] args) {
//         int number[] = {2, 4, 6, 8 ,10 ,12 ,14 ,16 };
//         int key =40;

//         int index = linear(number, key);
//         if(index == -1){
//             System.out.println("not found");
//         }
//         else

//         {System.out.println("key is index");
// }
//     }


// public static int largest(int number[]){
//     int largest = Integer.MIN_VALUE;
//     int total = 0 ;
//     int smallest = Integer.MAX_VALUE;
//     for(int i = 0; i <number.length ; i++){
//         int ftotal = total  + number[1];

       
//         if(largest < number[i]){
//             largest = number[i];
//         }

//         if(smallest > number[i]){
//             smallest = number[i];
//         }

//         System.out.println(ftotal);
//     }
    
//     System.out.println("large  valu is :"  + largest);
//     return smallest;

// }

// public static void main(String[] args) {
//     int number[] = {4,8,44,40,36,32,28,24,16};
//     largest(number);
//     System.out.println("smaller value is :"  + largest(number));
// }

// public static int binaryser(int number[] , int key){
//     int start = 0, end =number.length-1;
//     for(int i =0; i<number.length ; i++){
//         int mid = (start + end ) /2;

        
//         if(number[mid] == key){
//             return mid;
//         }
//         if(number[mid] > key){
//             start = mid +1;
//         }
//         else{
//             end = mid-1;
//         }
//         // System.out.println("number is search is");


    


    
// }
// return -1;

// }

//     binary sort
// public static int binaryser(int number[], int key){
//     int start = 0 , end = number.length-1;
//     while (start <= end) {
//         int mid = (start+ end)/2;
//         if(number[mid] == key){return mid;}
//         else if(number[mid] < key){
//             start = mid+1;
//         }
//         else {
//             end = mid-1;
//         }


        
//     }
//     return -1;
// }
// public static void main(String[] args) {
//     int number []={4,8,12,16,20,24,28};
//     int key =24;
//     System.out.println("index for key is :"  + binaryser(number, key));
//     // binaryser(number, key);
// }




// revers array
// public static void reverse(int number[]){
//     int first = 0, last = number.length-1;
//     while(first <= last ){
//         int temp = number[last];
//         number[last] = number[first];
//         number[first]=temp;
//         first++;
//         last--;
//     }
// }
// public static void main(String[] args) {
//     int number []= {2,4,6,8,10,12,14};
//     reverse(number);
//     for(int i =0; i<number.length; i++){

//         System.out.println(number[i]  + " ");
//     }
// }



//  pairs in array

// public static void Pairs(int num[]){
//     int tp=0;
//     for(int i=0; i<=num.length ; i++){
//         int current = num[i];
//         for(int j = i+1; j<num.length; j++ ){
//             System.out.print("(" + current + "," + num[j] + ")");
//             tp++;
//         }
//         System.out.println();
//     }
//     System.out.println("total pair :" + tp);
//     // return 1;
// }
// public static void main(String[] args) {
    // int num[] ={2,4,6,8,10};
    // Pairs(num);




//sub array
public static void SubArray(int number[]){
    int ts= 0;
    int sum = 0;
    int currsum = 0;
    int max = Integer.MIN_VALUE;
    for(int i=0; i<number.length; i++){
        int start = i;
        // System.out.println("hii");
        
        for(int j=i+1; j<number.length; j++){

            int end = j;
            sum = 0;
            
            for(int k= start; k<end ;k++){
                sum +=number[k];
                ts++;
                if(sum < currsum){
                    sum = currsum;
                }
               

            }
            System.out.println(sum);
           
        }
      
    
    }
    System.out.println("total sub Arrays ia :"  + ts);
    System.out.println("sum of sub Array :" + sum);
    // return 1;
    }

    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        SubArray(number);
    
    }





    //  max subarray sum

    // public static int  MaxSubArray(int number[]){
    //     int currsum = 0;
    //     int maxsum = Integer.MIN_VALUE;

    //     for(int i=0 ; i < number.length ; i++){

    //         int start= i;
    //         for(int j=0; j < number.length ; j++ ){
    //             int end = j ;
    //             currsum = 0;
    //             for(int k= start ; k<=end ; k++){

    //                 currsum = currsum + number[k];

    //             }
    //             System.out.println(currsum);
    //             if(maxsum < currsum){
    //                 maxsum = currsum;               
    //              }
    //         }

    //     }
    //     System.out.println("max sum : " + maxsum);
    //     return 1;
    // }
    // public static void main(String[] args) {
    //     int number[]= {2,4,6,8,10};

    //     MaxSubArray(number);

    // }

}
