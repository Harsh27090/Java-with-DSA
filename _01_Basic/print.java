package _01_Basic;

import java.util.*;
public class print {

    public static void main(String[] args) {
        
        System.out.println("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Your name is : " + name);
        sc.close();
    } 
}