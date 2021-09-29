package com.torryharris.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>students=new HashMap<>();
        students.put(1001,"Amar");
        students.put(1002,"Akbar");
        students.put(1003,"Anthony");
        students.put(1001,"Kohli");
        System.out.println(students);

        System.out.println(students.get(1001));

        System.out.println(" ");
        HashMap<String,String>student=new HashMap<>();
        student.put("One","Kohli");
        student.put("Two","Dhoni");
        student.put("Three","Sachin");
        System.out.println(student);
        System.out.println(student.get("One"));

        System.out.println(" ");
        System.out.println("Keys");
        for (String keys:student.keySet()){
            System.out.println(keys);
        }

        System.out.println(" ");
        System.out.println("Values");
        for (String values:student.values()){
            System.out.println(values);
        }
        System.out.println(" ");
        System.out.println("Single value");
        for(String st:student.keySet()){
            System.out.println(student.get(st));
        }
        System.out.println("Entry Set");
        System.out.println("Single values using entry");
        for(Map.Entry<String,String>studentEntry:student.entrySet()){
            System.out.println(studentEntry);
            System.out.println("Key: "+studentEntry.getKey()+"/ Values: "+studentEntry.getValue());
        }
/*
        System.out.println(" ");
        System.out.println("Single keys");
        for(String st:student.values()){
            System.out.println(student.get(st));
        }
*/
    }
}
