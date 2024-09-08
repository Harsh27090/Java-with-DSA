//product of 2 nos.

package Functions;

import java.util.*;

public class f3 {
    public static int product(int a,int b){
        int p=a*b;
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a : ");
        int a=sc.nextInt();
        System.out.println("Enter value for b : ");
        int b=sc.nextInt();
        int product=product(a,b);
        System.out.println("The product of "+a+" and "+b+" is "+product); 
        sc.close();      
    }
}
