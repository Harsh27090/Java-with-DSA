//find base raise to power

package Functions;
import java.util.*;
public class f10 {
    public static double expo(double x,double n){
        System.out.println("Base : "+x);
        System.out.println("Power : "+n);
        double result=Math.pow(x, n);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of base : ");
        double x=sc.nextDouble();
        System.out.println("Enter the value of power : ");
        double n=sc.nextDouble();
        double result=expo(x,n);
        System.out.println("The result is : "+result);
        sc.close();
    }
}
