package Array.BinarySearchAlgo.RotatedArray;

public class _06_PivotInRoatatedArr {
    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;
            // all 4 cases
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

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int pivot=pivot(arr);
        System.out.println(pivot);
    }
}
