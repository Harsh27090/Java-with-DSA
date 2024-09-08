package Sorting;

public class selectionA {
    public static void main(String[] args) {
        int a[]={5,7,9,1,3,8};
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();
        // selection sort
           // time complexity O(n^2)
        for(int i=0;i<a.length-1;i++){
            System.out.println();
            int index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[index]>a[j]){
                    index=j;
                }
            }
            //swap
            int t=a[index];
            a[index]=a[i];
            a[i]=t;

            for(int k=0;k<a.length;k++){
                System.out.print(a[k]+" ");
            }
        }
        System.out.println();
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
