// array must be sorted 
// - then finding whether the array is sorted in asc or desc 
// - then applying binary search according to the sorting
package Array.BinarySearchAlgo;

public class _02_OrderAgnosticBS {
    public static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

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
        int[] arr = { 2, 2, 6, 9, 15, 15, 29, 31 };
        int target = 29;
        int targetIdx = orderAgnosticBS(arr, target);
        System.out.println(targetIdx);
    }
}
