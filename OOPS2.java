public class OOPS2 {
    public static void main(String[] args) {
        // Calculator c = new Calculator();
        // System.out.println(c.sum(2,5 ));
        Horse h = new Horse();
        
    
    }

    class Calculator {
        int sum(int a , int b){
            return a + b;
        }

        int sum(int a , int b , int c){
            return a + b + c ;

        }

        float sum (float a, float b){
            return a + b;
        }
    }

    class Animal{
        Animal(){
            System.out.println("constructor is called");
        }

    }

    class Horse extends Animal{
        Horse(){
            super();
            System.out.println("horse constructor");
        }
    } 
}
