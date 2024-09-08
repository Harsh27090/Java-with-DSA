//average of 3 nos.

package Functions;
import java.util.*;
public class f6 {
    public static int avg(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=avg(a, b, c);
        System.out.println("The average of given nos. is : "+avg);
        sc.close();
    }
}
