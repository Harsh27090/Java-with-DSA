//array of objects (objects must be there to create an array of objects.)

package Array.Array;
import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;
    }
    
public class a7 {
    public static void main(String[] args) {
        // int size=5;
        Scanner sc=new Scanner(System.in);
        
        //creating objects
        Student stud1=new Student();
        stud1.rollNo=sc.nextInt();
        stud1.name=sc.next();
        stud1.marks=sc.nextInt();

        Student stud2=new Student();
        stud2.rollNo=sc.nextInt();
        stud2.name=sc.next();
        stud2.marks=sc.nextInt();

        Student stud3=new Student();
        stud3.rollNo=sc.nextInt();
        stud3.name=sc.next();
        stud3.marks=sc.nextInt();

        //declaring array for objects
        Student [] stud=new Student[3];
           //assigning objects to the array
        stud[0]=stud1;
        stud[1]=stud2;
        stud[2]=stud3;

        for(int i=0;i<3;i++){
            System.out.println(stud[i].rollNo + " : "+ stud[i].name + " : " + stud[i].marks);
        }
        sc.close();

          


        }

}
