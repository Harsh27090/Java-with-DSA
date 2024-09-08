package Sorting;

public class bubbleA {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]={3,5,2,9,1};

        // bubble sort
           // time complexity O(n^2)
        for(int i=0;i<arr.length-1;i++){
            System.out.println();
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
                printArray(arr);
            }
        }
        printArray(arr);
    }
}
