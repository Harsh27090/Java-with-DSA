package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class _2dArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        // initialisation of list
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        // to add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
        System.out.println(list.get(0));
        sc.close();
    }
}
