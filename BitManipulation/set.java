// set bit - changes 0 to 1 at the desired position

package BitManipulation;

public class set {
    public static void main(String[] args) {
        int a=5;   //0101

        // pos is the position where you want to set the bit.
        int pos=1;
        int bitmark=1<<pos;


        int new_a=a|bitmark;
        System.out.print(new_a);
    }
}
