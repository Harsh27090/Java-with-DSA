// method overloading

package Methods;
import java.util.Scanner;

class greater{
  
    public static int great(int a,int b){
        if(a>b)
        {
        System.out.println(a+" is greater.");
        return 0;
        }
        else{
        System.out.println(b+" is greater.");
        return 0;
        }

    }

    public int great(int a,int b,int c){
        if(a>b && a>c){

            System.out.println(a+" is greatest.");
            return 0;

        }
        else if(b>a && b>c){

            System.out.println(b+" is greatest.");
            return 0;
        }
        else{
            
            System.out.println(c+" is greatest.");
            return 0;
        }
    }
}

public class m2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();

           // new object need to use non-static method
        greater x=new greater();

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        // can access static method directly using class name
        greater.great(a, b);

        // cannot access non-static method without an object.
        x.great(a, b, c);
        sc.close();
        
        
    }
}
