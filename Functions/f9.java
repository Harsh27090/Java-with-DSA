//count total positive nos. ,negative nos. ,zeros

package Functions;
import java.util.*;

public class f9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[999];
        System.out.println("Enter nos. one by one. \nType done when finished.");
        int count=0;

        for(int i=0;i<999;i++){
            System.out.println("Enter : ");
            arr[i]=sc.nextLine();
            count++;
            if(arr[i].equalsIgnoreCase("done"))
            break;
        }
        sc.close();

        System.out.println();
        System.out.println();

        for(int i=0;i<count-1;i++){
        System.out.println(arr[i]);
        }

        int number[]=new int[count-1];
        for(int i=0;i<count-1;i++){
            number[i]=Integer.parseInt(arr[i]);
        }

        int poscount=0;
        int negcount=0;
        int zerocount=0;

        for(int i=0;i<count-1;i++){
            if(number[i]==0)
            zerocount++;
            else if(number[i]>0)
            poscount++;
            else
            negcount++;
        }

        System.out.println("Positive nos : "+poscount);
        System.out.println("Negative nos. : "+negcount);
        System.out.println("Zeros : "+zerocount);
        // System.exit(0); (to terminate program)
        
    }
}