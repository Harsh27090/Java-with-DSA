//sum of 2 nos.

package Functions;
import java.util.*;

public class f2 {
    public static int sum(int a,int b){
        int s=a+b;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a : ");
        int a=sc.nextInt();
        System.out.println("Enter value for b : ");
        int b=sc.nextInt();
        int sum=sum(a,b);
        System.out.println("The sum of "+a+" and "+b+" is "+sum); 
        sc.close();      
    }
}
