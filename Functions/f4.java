//factorial of given no.

package Functions;
import java.util.*;

public class f4 {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=fact(n);
        System.out.println(fact);
        sc.close();
    }
}
