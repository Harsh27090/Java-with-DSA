// import java.util.*;
package _02_Patterns;
public class inv_half_pym{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);

        int n=7;

        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
