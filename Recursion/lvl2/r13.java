// to print all the subsequences of a string

package Recursion.lvl2;

public class r13 {
    // time complexity = O(2^(n+1)) = O(2^n)
    public static void subSequences(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        
        char currChar=str.charAt(idx);
        // current character wants to join the string
        subSequences(str, idx+1, newStr+currChar);
        
        // current character wants to join the string
        subSequences(str, idx+1, newStr);
    }

    public static void main(String[] args) {
        String str="abc";
        subSequences(str,0,"");
    }
}
