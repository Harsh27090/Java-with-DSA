//spiral matrix

package Array.Array;
import java.util.Scanner;
public class a6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int row=sc.nextInt();
        System.out.println("Enter no. of columns : ");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        //array input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print ("Enter value for arr["+i+"]["+j+"] : ");
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        //variable declaration
        int rowbegin=0;
        int rowend=row-1;
        int colbegin=0;
        int colend=col-1;
        
        while (rowbegin<=rowend && colbegin<=colend) {
            //colbegin to colend 
            for(int j=colbegin;j<=colend;j++){
                System.out.print(arr[rowbegin][j]+" ");
            }
                //rowbegin completed
            rowbegin++;

            //rowbegin to rowend 
            for(int j=rowbegin;j<=rowend;j++){
                System.out.print(arr[j][colend]+" ");
            }
                //colend completed
            colend--;

            //colend to colbegin
            for(int j=colend;j>=colbegin;j--){
                System.out.print(arr[rowend][j]+" ");
            }
                //rowend completed
            rowend--;

            //rowend to rowbegin
            for(int j=rowend;j>=rowbegin;j--){
                System.out.print(arr[j][colbegin]+" ");
            }
                //colbegin completed
            colbegin++;
        }
        sc.close();
    }
}
