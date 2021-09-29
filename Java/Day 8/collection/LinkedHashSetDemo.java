package com.torryharris.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("ABCD");
        linkedHashSet.add("EFGH");
        linkedHashSet.add("IJKL");
        System.out.println(linkedHashSet);

        LinkedHashSet<Integer>integerLinkedHashSet=new LinkedHashSet<>();
        integerLinkedHashSet.add(10);
        integerLinkedHashSet.add(20);
        integerLinkedHashSet.add(30);
        System.out.println(integerLinkedHashSet);
    }
}
