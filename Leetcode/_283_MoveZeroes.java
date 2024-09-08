package Leetcode;

class _283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index=0;

        for(int i:nums){
            if(i != 0){
                nums[index++]=i;
            }
        }

        while(index<nums.length){
            nums[index++]=0;
        }

    }

    public static void main(String args[]){
        int[] nums={0,1,0,3,12};
        _283_MoveZeroes sol=new _283_MoveZeroes();
        sol.moveZeroes(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
