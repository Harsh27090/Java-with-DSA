//1D array

package Array.Array;
import java.util.*;
public class a2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter no. "+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a no. to be found : ");
        int num=sc.nextInt();
        System.out.print("The index of given no. is : ");
        for(int i=0;i<size;i++){
            if (arr[i]==num) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
