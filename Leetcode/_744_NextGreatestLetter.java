package Leetcode;

class _744_NextGreatestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;

        if(target > letters[end]){
            return letters[0];
        }

        while(start<=end){
            int midIdx= start + (end-start)/2;

            if(target < letters[midIdx])
            end=midIdx-1;
            else
            start=midIdx+1;
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args){
        char[] letters={'c','f','j'};
        char target='a';
        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
}