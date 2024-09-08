package Sorting;

public class bubbleD {
    public static void main(String[] args) {
        int a[]={2,7,3,9,4,8};

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]<a[j+1]){
                    //swap
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
