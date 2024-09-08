//find gcd

package Functions;
import java.util.*;

public class f11 {
    public static void gcd(int a,int b){
        int gcd=1;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0)
            gcd=i;
        }
        System.out.println("The GCD of given nos. is : "+gcd);
        
    
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no. : ");
        int a=sc.nextInt();
        System.out.println("Enter second no. : ");
        int b=sc.nextInt();
        gcd(a, b);
        sc.close();
    }
}
