package com.torryharris.collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String>stringHashSet=new HashSet<>();
        stringHashSet.add("abcd");
        stringHashSet.add("efgh");
        stringHashSet.add("India");
        stringHashSet.add("Hindustan");
        stringHashSet.add(" ");
        stringHashSet.add(null);
        System.out.println(stringHashSet);
        System.out.println(stringHashSet.contains("abcd"));
        System.out.println(stringHashSet.contains("abc"));
        System.out.println(stringHashSet.contains("ABCD"));
        stringHashSet.remove("efgh");
        System.out.println(stringHashSet);

        System.out.println("numbers");
        HashSet<Integer>integerHashSet=new HashSet<>();
        integerHashSet.add(10);
        integerHashSet.add(20);
        integerHashSet.add(30);
        System.out.println(integerHashSet);
        integerHashSet.remove(30);
        System.out.println(integerHashSet);
        integerHashSet.add(null);
        System.out.println(integerHashSet);

        System.out.println("double");
        HashSet<Double>doubleHashSet=new HashSet<>();
        doubleHashSet.add(10.0);
        doubleHashSet.add(9.4);
        doubleHashSet.add(8.0);
        System.out.println(doubleHashSet);
        System.out.println(doubleHashSet.contains(10.0));
        System.out.println(doubleHashSet.contains(100.0));
        System.out.println(doubleHashSet.isEmpty());
        doubleHashSet.clear();
        System.out.println(doubleHashSet.isEmpty());
        System.out.println(doubleHashSet);
    }
}
