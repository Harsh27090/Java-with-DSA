//reverse string using StringBuilder

package Strings;
import java.util.*;
public class s8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the size of string : ");
        int size=sc.nextInt();
        StringBuilder sb=new StringBuilder("");
        
        for(int i=0;i<size/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
        sc.close();
    }
}
