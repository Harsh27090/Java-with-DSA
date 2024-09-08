package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class _1dArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(2);
        list.add(43);
        list.add(32);
        list.add(75);
        list.add(436);
        System.out.println(list);

        System.out.println(list.contains(45));
        list.set(0, 45);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        for(int i=0;i<7;i++){
            list.add(sc.nextInt());
        }

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list); 
        System.out.println(list.size());       

        sc.close();
    }
}
