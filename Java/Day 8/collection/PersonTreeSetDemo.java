package com.torryharris.collection;

import com.torryharris.comparator.PersonCityComparator;
import com.torryharris.comparator.PersonNameComparator;
import com.torryharris.model.Person;

import java.util.TreeSet;

public class PersonTreeSetDemo {
    public static void main(String[] args) {
        Person p1=new Person(101,"Kohli","Cricketer","Bangalore");
        Person p2=new Person(102,"Dhoni","Manager","Kolkata");
        Person p3=new Person(103,"Zaheer","SE","Delhi");
//using comparable
        TreeSet<Person>people=new TreeSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        for (Person person:people) {
            System.out.println(person);
        }

//using comparator
        System.out.println("By Name");
        TreeSet<Person>peopleName=new TreeSet<>(new PersonNameComparator());
        peopleName.add(p1);
        peopleName.add(p2);
        peopleName.add(p3);
        for (Person person1:peopleName) {
            System.out.println(person1);
        }

        System.out.println("By City");
        TreeSet<Person>treeCity=new TreeSet<>(new PersonCityComparator());
        treeCity.add(p1);
        treeCity.add(p2);
        treeCity.add(p3);
        for(Person person2:treeCity){
            System.out.println(person2);
        }

        System.out.println("removing p3");
        treeCity.remove(p3);
        for(Person person2:treeCity){
            System.out.println(person2);
        }
    }
}
