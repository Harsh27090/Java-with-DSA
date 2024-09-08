// same algo in leetcode but int[] is replaced by MoutainArr interface.

package Leetcode;

class _1095_FindElementInMount {
    public static int finalAns(int[] arr,int target){
        int peak=peak(arr);

        int left=binarySearch(arr,target,0,peak);


        if(left!=-1){
            return left;
        }
        
        else {
            int right=binarySearch(arr,target,peak+1,arr.length-1);
            return right;
        }
    }

    public static int peak(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start + (end-start)/2 ;

            if(arr[mid] < arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }

    public static int binarySearch(int[] arr,int target,int start,int end){
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int midIdx = start + (end - start) / 2;

            if (target == arr[midIdx]) {
                return midIdx;
            }
            if (isAsc == true) {
                if (target < arr[midIdx])
                    end = midIdx - 1;
                else
                    start = midIdx + 1;
            }

            else {
                if (target > arr[midIdx])
                    end = midIdx - 1;
                else
                    start = midIdx + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,1};
        int target=3;
        System.out.println(finalAns(arr, target));
    }
}
