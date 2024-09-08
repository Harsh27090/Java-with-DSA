package Leetcode;

class _027_RemoveElement {
    public static int removeElement(int nums[], int val) {
        int index=0;
        for(int i:nums){
            if(i!=val){
                nums[index++]=i;
            }
        }
        return index;
    }

    public static void main(String args[]){
        int[] nums={3,2,2,3};
        int val=3;
        int newLength=removeElement(nums,val);
        for(int i=0;i<newLength;i++){
            System.out.println(nums[i]);
        }
    }
}
