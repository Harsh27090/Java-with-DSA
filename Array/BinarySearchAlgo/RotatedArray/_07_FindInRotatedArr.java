package Array.BinarySearchAlgo.RotatedArray;
public class _07_FindInRotatedArr {
    public static void main(String[] args) {
        int[] arr={2,9,2,2,2};
        int target=9;
        System.out.println(search(arr,target));
    }
    
    static int search(int[] arr,int target){
        int pivot=pivot(arr);

        // all 4 cases
        if(pivot==-1){
            // no pivot found thats why normal binary search from 0 to length-1
            return binarySearch(arr,target,0,arr.length-1);
        }

        if(arr[pivot]==target){
            return pivot;
        }

        if(arr[0]<=target){
            // target is greater or = to 1st element that means it is between 0 and pivot-1
            // - coz all the elements after pivot will be smaller than the target
            return binarySearch(arr, target, 0,pivot-1);
        }

        else{  /*arr[0]>arr[pivot] */
            // target is between pivot+1 and length-1
            // - coz all the elements before pivot will greater than the target
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
    }

    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;
            // to handle mid going out of bound
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            // to handle mid going out of bound
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else{
                // start is not mid coz this case might could have caugth before
                start=mid+1;
            }
        }
        return -1;
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
            else{  //ans found
                return midIdx;
            }
        }
        return -1;
    }
}
