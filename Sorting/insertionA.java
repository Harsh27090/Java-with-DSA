package Sorting;

public class insertionA {

    public static void main(String[] args) {
        int a[]={8,4,7,2,9};

        //insertion sort
        for(int i=1;i<a.length;i++){
            int current=a[i];
            int j=i-1;
            // current element goes to place till which it is small
            while(j>=0 && current<a[j]){
                a[j+1]=a[j];
                j--;
            }
            // coz of j-- instead of a[j] , we r using a[j+1]
            a[j+1]=current;
            System.out.println();
            for(int k=0;k<a.length;k++) {
                
                System.out.print(a[k]+" ");
            }
        }
        
             
        
        }
}
