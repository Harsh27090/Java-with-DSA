package Leetcode;
import java.lang.Math;
class _1295_EvenDigits_2 {
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
        // this formula is used to find the no. of digits.
        return (int)(Math.log10(i) + 1);
    }

    public static void main(String[] args) {
        int[] nums={12,3,2,556,1234};
        int noOfEvenDigits=findNumbers(nums);
        System.out.println(noOfEvenDigits);
    }
}
