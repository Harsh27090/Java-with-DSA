package Recursion.lvl2;

public class r15 {
    static String[] keypad={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    // time complexity = O(4^n)
    public static void printCombos(String str,int idx,String combos){
        if(idx==str.length()){
            System.out.println(combos);
            return;
        }

        char currChar=str.charAt(idx);
        // here 0 is subtracted to convert the value to int as char-char=int
        String mapping=keypad[currChar-'0'];

           // here for each character of string(here str), loop runs for the character at next index.
              // example, first for d - dg,dh,di
                 // then d changes to next index (e) and same things occur for it 
        for(int i=0;i<mapping.length();i++){
            printCombos(str, idx+1, combos+mapping.charAt(i));
        }

    }
    public static void main(String[] args) {
        String str="23";
        printCombos(str, 0, "");
    }
}
