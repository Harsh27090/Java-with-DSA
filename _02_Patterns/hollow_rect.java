// import java.util.*;
package _02_Patterns;
public class hollow_rect{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);

        int n=4;
        int m=20;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
