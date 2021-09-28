package com.torryharris.drive;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class LinkedListDemo {
    public static void main(String[] args) {
        /*
        String names[]=new String[];
        names[0]="abcd";
        names[1]="efgh";
        */
        LinkedList<String>strList= new LinkedList<>();
        strList.add("abc");
        strList.add("def");
        strList.add("geh");
        System.out.println(strList);


        //strList.addAll(Arrays.asList(names));

        LinkedList<String> list2= new LinkedList<>();
        list2.add("123");
        list2.add("456");
        list2.add("789");
        strList.addAll(list2);

        Stack<Integer>integerStack= new Stack<>();
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        System.out.println(integerStack);
        System.out.println(integerStack.peek());
        integerStack.pop();
        System.out.println(integerStack);

        Vector<Float>fv=new Vector<>();
        fv.add(12.5f);
        fv.add(12.6f);
        fv.add(12.7f);
        System.out.println(fv);

        Vector<Double>fd=new Vector<>();
        fd.add(12.3);
        fd.add(12.4);
        fd.add(12.5);
        System.out.println(fd);

    }
}
