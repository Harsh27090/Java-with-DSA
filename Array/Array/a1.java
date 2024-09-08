//array

package Array.Array;
import java.util.*;
public class a1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter a no. "+ (i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
