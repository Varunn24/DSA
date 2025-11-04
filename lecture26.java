//  divide & conquer


public class lecture26 {
    public static void mergsort(int arr[], int si , int ei ){
        if(si >= ei ){

            return;
        }

        //  kam 
        int mid = si + ( ei - si)/2;
         mergsort(arr, si, mid); //left part
        mergsort(arr, mid+1, ei);// right part
        marge(arr, si, mid, ei);
    }


    public static void marge( int arr[], int si ,int mid, int ei ){
        int temp[] = new int[ei-si+1];
        int i = si ;  // itretor left part
        int j = mid+ 1; 
        int k = 0;//itretor for temp variable

        while (i <= mid && j <= ei) {
            if(arr[i] < arr[j]){
                temp[k]= arr[i];
                i++ ; j++;
            }
            else{
                temp[k]= arr[j];
                j++; k++;
            }
        }
        while (i <= mid ) {
            temp[k++]= arr[i++];

            
        }
        while (j <= ei) {
            temp[k++]= arr[j++];
        }



        for(k= 0 , i = si ; k < temp.length; k++ , i++ ){
            arr[i]= temp [k];
            
        }


    }


    public static void printArr(int arr []){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Quick(int arr[], int si , int ei){
        // last element
        int pidx = partiton(arr, si, ei);
        Quick(arr,si,pidx-1);
        Quick(arr, pidx + 1, ei);

    }

    public static int partiton(int arr[], int si , int ei){

        int pivot  = arr[ei];
        int i = si - 1 ;
        for(int j = si ; j <ei ; j++){
            if(arr[j] <= pivot){
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = pivot;
                arr[ei]= arr[i];
                arr[i] = temp;

                return i ;

    }


    public static int  search(int arr[] , int tar, int si , int ei){
       if (si > ei ) {
        return -1;
        
       }
        int mid = si + (ei-si)/2;

        if(arr[mid] == tar){
            return mid; 
        }

        if(arr[si] <= arr[mid]){
        // mid on l1
        if(arr[si] <= tar && tar <= arr[mid]){

            return search(arr, tar, si, mid);
        }

        else{
            //  case b right\
            return search(arr, tar, mid+1, ei);
        }
    }

    else {
        if (arr[mid] <= tar && tar <= arr[ei]) {
            return search(arr, tar, mid+1, ei);
            
        }
        else{
            return search(arr, tar, si, mid-1);
        }
    }
}

    public static void main(String[] args) {
        int arr []={4,5,6,7,0,1,2};
        // mergsort(arr, 0, arr.length);
        // System.err.println(arr);
        // Quick(arr, 0, arr.length-1);
        // printArr(arr);
        int tar = 4
         ;
        int tarIdx = search(arr, tar,0, arr.length-1);
        System.out.println(tarIdx);
    }
}
