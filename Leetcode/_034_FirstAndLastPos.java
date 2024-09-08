package Leetcode;
import java.util.Arrays;
class _034_FirstAndLastPos {
    public static int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};

        int start=search(nums,target,true);
        int end=search(nums,target,false);

        arr[0]=start;
        arr[1]=end;

        return arr;
    }

    static int search(int[] nums,int target,boolean occur){
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int midIdx= start + (end-start)/2;

            if(target>nums[midIdx]){
                start=midIdx+1;
            }
            else if(target<nums[midIdx]){
                end = midIdx-1;
            }
            else{
                ans=midIdx;
                // for first occurence
                if(occur){
                    end=midIdx-1;
                }
                // for last occurence
                else{
                    start=midIdx+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] ans=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
}