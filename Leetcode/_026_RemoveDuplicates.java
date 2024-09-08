package Leetcode;
import java.util.*;
class _026_RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> newSet=new LinkedHashSet<>();
        for(int i:nums){
            newSet.add(i);
        }
        int index=0;
        for(int i:newSet){
            nums[index++]=i;
        }
        return newSet.size();
    }
    public static void main(String args[]){
        int[] nums={1,1,2};
        _026_RemoveDuplicates sol=new _026_RemoveDuplicates();
        int newLength=sol.removeDuplicates(nums);
        for(int i=0;i<newLength;i++){
            System.out.print(nums[i]+" ");
        }
    }
}