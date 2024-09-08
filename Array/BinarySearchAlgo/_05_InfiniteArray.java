// algo is only valid for an infinite array , as end may go out of bound , as we are not using arr.length

package Array.BinarySearchAlgo;
public class _05_InfiniteArray {
    public static void main(String[] args) {
        int[] arr ={1,3,5,8,15,18,23,27,38,46,49,53,76,78,82,83,87,92,95,95,98,102,106,111,126};
        int target=38;
        int idx=search(arr, target);
        System.out.println(idx);
    }

    public static int search(int []arr,int target){
        int start=0;
        int end=1;

        while(target > arr[end]){
            // means target is not between start and end thats why we will then search after end (end+1)
            int newStart=end+1;
            // doubling the size of searching box
            // - end= previous end + (size of box)*2
            end=end+ (end-start+1)*2;
            // newStart is used as temp variable as we need to use
            start=newStart;
        }

        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target,int start,int end){
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
        return -1;
    
        }
}
