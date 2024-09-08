package Static;


class Mobile {
    String brand;
    int price;
    static String name;
    
    public void show(){
        // System.out.println(brand+" : "+price+" : "+name);
        System.out.println("in constructor...");
    }
    
    // static block (executed only one time.)
    static{
        System.out.println("in static block...");
    }
}

public class staticBlock {

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

        

        // Mobile.show1(mob1);
        // Mobile.show1(mob2);
        // Mobile.show1(mob3);
        
    }

}
