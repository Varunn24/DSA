public class lecture20 {
    public static void BUbblesort(int  arr[]){
        for(int turn = 0; turn < arr.length-1; turn++){
            int swap = 0;
            for(int j =  0; j < arr.length-1-turn ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap ++;

                }
                
            }
            System.out.println(" nomof swap cases : " + swap);
        } 
       
        
    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selection(int arr[]){
        for(int i = 0 ; i < arr.length-1 ; i++){
            int minpos = i;
            int swap = 0;
            for( int j = i+1; j < arr.length ; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
                swap++;
            }
            System.out.println(" no. of times are the swap condition " + swap);
            int temp = arr[minpos];
            arr[minpos]= arr[i];
            arr[i]= temp;
        }


        // System.out.print("sorted arrray i s" + selection(arr););
    }

    public static void Insertion(int num[]){
        for(int i = 0; i < num.length; i++){
            int curr = i;
            int prev= i-1;
            while (prev > 0 && num[prev] > curr) {
                num[prev + 1] = num[prev];
                i--;
            }
            //  insertion
            num[prev + 1] = curr;
        }
    }
    public static void counting(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < num.length; i ++){
            largest = Math.max(largest, num[i]);

        }
        int count[]= new int [largest+ 1];
        for(int i = 0; i < num.length; i++){
            count[num[i]]++;

        }

        //  sorting
        int j = 0;
        for(int i = 0; i < count.length ; i++){
            while(count[i] > 0)
            {
                num[j]= i;
                j++;
                count[i]--;
}
        }

    }


    
    public static void main(String[] args) {
        int num [] = {5, 4, 1, 3, 25};
        Insertion(num);
        // printArr(num);
    }
    
}
