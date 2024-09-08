// non repeating (unique) subsequences of a string

package Recursion.lvl2;

import java.util.HashSet;

public interface r14 {
    // time complexity = O(2^(n+1)) = O(2^n)
    public static void subSeqWOrep(String str,int idx,String newStr,HashSet<String> set){
        if(idx==str.length()){
            // whether set contains the string or not 
            if (set.contains(newStr)) {
                return;
            }
               // if does not contain print the string and add the string to the set.
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar=str.charAt(idx);

        //wants to join the string
        subSeqWOrep(str, idx+1, newStr+currChar, set);
        //does not want to join the string
        subSeqWOrep(str, idx+1, newStr, set);
    }

    public static void main(String[] args) {
        String str="aaabb";
        HashSet<String> set=new HashSet<>();
        subSeqWOrep(str, 0, "",set);
    }
}
