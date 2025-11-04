public class lecture27 {
    // public static void ChangeArr(int arr[] , int i , int val){
    //     //  base case 
    //     if(i == arr.length){
    //         PrintArr(arr);
    //         return;
    //     }

    //     // recursion
    //     arr[i] = val;
    //     ChangeArr(arr, i+1, val+1);
    //     arr[i] = arr[i]-2;
    // }

    // public static void PrintArr(int arr[]){
    //     for(int i = 0 ; i < arr.length ; i++){
    //         System.out.println(arr[i] + " ");
    //     }
    //     System.out.println( );
    // }
    // public static void main(String[] args) {
    //     int arr[] = new int[5];
    //     ChangeArr(arr, 0, 5);
    //     PrintArr(arr);
    // }


    static void FindSubse(String str [] , int i , String ans ){

        // base case 
        if (i == str.length) {
            if(ans.length() == 0 ){
            System.out.println("null");
           
            
        }
        else{
            System.out.println(ans);
        }
        return;

        //  yes choies
        FindSubse(str, i+1, ans+1);

        //  NO Choise
        FindSubse(str, i+1, ans);
    }


    public static void main(String[] args) {
        String str = "abc";
        FindSubse(args, 0, "");
    }
}
