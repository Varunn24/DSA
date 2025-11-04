import java.util.Scanner;

public class lecture22 {
    public static void printnumber(String str){
        for(int i = 0 ; i < str.length() ; i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean ispallindrom(String str){
        int n = str.length();
        for(int i = 0 ; i < str.length()/2 ; i++ ){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static float shortestpath(String path){
        int x = 0 , y = 0 ;
        for( int i = 0 ; i <path.length(); i++){
            char dir = path.charAt(i);
            //   south 
            if(dir == 'S'){
                y--;
            }

            //  north
            else if(dir == 'N'){
                y++;
            }

            //  west
            else if (dir == 'W'){
                x--;
            }
            // east 
            else{
                x++;
            }
        }
        int x2= x* x;
        int y2 = y* y;
        return (float)Math.sqrt( x2+ y2);

    }

    public static String substring(String str , int si , int ei ){
        String substr = "";
        for (int i = si ; i < ei ; i++){
            substr  += str.charAt(i);
        }
        return substr;

    }

    public static String touppercase ( String str){
        StringBuilder sb = new StringBuilder() ;
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1 ; i < str.length() ; i++){
            if(str.charAt(i)==' ' && i < str.length()-1 ){
                sb.append(str.charAt(i));
                i++;
                sb.append((Character.toUpperCase(str.charAt(i))));

            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String Compression(String str){
        String newstr = " ";

        for( int i = 0 ; i < str.length() ; i ++){

            Integer count = 1;
            while (i< str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;  

                
            }
            newstr += str.charAt(i);
            if(count > 1){
                newstr +=count.toString();

            }

        }
        return newstr;
    }


    public static int getithbit(int n , int i ){
        
        int bitmask = 1 << i ;
        if( (n & bitmask )== 0){
            return 0 ;
        }
        else{
            return 1 ;
        }
    }

    public static int setithbit(int n , int i ){
        int bitmask = 1 << i ;
        return n | bitmask ; 
    }

    public static int clearithbit(int n , int i ){
        int bitmask = ~(1<<i);
        return n & bitmask ; 
    }

    public static int updateithbit(int n  , int i , int newbit){
        n = clearithbit(n, i);
        int bitmask = newbit << i ;
        return n | bitmask ;
    }

    public static int clearihbit(int n , int i){
        int bitmask = (-1)<< i ;
        return n & bitmask;
    }


    public static int clearibitsd (int n ,int i , int j  ){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a| b ; 
        return n & bitmask;
    }

    public static boolean ispower(int n ){
        return (n&(n-1))== 0;

    }

    public static int countset(int n){
        int counT = 0 ;
        while( n > 0){
            if((n & 1) != 0 ) {
                counT ++ ; 
            }
            n = n >> 1 ; 

        }

        return counT ; 
    }

    public static int fastexc(int a , int n ){
        int ans = 1 ;
        while (n > 0) {
            if((n & 1) != 0){
                ans = ans * a;

            }
            a= a *a ;
            n = n>> 1;

            
        }
        return ans ;
    }
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");
        

        // //  string are immutable
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);


     //   // String fullname = " tony stark";
        // System.out.println(fullname.length());


        // // cocatention 
        // String firstname = "varun" ;
        // String lastnsme = "chaudhari";
        // String fullname = firstname + " " + lastnsme ;
        // System.out.println(fullname + " is farmer");


        // printnumber(fullname);
        // // .charat

        
   // //  questions

        // //  palindrom


        // String str = "racecar";
        // System.out.println(ispallindrom(str));


        // //  question 2 

        // //  shortest path in graph

        // String path = "NS";
        // System.out.println(shortestpath(path));

//  camparison
        // String s1 = "toney";
        // String s2 = "tone";

        // if(s1 .equals(s2) ){
        //     System.out.println("String is eqal");
        // }
        // else{
        //     System.out.println("string is not equal");
        // }


        // // substring
        // String str = " hello world ";
        // System.out.println(substring(str, 0, 9));


        // //  string bilder
        // StringBuilder sb = new StringBuilder("");
        // for(char ch= 'a' ; ch <= 'z'; ch++){
        //     sb.append(ch);
        // }

        //  System.out.println(sb);

        // //  quetion  
        // // upercase convert 

        // String str = "hi , i am shraddha";
  
        // System.out.println(touppercase(str));


        // // string Compression

        // String str = "ad";
        // System.out.println(Compression(str));


        // // get opretion 
        //  System.out.println(getithbit(10,3));


        // //  set opretion 
        //  System.out.println(setithbit(10, 2));


        // //  clar opretion
        // System.out.println(clearithbit(10, 1));


        // // update bit 
        // System.out.println(updateithbit(10, 02, 01));


        // // clear i bit 
        // System.out.println(clearihbit(15,2 ));

        // //  clear range of bit 
        // System.out.println(clearibitsd(10, 2, 4));


        // // quetion 2 power 
        // System.out.println(ispower(2));

        // count set n bi3
        System.out.println(countset(3));
        

        // // fast exponsition
        // System.out.println(fastexc(3, 5));


        
    } 
}
 