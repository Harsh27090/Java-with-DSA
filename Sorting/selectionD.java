package Sorting;

public class selectionD {
    public static void main(String[] args) {
        int a[]={5,3,9,2,8,7};

        for(int i=0;i<a.length;i++){
            int index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[index]){
                    index=j;
                }

            }
            int t=a[index];
            a[index]=a[i];
            a[i]=t;
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
