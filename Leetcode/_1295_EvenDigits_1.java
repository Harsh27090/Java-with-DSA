package Leetcode;

class _1295_EvenDigits_1 {
    public static int findNumbers(int[] nums) {
        int count=0;
        for (int i : nums) {
            if(isEven(i)==true){
                count++;
            }
        }
        return count;
    }
    public static boolean isEven(int i){
        if(noOfDigits(i)%2==0){
            return true;
        }
        else
        return false;
    }
    public static int noOfDigits(int i){
        if(i<0){
            i*=-1;
        }
        if(i==0){
            return 1;
        }
        int digits=0;
        while(i>0){
            digits++;
            i/=10;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        int noOfEvenDigits=findNumbers(nums);
        System.out.println(noOfEvenDigits);
    }
}
