//no. is prime or not

package Functions;
import java.util.*;
public class f5 {
    public static int prime(int n){

        int a=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) {
                a=0;
                break;
            }
            
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a = prime(n);
        if(a==0)
        System.out.println("not prime.");
        else
        System.out.println("prime");
        sc.close();
    }
    
}
