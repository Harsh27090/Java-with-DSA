package Recursion.lvl3;

public class r17_countTotalPaths {
    public static int countTotalPaths(int row,int col){
        if(row==m || col==n){
            return 0;
        }
        
        if(row==m-1 && col==n-1){
            return 1;
        }
        
        // want to go right
        int right=countTotalPaths(row, col+1);
        // want to go down
        int down=countTotalPaths(row+1, col);

        return right+down;

    }
    
    static int m=3;
    static int n=3;
    public static void main(String[] args) {
        
        int totalPaths=countTotalPaths(0, 0);
        System.out.println(totalPaths);
    }
}
