//2D array

package Array.Array;

import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int row=sc.nextInt();
        System.out.println("Enter no. of columns : ");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print ("Enter value for arr["+i+"]["+j+"] : ");
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("Your array is : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter a no. to be found : ");
        int n=sc.nextInt();
        System.out.print("The given no. is found at index : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (arr[i][j]==n) {
                    System.out.print("["+i+"]["+j+"] ");
                }
            }
        }
        sc.close();
    }
}
