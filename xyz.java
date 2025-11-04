public class xyz {
    static boolean issafe(char Board[][], int row , int col){
        // vertical up
        for(int i = row - 1 ; i >= 0 ; i--){
            if (Board[i][col] == 'Q') {

                return false;
            }
        }
        //  daigonal left pluse 
        for(int i = row - 1 , j = col - 1 ; i>= 0 && j>= 0 ; i--, j--){
            if(Board[i][j] == 0){
                return false;
            }
        }
        //  daigonal left
        for(int i = row - 1 , j = col + 1 ; i>= 0 && j< Board.length ; i--, j++){
            if(Board[i][j] == 0){
                return false;
            }
        }
        return true;


    }
    public static boolean nQueen(char Board[][] , int row){
        if (row == Board.length) {

            // printBoard(Board);
            count++;
            return true;
        }
        for(int j = 0 ; j < Board.length; j++ ){
           if (issafe(Board , row , j)) {
            Board[row][j] = 'Q';
            if(nQueen(Board, row+1)){
                return true;
            };
            Board[row][j]= '.';

            
           }
        }
        return false;

        
    }
    static void printBoard(char Board[][]){
        System.out.println("========Borad=======");
        for(int i = 0 ; i < Board.length ; i++){
            for(int j = 0 ; j < Board.length ; j++){
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count = 0 ; 
    public static void main(String[] args) {
        int n = 5 ;
        char Board[][]= new char[n][n];

        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< n ; j++){
                Board[i][j] = '.';
            }
        }
       if( nQueen(Board, 0)){
        System.out.println("toal count in Bored is : " + count);
        printBoard(Board);
    System.out.println(" solution is not possible ");}
    }
}
