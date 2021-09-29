package com.torryharris.collection;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer>integerTreeSet=new TreeSet<>();
        integerTreeSet.add(10);
        integerTreeSet.add(5);
        integerTreeSet.add(20);
        integerTreeSet.add(22);
        integerTreeSet.add(1);
        integerTreeSet.add(15);
        System.out.println(integerTreeSet);
        integerTreeSet.add(18);
        System.out.println(integerTreeSet);
        integerTreeSet.clear();
        System.out.println(integerTreeSet);

        TreeSet<String>stringTreeSet=new TreeSet<>(Collections.reverseOrder());
        stringTreeSet.add("abcd");
        stringTreeSet.add("lmno");
        stringTreeSet.add("ijkh");
        stringTreeSet.add("efgh");
        System.out.println(stringTreeSet);
        stringTreeSet.remove("ijkh");
        System.out.println(stringTreeSet);

        TreeSet<Double>doubleTreeSet=new TreeSet<>();
        doubleTreeSet.add(10.0);
        doubleTreeSet.add(100.0);
        doubleTreeSet.add(5.7);
        doubleTreeSet.add(20.8);
        System.out.println(doubleTreeSet);

    }
}
