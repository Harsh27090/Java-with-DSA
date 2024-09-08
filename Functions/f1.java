//print your name

package Functions;
import java.util.*;

public class f1 {
    public static void printMyName(String name){
        System.out.println("Your name is "+name);
        return;
    }

    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        printMyName(name);
        sc.close();
    }
}
