package Static;
class Mobile {
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }

    //static method (cannot be used by non-static variables)
       //means brand and price cannot be accessed directly. 
          //thus object is needed to be provided as a parameter.
    public static void show1(Mobile mob){
        System.out.println(mob.brand+" : "+mob.price+" : "+name);
    }
}

public class staticMethods {

    public static void main(String[] args) {
        Mobile mob1=new Mobile();
        mob1.brand="Apple";
        mob1.price=1500;

        Mobile mob2=new Mobile();
        mob2.brand="Oneplus";
        mob2.price=800;

        Mobile mob3=new Mobile();
        mob3.brand="Samsung";
        mob3.price=1700;

        Mobile.name="SmartPhone";
        mob1.show();
        mob2.show();
        mob3.show();

        Mobile.show1(mob1);
        Mobile.show1(mob2);
        Mobile.show1(mob3);
        
    }

}
