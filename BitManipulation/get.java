// to know the bit at the desired position

package BitManipulation;

public class get {
    public static void main(String[] args) {
        
        int a=10;  // 1010

        int pos=1;
        int bitmark=a<<pos;

        if ((a&bitmark)==0) {
            System.out.println("Bit was one.");
        }
        else
        System.out.println("Bit was zero.");
    }
}
