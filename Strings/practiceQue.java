//problem questions CodeWithHarry

package Strings;

public class practiceQue {
    public static void main(String[] args) {
        String str="I am Harsh Chauhan.";
        System.out.println(str);
        
        //problem1
        String lowerCase=str.toLowerCase();
        System.out.println(lowerCase);

        //problem2
        String str1="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
            str1+='_';
            else
            str1+=str.charAt(i);
        }
        System.out.println(str1);

        //problem3
        String letter="Dear <|name|>,thanks a lot!";
        System.out.println(letter);
        letter=letter.replace("<|name|>","Harsh");
        System.out.println(letter);

        //problem4
        String sent="This sentence  has  double and   triple spaces.";
        System.out.println("\n"+sent);
        int doubleSpace;
        int tripleSpace;
         // for(int i=2;i<sent.length();i++){
         //     if(sent.charAt(i)==' '){
         //         if(sent.charAt(i-1)==' '){
         //             doubleSpace++;
         //             if(sent.charAt(i-2)==' ')
         //             tripleSpace++;
         //         }
         //     }    
         // }
         // if(doubleSpace>0)
         // System.out.println("Double spaces detected.");
         // if(tripleSpace>0)
         // System.out.println("Triple spaces detected.");
        doubleSpace=sent.indexOf("  ");        
        tripleSpace=sent.indexOf("   ");
        if(doubleSpace>0)
        System.out.println("Double spaces detected.");
        if(tripleSpace>0)
        System.out.println("Triple spaces detected.");

        //problem5
        String letter1=new String("Dear Harsh,This java course is nice.Thanks");
        letter1="Dear Harsh,\n\tThis java course is nice.\n\tThanks";
        System.out.println(letter1);
    }
}
