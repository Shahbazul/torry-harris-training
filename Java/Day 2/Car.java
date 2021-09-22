public class Car {
    private String name;
    private String fuelType;
    private int engineCapacity;
    private float power;
    private int noOfGears;
    private Tyre tyre;
    private MusicSystem ms;

    public Car() {
    }


    public Car(String name, String fuelType, int engineCapacity, float power, int noOfGears, Tyre tyre,MusicSystem ms) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.noOfGears = noOfGears;
        this.tyre=tyre;
        this.ms = ms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void accelerate(){
        System.out.println(name+" Car is accelerating");
    }

    public void applyBreak(){
        System.out.println(name+" Car is slowing/stopping");
    }

    public void changeGear(int gear){
        if (gear<0 || gear > noOfGears)
            System.out.println("wrong gear selected!!");
        else
            System.out.println("Gear changed to "+gear);
    }

    public void steer(){
        System.out.println(name+" Car is changing direction");
    }

    public MusicSystem getMs() {
        return ms;
    }

    public void setMs(MusicSystem ms) {
        this.ms = ms;
    }




    public void displayFeatures(){
        System.out.println("Features of "+name+" car: ");
        System.out.println("--------------------------");
        System.out.println("Engine Capacity: "+engineCapacity+" CC");
        System.out.println("Fuel Type: "+fuelType);
        System.out.println("Power: "+power+" BHP");
        System.out.println("No of Gears: "+noOfGears);

        System.out.println("Tyre name: "+tyre.getTyreName()+" Size: "+tyre.getSize());
        System.out.println("Music System----->"+ "name: " +ms.getName()+ "/ Number Of Speakers "+ms.getNoOfSpeaker()+"/ Screen Size: "
                +ms.getLcdScreenSize()+"/ Woofer "+ms.isSubWoofer());

        System.out.println();
    }
}










