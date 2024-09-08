//greater of 2 nos.
//greater of 3 nos. (using function overloading)

package Functions;

import java.util.*;

public class f8 {
    public static void greater(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater.");
        } else
            System.out.println(b + " is greater.");
    }

    // function overloading (name of more than 1 functions are same but either the
    // no. of parameters is more or the data type is different. )

    // public static void greater(int a,int b,int c){
    // if(a>b && a>c)
    // System.out.println(a+" is greatest.");
    // else if(b>a && b>c)
    // System.out.println(b+" is greatest.");
    // else
    // System.out.println(c+" is greatest.");
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int c = sc.nextInt();
        greater(a, b);
        // greater(a, b, c);
        sc.close();
    }

}
