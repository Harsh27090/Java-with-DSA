package Leetcode;
class _001_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
     int [] arr=new int [2];
     for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                arr[0]=i;
                arr[1]=j;
                return arr;
            }
        }
        }   
        return null;
    }
    public static void main(String args[]){
        int nums[]={2,3,11,15};
        int target=14;
        int arr[]=new int[2];
        arr=twoSum(nums,target);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}