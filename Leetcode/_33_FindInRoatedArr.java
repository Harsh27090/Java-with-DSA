package Leetcode;

public class _33_FindInRoatedArr {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(arr,target));
    }
    
    static int search(int[] arr,int target){
        int pivot=pivot(arr);

        if(pivot==-1){
            return BS(arr,target,0,arr.length-1);
        }

        if(arr[pivot]==target){
            return pivot;
        }

        if(arr[0]<=target){
            return BS(arr, target, 0,pivot-1);
        }

        else{  /*arr[0]>arr[pivot] */
            return BS(arr, target, pivot+1, arr.length-1);
        }
    }

    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    static int BS(int[] arr,int target,int start,int end){

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
