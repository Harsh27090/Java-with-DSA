//reverse the string

package Strings;
import java.util.*;
public class s6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        sc.close();
    }
}
