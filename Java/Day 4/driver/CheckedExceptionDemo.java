package com.torryharris.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try{
            readFromFile("input.txt");
        }catch(java.lang.Exception ex){
            System.out.println(ex);
        }

        public static void readFromFile(String filename) throws FileNotFoundException{
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
        }
    }
}
