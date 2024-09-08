// tower of hanoi

package Recursion.lvl2;

public class r7 {

    public static void towerOfHanoi (int n,String src,String helper,String dest){

        if(n==1){
            System.out.println("Disc "+n+" transfered from "+src+" to "+dest);
            return;
        }

        // we are transfering disc from source to helper with the help ofdestination.        
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Disc "+n+" transfered from "+src+" to "+dest);
        // we are transfering disc from helper to destination with the help of source.
        towerOfHanoi(n-1, helper, src, dest);
    }
    
    public static void main(String args[]){
        int n=4;
        towerOfHanoi(n,"S","H","D");
    }
    
}



























