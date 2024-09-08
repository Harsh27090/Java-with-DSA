//to find combined length of strings in an array

package Strings;
import java.util.*;
public class s3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        String names[]=new String[size];
        System.out.println("Enter names one by one : ");
        for(int i=0;i<size;i++){
            System.out.print("Enter name "+(i+1)+" : ");
            names[i]=sc.next();
        }
        int totalLength=0;
        for(int i=0;i<size;i++){
            totalLength=totalLength+names[i].length();
        }
        System.out.println("The combined length is : "+totalLength);
        sc.close();
    }
}
