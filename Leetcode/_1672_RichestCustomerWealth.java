package Leetcode;
public class _1672_RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] person:accounts){
            int rowSum=0;
            for(int account:person){
                rowSum+=account;
            }
            if(rowSum>max){
                max=rowSum;
            }
        }
        return max;
    }

    public static void main(String args[]){
        int[][] accounts={{1,2,3},{3,2,1}};
        int maxWealth=maximumWealth(accounts);
        System.out.println(maxWealth);
    }
}
