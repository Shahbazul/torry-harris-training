package com.torryharris.driver;

public class Exception {
    public static void main(String[] args) {

        try {
            /*String s = null;
            System.out.println("Hello1");
            System.out.println(s.length());
            System.out.println("Hello4");

             */

            int[] array = new int[4];
            System.out.println("hello2");
            array[4] = 10;
            System.out.println("Hello5");

            int a = 0;
            int b = 0;
            System.out.println("Hello3");
            int c = a / b;
            System.out.println("Hello6");
        }
        catch (NullPointerException ex){
            System.out.println("null pointer exception");
            ex.printStackTrace();
        }
        catch (ArithmeticException ex){
            System.out.println("Arithmetic Exception");
            ex.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Array Index Error");
            ex.printStackTrace();
        }
        catch (java.lang.Exception ex){
            ex.printStackTrace();
        }
        System.out.println("hello7");

    }
}
