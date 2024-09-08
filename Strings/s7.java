//StringBuilder and operations

package Strings;

public class s7 {
    public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("Harsh");
    System.out.println(sb);

    //set a character (replaces character)
    sb.setCharAt(0,'M');
    System.out.println(sb);

    //insert a character
    sb.insert(2, 'y');
    System.out.println(sb);

    //delete characters
    sb.delete(4, 6);
    System.out.println(sb);

    //append (appends (adds) character at last)
    sb.append(" Chauhan");
    System.out.println(sb);

    System.out.println(sb.length());

}

}
