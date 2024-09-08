// the array must be sorted
package Array.BinarySearchAlgo;
// time complexity = O(logn)
public class _01_BinarySearch {
    static int find(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            // this formula is used for less errors,in case start+end > capacity of int
            int midIdx=start+ (end-start)/2;
            if(target < arr[midIdx]){
                end=midIdx-1;
            }
            else if(target > arr[midIdx]){
                start=midIdx+1;
            }
            else{  //ans found
                return midIdx;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,13,18,25,34,68,74,97};
        int target=25;
        int ans=find(arr,target);
        System.out.println(ans);
    }


}
