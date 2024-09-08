package Leetcode;

class _009_PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);
        }
        if(str.compareTo(revStr)==0)
        return true;
        else
        return false;
    }

    public static void main(String args[]){
        int x=121;
        boolean ans=isPalindrome(x);
        System.out.println(ans);
    }

}
