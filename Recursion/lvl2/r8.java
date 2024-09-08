// reverse a string using recursion

package Recursion.lvl2;

public class r8 {

    // time complexity = O(n)
    public static void reverse(int n,String str){
        if(n==0){
            System.out.println(str.charAt(n));
            return;
        }
        
        System.out.println(str.charAt(n));
        reverse(n-1,str);
        
    }
    public static void main(String[] args) {
        
        String str="Harsh";
        int n=str.length();
        reverse(n-1, str);
    }
}
