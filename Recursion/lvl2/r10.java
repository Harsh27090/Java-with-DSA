// check array is strictly increasing or not

package Recursion.lvl2;


public class r10 {

    // time complexity = O(n)
    // static int a=0;
    public static boolean checkSort(int arr[],int index){
        if(index==0){
            return true;
        }

        if(arr[index-1]>=arr[index]){
            // a++;
            return false;
        }
        return checkSort(arr, index-1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        boolean value=checkSort(arr,arr.length-1);
        // if (a==0) {
        //     System.out.println("Array is sorted.");
        // }
        // else
        // System.out.println("Array is not sorted.");
        System.out.println(value);
    }
}
