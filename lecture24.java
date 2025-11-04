import java.util.*;

public class lecture24 {
    public static void main(String[] args) {
    //   user define packages 
    //     Scanner sc = new Scanner(System.in);
    //   int a = sc.nextInt();

   Queen g = new Queen() ;  
    }

  

    // abstract class Animal{
    //     void eat(){
    //         System.out.println("animal eats");
    //     }

    //     abstract void walks();
    // }

    // class Horse extends Animal {
    //     void walk(){
    //         System.out.println("walks on 4 legs ");
    //     }
   
    // } 


    interface CHessPlayer{
        void moves();

    }

    class Queen implements CHessPlayer{
        public void moves(){
            System.out.println("up , down , cross");
        }
    }
}
