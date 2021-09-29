package com.torryharris.collection;

import com.torryharris.comparator.CarPowerComparator;
import com.torryharris.comparator.PersonNameComparator;
import com.torryharris.model.Car;
import com.torryharris.model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class CarArrayListDemo {
    public static void main(String[] args) {
        Car c1=new Car(1001,"Swift","Petrol",700.0f);
        Car c2=new Car(1002,"Swift","Petrol",700.0f);
        Car c3=new Car(1003,"Scorpio","Petrol",1000.0f);
        Car c4=new Car(1005,"Nexon","Diezel",500.0f);
        Car c5=new Car(1007,"Dzire","Diezel",600.0f);

        ArrayList<Car>carArray=new ArrayList<>();
        carArray.add(c1);
        carArray.add(c2);
        carArray.add(c3);
        carArray.add(c4);
        carArray.add(c5);
        for(Car cA:carArray){
            System.out.println(cA);
        }
        System.out.println(" ");
        TreeSet<Car>carArray1=new TreeSet<>(new CarPowerComparator());
        carArray1.add(c1);
        carArray1.add(c2);
        carArray1.add(c3);
        carArray1.add(c4);
        carArray1.add(c5);
        for(Car cT:carArray1){
            System.out.println(cT);
        }

        System.out.println(" ");
        HashMap<String,Car>carHash= new HashMap<>();
        carHash.put(c1.getCarName(),c1);
        carHash.put(c2.getCarName(),c2);
        carHash.put(c3.getCarName(),c3);
        carHash.put(c4.getCarName(),c4);
        carHash.put(c5.getCarName(),c5);
        for (Map.Entry<String,Car>entry: carHash.entrySet() ){
            System.out.println(entry.getKey()+" " +entry.getValue());
        }

    }
}
