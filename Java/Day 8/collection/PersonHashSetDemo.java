package com.torryharris.collection;

import com.torryharris.model.Person;

import java.util.HashSet;

public class PersonHashSetDemo {
    public static void main(String[] args) {
        Person p1=new Person(101,"Kohli","Cricketer","Bangalore");
        Person p2=new Person(102,"Dhoni","Manager","Kolkata");
        Person p3=new Person(101,"Kohli","Cricketer","Delhi");
        HashSet<Person>personHashSet=new HashSet<>();
        personHashSet.add(p1);
        personHashSet.add(p2);
        personHashSet.add(p3);
        System.out.println(p1.hashCode());
        System.out.println(p1.equals(p3));

        for(Person person:personHashSet){
            System.out.println(person);
        }
    }
}
