package _01_Basic;
import java.util.*;
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. : ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int t= n*i;
            System.out.println(t);
        }
        sc.close();
    }
}
