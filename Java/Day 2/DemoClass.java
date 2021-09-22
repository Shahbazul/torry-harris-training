public class DemoClass {
    public static void main(String[] args) {

        MusicSystem ms = new MusicSystem("Harman",true,20,4);

        Tyre tyre1 = new Tyre("Ceat",20);

        Car nexon = new Car("Nexon","Petrol",1500,93.4f,6,tyre1,ms);


        nexon.accelerate();

        nexon.changeGear(1);
        nexon.changeGear(5);
        nexon.changeGear(6);

        nexon.steer();
        nexon.applyBreak();


        nexon.setMs(ms);
        nexon.displayFeatures();



        Tyre MRF = new Tyre("MRF",22);
        MusicSystem my = new MusicSystem("Harman",true,20,4);
        Car roysRolls = new Car("RaoysRolls","Petrol",2500,100.4f,7,MRF,my);
        roysRolls.displayFeatures();


        Tyre t2 = new Tyre("Ceat",23);
        MusicSystem msy = new MusicSystem("JBL",true,20,4);
        roysRolls.setName("KIA");
        roysRolls.setTyre(t2);
        roysRolls.setMs(msy);
        roysRolls.displayFeatures();
    }
}
