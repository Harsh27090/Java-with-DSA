// method (objects must be created to use methods.)

package Methods;

class Student{
    int rollNo;
    String name;

    public void print(){
        System.out.println(rollNo+" : "+name);
    }
}

public class m1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.rollNo=1;
        s1.name="Harsh";

        Student s2=new Student();
        s2.rollNo=2;
        s2.name="Pujan";

        s1.print();
        s2.print();

    }
}
