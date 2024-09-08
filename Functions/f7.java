//sum of first n odd nos.

package Functions;
import java.util.Scanner;

public class f7 {
    public static int OddSum(int n){
        int sum=0;
        for(int i=1;i<=2*n-1;i++){
            sum=sum+i;
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int sum=OddSum(n);
        System.out.println("The sum of first "+n+" odd nos. is : "+sum);
        sc.close();
    }
}