// x^n (stack height = n)

package Recursion.lvl1;

public class r5 {
    public static int power(int x,int n){
        if(n==0)
        return 1;

        return x*power(x, n-1);

    }

    public static void main(String[] args) {
        int x=2;
        int n=6;
        int result=power(x, n);
        System.out.println(result);
    }
}
