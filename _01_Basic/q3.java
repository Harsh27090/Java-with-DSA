package _01_Basic;
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. : ");
        int num=sc.nextInt();
        if (num%2 == 0) {
            System.out.println("No. is even.");            
        }
        else{
            System.out.println("No. is odd.");
        }
        sc.close();
    }
}
