// factorial of n

package Recursion.lvl1;

public class r3 {
    public static int fact(int n){
    
        if(n==1 || n==0)
        return 1;
        
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        int n=6;
        int fact=fact(n);
        System.out.println("The factorial of "+n+" is : "+fact);
    }
}
