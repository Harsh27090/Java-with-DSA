package BitManipulation;

public class clear {
    public static void main(String[] args) {
        int a=7; //0111

        int pos=1;
        int bitmark=1<<pos;

        int new_a = a&(~bitmark);
        // 0101 = 5

        System.out.println(new_a);
    }
}
