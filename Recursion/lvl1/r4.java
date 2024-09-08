// fibonacci series

package Recursion.lvl1;

public class r4 {
    public static void fiboonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        fiboonacci(b, c, n-1);
    }
    public static void main(String[] args) {
        int n=8;
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        // n-2 coz we've already printed first 2 terms
        fiboonacci(0,1,n-2);
    }
}
