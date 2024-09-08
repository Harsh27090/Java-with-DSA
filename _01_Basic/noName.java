package _01_Basic;
import java.util.Scanner;

public class noName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float a=7/4.0f * 9/2.0f;
        System.out.println(a);

        // encryption
        char grade='C';
        grade=(char)(grade+9);
        System.out.println(grade);
        // decryption
        grade=(char)(grade-9);
        System.out.println(grade);

        int n=7;
        System.out.print("Enter a no. : ");
        int user=sc.nextInt();
        if(user>n)
        System.out.println("The entered no. is greater than "+n);
        else
        System.out.println("The entered no. is not greater than "+n);

        sc.close();

    }
}
