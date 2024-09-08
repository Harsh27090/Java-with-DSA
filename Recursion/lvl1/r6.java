// x^n (stack height = log n)

package Recursion.lvl1;

public class r6 {
    public static int power(int x,int n){
        if(n==0)
        return 1;

        // n is even
        if(n%2==0){
            return power(x, n/2) * power(x, n/2);
        }
        else{ // n is odd
            return power(x, n/2) * power(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        int x=2;
        int n=6;
        int result=power(x, n);
        System.out.println(result);
    }
}
