package Sorting;

public class insertionD {
    public static void main(String[] args) {
        int a[]={8,9,3,6,2,1};

        for(int i=1;i<a.length;i++){
            int current=a[i];
            int j=i-1;
            // current element goes to place till which it is big
            while(j>=0 && current>a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }

        for (int k : a) {
            System.out.print(k+" ");
        }
        
    }
}
