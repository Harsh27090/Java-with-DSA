package BitManipulation;
import java.util.*;
public class update {
    public static void main(String[] args) {
        int a=7; //0111
        Scanner sc=new Scanner(System.in);
        System.out.print("Change to : ");
        int opr=sc.nextInt();
        if(opr==1){
            System.out.print("Enter the position : ");
            int pos=sc.nextInt();
            int bitmark=1<<pos;
            int new_a=a|bitmark;
            System.out.print("New no. : "+new_a);
        }
        else if(opr==0){
            System.out.print("Enter the position : ");
            int pos=sc.nextInt();
            int bitmark=1<<pos;
            int nb=~bitmark;
            int new_a=a&nb;
            System.out.println("New no. : "+new_a);
        }
        else
        System.out.println("Invalid !");
        sc.close();
    }
}
