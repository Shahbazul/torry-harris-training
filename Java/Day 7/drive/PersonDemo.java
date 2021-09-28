package com.torryharris.drive;

import com.torryharris.model.Employee;
import com.torryharris.model.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1=new Person(987654321012l,"kohli","Delhi","Cricketer");
        Person p2=new Person(987654321021l,"Dhoni","Rachi","Cricketer");
        Person p3=new Person(987654321011l,"Zaheer","Maharashtra","Cricketer");


        ArrayList<Person>pList= new ArrayList<>();
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);


        for(Person pl:pList){
            System.out.println(pl);
        }


        System.out.println("After sorting");
        pList.sort(null);
        Iterator<Person> personIterator=pList.iterator();
        while(personIterator.hasNext()){
            System.out.println(personIterator.next());
        }

    }

}
