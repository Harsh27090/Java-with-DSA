package Sorting;
public class sort {
    public static void main(String[] args) {
        
        int arr[]={3,2,5,1,7,1};
        int n=arr.length;
        for(int i=0;i<1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
                
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]);
    }
}
