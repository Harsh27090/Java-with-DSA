//strings and operations

package Strings;
import java.util.Scanner;
public class s1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.next();
        String lastName=sc.next();

        //concatenate
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);

        //length (spaces are included)
        int length=fullName.length();
        System.out.println(length);

        //charAt
        for(int i=0;i<length;i++){
            System.out.println(fullName.charAt(i));;
        }

        //compare
        if(firstName.compareTo(lastName)==0){
            System.out.println("Strings are same.");
        }
        else if (firstName.compareTo(lastName)>0) {
            System.out.println("String 1 is greater.");
        }
        else
        System.out.println("String 2 is greater.");

        //substring (endIndex is not included)
        String sub=fullName.substring(0, 6);
        System.out.println(sub);
        sc.close();
    }
}
