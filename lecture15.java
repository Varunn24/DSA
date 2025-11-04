public class lecture15 {
    public static void main(String[] args) {
        // for(int i = 0; i <=4 ; i++){
        //     for(int s=1 ; s <=i ; s++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        char str = 'A';


        for (int line = 1; line <=5; line++){
            for(int chars = 1 ; chars <= line ; chars++){
                System.out.print(str + " ");
                str++;
            }
            System.out.println();
        }
    }
    
}
