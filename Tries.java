public class Tries {
    static class  Node {
    
        Node childern[] = new Node[26];
        boolean eow = false ;

        int freq ;
        public Node(){
            for(int i = 0 ; i < 26 ; i++){
                childern[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String s){
        Node curr = root ;
        for(int i = 0 ; i < s.length() ; i++){
            int idx = s.charAt(i)-'a';
            if(curr.childern[i] == null){

                curr.childern[i] = new Node();
            }
            curr = curr.childern[i];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root ;
        for(int i = 0 ; i < key.length() ; i++){
            int idx = key.charAt(i)-'a';
            if(curr.childern[i] == null){

               return false;
            }
            curr = curr.childern[i];
        }
        return curr.eow == true;
    }

    public static boolean wordbreak(String key){

        if(key.length()== 0 ){
            return true;
        }

        for(int i = 0 ; i <= key.length() ; i++){
            if(search(key.substring(0,i)) &&
            wordbreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String arr){

        Node curr = root ;
        for(int i = 0 ; i < arr.length() ; i++){
            int idx = arr.charAt(i)-'a';
            if(curr.childern[idx] == null){
                curr.childern[idx] = new Node();
            }
            else{
                curr.childern[idx].freq++;
            }
            curr = curr.childern[idx];
        }
    }
    public static void main(String[] args) {
        // String s[] = {"the" , "a " , "there" , "their" ,"any" , " three"};

        // for(int i = 0 ; i < s.length ;i++){
        //     insert(s[i]);
        // }

        // System.out.println(search("there"));
        // System.out.println(search("thor"));

        // String arr[] = {"i", "like","sam","samsung","mobile","ice"};
        // String key = "ilikesam";

        // for(int i = 0 ; i< arr.length ; i++){
        //     insert(arr[i]);
        // }
        // System.out.println(wordbreak(key));

        String arr[] = {"dog" ,"zebra" , "dove" , "duck"};
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(i);
        }
    }
}
