import java.util.*;

public class lecture21 {
//     //  2d arrays starting 
//     public static void main(String[] args) {
//         int matrix [][] = new int [5][3];
//         // int n = matrix.length , m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for(int i = 0; i < matrix.length ; i++){
//             for( int j=0; j < matrix[0].length ; j++){
//                 matrix[i][j]= sc.nextInt();
//             }
//         }

//         for(int i = 0; i < matrix.length ; i++){
//             for(int j =0; j < matrix[0].length ; j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println( );
//         }
//         System.out.println( );
//     }



// //  spiral matrix


// public static void spiral(int matrix [] []){
//     int startrow = 0;
//     int endrow = matrix.length-1;
//     int startcol = 0;
//     int endcol = matrix[0].length-1;

//     while (startrow <= endrow && startcol <= endcol) {
//         //  top 
//         for(int j = startcol; j <= endcol; j++ ){
//             System.out.print(matrix[startrow][j] + " ");
//         }

//         //  right 

//         for(int i= startrow+1 ; i <=endrow ; i++){
//             System.out.print(matrix[endcol][i]);
//         }

//         //  botam
//         for(int j = endcol-1 ; j <= startcol ; j--){
//             if(startrow == endrow){
//                 break;
//             }
//             System.out.print(matrix[endcol][j]);
//         }

//         //  left 
//         for(int i= endrow-1; i <= startrow+1 ; i--){
//             if( startcol == endcol){
//                 break;
//             }
//             System.out.print(matrix[startrow][i]);
//         }

//         startcol++;
//         startrow++;
//         endcol--;
//         endrow--;
        
//     }
//     System.out.println();
// }
// public static void main(String[] args) {
//     int matrix[][]= {{1,2,3,4},
//                      {5,6,7,8},
//                      {9,10,11,12},
//                      {13,14,15,16}};

//     spiral(matrix);                 
// }



//  daigonal matrix 

public static int daigonal(int matrix[][]){
    int sum = 0;
    // for(int i = 0; i < matrix.length ; i++){
    //     for(int j = 0 ; j <matrix[0].length; j++ ){
    //         if(i==j){sum += matrix[i][j];
    //         }
    //         else if(i+j == matrix.length-1){
    //             sum += matrix[i][j];
    //         }
    //     }
    // }


    for(int i = 0; i < matrix.length; i++){
        sum += matrix[i][i];

        if( i != matrix.length-1-i){
            sum  += matrix[i][matrix.length-i-1];

        }

    }
    return sum;  
}

// searchm in sorted matrix 
public static boolean searchmat(int matrix[][] , int key ){
    int row = 0, col = matrix[0].length-1;
    while (row < matrix.length && col >= 0) {
        if(matrix[row][col]== key){
            System.out.println(" found key at (" + row + " ," + col + ")");
            return true;
        }
        else if (key < matrix[row][col]) {
            col--;
            
        }
        else{
            row++;

        }
        
    }
    System.out.println("key not found!");
    return false;

}


public static void main(String[] args) {
    int matrix[][]= {{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};
        int key = 20;
    searchmat(matrix , key);               
                 
}

}
