// first and last occurance of a character in a string.

package Recursion.lvl2;

public class r9 {
     static int first=-1;
     static int last=-1;

     // time complexity = O(n) , n = stringLength
     public static void occurance(String str,char c,int index){
         if(index<0){
            return;
         }

         if(str.charAt(index)==c){
            if(last==-1){
                last=index;
            }
            first=index;
         }
         occurance(str, c, index-1);
        }

    public static void main(String[] args) {
        String str="HarshChauhan";
        char c='a';
        int index=str.length()-1;
        occurance(str, c,index);
        System.out.println("First occurance : "+first);
        System.out.println("Last occurance : "+last);
    }
}
