//    // //  // recursion

public class lecture25 { 
    public static void Decrising(int n ){
        if(n == 0){
            System.out.println(n);
            return;
        }
        System.out.print( n + " ");
        Decrising(n-1);

    }

    public static void incrising(int n){
        if (n == 1) {
            System.out.print(n + " ");
            return;
            
        }
        incrising(n-1);
        System.out.print(n + " ");
    }

    public static int  factorial(int n ){
        if(n == 0){
            return 1; 
        }

        int fnm1 = factorial(n-1);
        int fn = n*factorial(n-1);
        return fn ; 

    }


    public static int Cluculatesum(int n){
        if( n == 1){
            return 1;
        }

        int sum = Cluculatesum(n-1);
        int sn = n+ sum ;
        return sn; 
    }


    public static int Fiboncci(int n){
        if(n== 0 ||n == 1){
            return n;

        }
        int Fnm1 = Fiboncci(n-1);
        int Fnm2 = Fiboncci(n-2);
        int Fn = Fnm1 + Fnm2;
        //System.out.println(Fn);
        return Fn;

    }


    static boolean isSorted(int arr[] , int i){
        if (i == arr.length-1) {
            return true;
            
        }

        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);

    }

    static int FirstOccu(int arr[] , int key,int i){
        if (i == arr.length) {
            return -1;
            
        }

        if(arr[i] == key){
            return i;
        }
        return FirstOccu(arr,key,i+1);
    }

    static int isPoewr(int x , int n){
        if(n==0 ){
            return 1;
        }
        int xnm1 = isPoewr(x, n-1);
        int xn = x * xnm1;
        return xn;

    }

    static int poewr(int x, int n ){
        if(n == 0){
            return 1 ;
        }

        int halfPower = poewr(x, n/2);
        int halfPowersq = halfPower * halfPower;

        if(n % 2 != 0 ){
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq ;


    }

    //  tiling problem 

    public static int Tiling(int n  ){
        // 2 .n (floor size )
        //  base case
        if(n == 0 || n==1){
            return 1;
        }



        // kam 
        //vertical choice
        int fnm1 = Tiling(n-1);
        //  vertical choice
        int fnm2 = Tiling(n-2);

        int toway = fnm1 + fnm2;
        return toway;
    }

    public static void Duplicant( String str , int idx , StringBuilder newstr, boolean map []){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        //  kam 
        char currchar = str.charAt(idx);
        if(map[currchar-'a'] == true){

            Duplicant(str, idx+1, newstr, map);
        }
        else {
            map[currchar -'a'] = true ;
            Duplicant(str, idx+1, newstr.append(currchar), map);
        }
    }
    

    // quetion frinds Pairing Problem
    public static int frindsPair(int n ){
        //  base case
        if (n == 1 || n == 2) {
            return n ;
            
        }
         //choice 
         //single
         int fnm1 = frindsPair(n-1);

        //  choice 
        // pair
        int fnm2 = frindsPair(n-2);
        int pair = (n-1)* (n-2);

        int toway = fnm1 + pair;
        return toway;
    }



    public static void printBinString(int n , int bits , StringBuilder str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        
        // if(lastplace == 0 ){
        //     printBinString(n-1, 0, str);
        //     printBinString(n-1, 1, str);
        //     else{
        //         printBinString(n-1,0, str);
        //     }
        // }

        printBinString( n-1, 0, str+"0");
        if(bits == 0){
            printBinString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7};
        // System.err.println(isSorted(arr, 0));
        // System.out.println(FirstOccu(arr,9,0));
    //  int n = 25 ; 
    //  Decrising(n);
    //  incrising(n);

    //  System.out.println( );
    //  System.out.println(factorial(5));
    //  System.out.println(Cluculatesum(n));
    //  System.out.println(Fiboncci(n));
    System.out.println(isPoewr(2, 10));
    System.out.println(poewr(2, 20));
    System.out.println(Tiling(6));

    String str = "appannacollage";
    Duplicant(str, 0,new StringBuilder(" "), new boolean[26]);
    System.out.println(frindsPair(3));
    printBinString(3,0," ");
    }
}
