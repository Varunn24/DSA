public class Griad {
    static int GraidWay(int i , int j , int n , int m ){
        // base case
        if (i == n-1 && j == n-1) {
            return 1;
            
        }
        else if(i == n || j == n){
            return 0 ;
        }
        int n1 = GraidWay(i+1, j, n, m); // down the side
        int n2 = GraidWay(i, j+1, n, m); // right side

        return n1+n2;
    }
    public static void main(String[] args) {
        // int n = 3 , m  =3 ;
        // System.out.println(GraidWay(0, 0, n, m));

        int sudoku[][]{{0 ,0 ,8 ,0 ,0 ,0 ,0 ,0 ,0 };
    {4,9,0,1,5,7,0,0,2};
    {0,0,3,0,0,4,1,9,0};
    {1,8,5,0,6,0,0,2,0};
    {0,0,0,0,2,0,0,6,0};
    {9,6,5,4,0,5,3,0,0};
    {0,3,0,0,7,2,0,0,4};
    {0,4,9,0,3,0,0,5,7};
    {8,2,7,0,0,9,0,1,3}
};

    }
}
