// print all permutations of a string

package Recursion.lvl3;

public class r16 {

    public static void permutations(String str,String perms){
        if(str.length()==0){
            System.out.println(perms);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            permutations(newStr, perms+currChar);
        }
        
    }

    public static void main(String[] args) {
        String str="abc";

        permutations(str,"");
    }
    
}
