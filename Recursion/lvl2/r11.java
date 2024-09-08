// shifting all specific charaters to the end of the string 

package Recursion.lvl2;

public class r11 {
    // time complexity = O(n+count) = O(n+n) = O(2n) = O(n)
    public static String newStr(String str,int index,char c,String newStr,int count){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newStr+=c;
            }
            return newStr;
        }
        char currChar=str.charAt(index);
        
        if(currChar==c){
            count++;
            return newStr(str, index+1,c,newStr,count);
            
        }
        
        else{
            newStr+=currChar;
            return newStr(str, index+1,c,newStr,count);
        }
    }
    public static void main(String[] args) {
        String str="abxcxxdefxghi";
        char c='x';
        String newStr=newStr(str,0,c,"",0);
        System.out.println(newStr);
    }
}
