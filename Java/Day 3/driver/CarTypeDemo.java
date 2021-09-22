package com.torryharris.driver;

import com.torryharris.model.*;

public class CarTypeDemo {
    public static void main(String[] args) {
        Tyre mrf = new Tyre("MRF",17);
        MusicSystem harman=new MusicSystem("Harman",true,20,4);
        HatchBack swift = new HatchBack("Swift","Petrol",1200,88.7f,5,mrf,harman,"Power");
        swift.displayHatchBackFeatures();

        Sedan dzire = new Sedan("Dzire","Petrol",1600,90.7f,6,mrf,harman,100);
        dzire.displaySedanFeatures();

        Suv rangeRover = new Suv("Range Rover","Petrol",2000,10.7f,7,mrf,harman,"Sports",true);
        rangeRover.displaySuvFeatures();
    }
}
