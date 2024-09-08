//find character in a string

package Strings;
import java.util.*;
public class s2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Enter a character to be found : ");
        char find=sc.next().charAt(0);
        System.out.print("The character is found at index : ");
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==find){
             System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
