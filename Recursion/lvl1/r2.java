// print sum of n natural numbers

package Recursion.lvl1;

public class r2 {
    public static void sumNatural(int i,int n,int sum){
        if(i==n+1){
            System.out.println(sum);
            return;
        }

        sum+=i;
        sumNatural(i+1, n, sum);
        System.out.println(i);

    }
    public static void main(String[] args) {
        sumNatural(1, 5, 0);
    }
}
