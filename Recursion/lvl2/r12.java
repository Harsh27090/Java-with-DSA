// remove duplicates from a string
package Recursion.lvl2;

public class r12 {
    static boolean map[]=new boolean[26];   
    
    // time complexity = O(n)
    public static void removeDuplicates(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        // checks whether the character has already occured or not. 
           //if occured then nothing changes in the new string 
           //else the character adds up in the string and its value in map array becomes true.
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newString);
        }
        else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str="abcbbddefbcgghibb";
        removeDuplicates(str, 0, "");
    }
}
