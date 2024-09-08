// finding floor
// - find the biggest no. which is <=target

package Array.BinarySearchAlgo;
public class _04_Floor {
    public static void main(String[] args) {
        int[] arr={1,3,4,7,14,16,21,27};
        int target=20;
        int floorIdx=floor(arr,target);
        System.out.println(floorIdx);
    }

    public static int floor(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        // not needed as it returns -1 by default
        if(target<arr[0]){
            return -1;
        }

        while(start<=end){
            // this formula is used for less errors,in case start+end > capacity of int
            int midIdx=start+ (end-start)/2;
            if(target < arr[midIdx]){
                end=midIdx-1;
            }
            else if(target > arr[midIdx]){
                start=midIdx+1;
            }
            else{
                return midIdx;
            }
        }
        // coz afte the loop,scene is like [end,target,start] ,
        // and we are searching for a no. <= target , 
        // so here that no. will be at end

       return end;


    }
}
