//to replace characters in a string

package Strings;
import java.util.*;
public class s4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String name=sc.next();
        String result="";
        System.out.print("Enter a character to be replaced : ");
        char replace=sc.next().charAt(0);
        System.out.print("Enter the character to be inserted : ");
        char insert=sc.next().charAt(0);
        
        for(int i=0;i<name.length();i++){
            if(replace==name.charAt(i))
            result+=insert;
            else
            result+=name.charAt(i);
        }
        System.out.println(result);
        sc.close();
    }
}
