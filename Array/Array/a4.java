package Array.Array;

import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");        
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter no. "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }

        int a=0;
        for(int i=0;i<size-1;i++){
            if (arr[i]>arr[i+1]) {
                System.out.println("The array is not in ascending order.");
                a++;
                break;
            }
        }
        if(a==0)
        System.out.println("The array is in ascending order.");
        sc.close();
    }
    
}
