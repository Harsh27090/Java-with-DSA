// print numbers from 1 to 5

package Recursion.lvl1;

public class r1 {
    public static void printNum(int n){
        // base case
        if(n==6)
        return;

        System.out.println(n);
        // calling itself (recursion);
        printNum(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printNum(n);
    }
}
