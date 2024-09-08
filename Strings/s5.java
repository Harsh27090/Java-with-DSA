//to create username from email id

package Strings;
import java.util.*;
public class s5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your email id : ");
        String email=sc.next();
        char atTheRate='@';
        System.out.print("Your username : ");
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)==atTheRate)
            break;
            System.out.print(email.charAt(i));

        }

        sc.close();
    }
}
