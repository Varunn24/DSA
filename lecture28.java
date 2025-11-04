public class lecture28 {
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
    }

        //  yes choies
        // FindSubse(str, i+1, ans+str.charAt(i));

        //  NO Choise
        FindSubse(str, i+1, ans);
    
}


public static void Paramitation(String str[] , String ans []){
    // base case
    if (str.length() == 0 ) {

        
    }
    for(int i = 0 ; i < str.length() ; i++){
        char curr = str.CharAt(i);

        str = str.substring(0,i) + str.substring(i+1);
        Paramitation(str, ans);
    }

}


    public static void main(String[] args) {
        String str  = "abc";
        // FindSubse(args, 0, "");
    }
}
