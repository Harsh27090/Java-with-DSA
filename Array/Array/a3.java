package Array.Array;

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");        
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter no. "+i+": ");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("The max no. is : "+max);
        sc.close();
    }
}
