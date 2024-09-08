package _01_Basic;
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a : ");
        a=sc.nextInt();
        System.out.println("Enter value for b : ");
        b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of a and b is : "+ sum);
        sc.close();
    }
}
