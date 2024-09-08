package Static;
class Mobile {
    String brand;
    int price;
    //static variable
    static String name;

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}

public class staticVariables {

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

        //changing value to static variable
        Mobile.name="SmartPhone";


        mob1.show();
        mob2.show();
        mob3.show();



        
    }

}
