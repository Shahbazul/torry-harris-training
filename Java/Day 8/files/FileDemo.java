package com.torryharris.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        System.out.println("Files Content");
        int ch;
        while((ch=fis.read())!=-1){
            System.out.print((char)ch);
        }
        fis.close();

        FileOutputStream fos=new FileOutputStream("output.txt");
        String str="Output file";
        char []array=str.toCharArray();
        for(char c:array){
            fos.write((int)c);
        }
        fos.close();
        System.out.println("\nContents written");

    }

}