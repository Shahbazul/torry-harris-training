package com.torryharris.drive;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import com.torryharris.comparator.MovieCollectionComparator;
import com.torryharris.comparator.MovieImdRatingComparator;
import com.torryharris.comparator.MovieYearComparator;
import com.torryharris.model.Movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) {
        Movie m1=new Movie("Dhoni",2018,9.0f,500.0f);
        Movie m2=new Movie("Chak De India",2008,9.8f,300.0f);
        Movie m3=new Movie("Kohli",2028,9.3f,1000.0f);

        ArrayList<Movie>mList=new ArrayList<>();
        mList.add(m1);
        mList.add(m3);
        mList.add(m2);

        System.out.println("Before Sorting");
        for(Movie mv:mList){
            System.out.println(mv);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("1)Title  2)Year of Release 3)Rating 4)Collection");
        System.out.println("Enter your Choice:");
        int number = scan.nextInt();
        if(number==1){
            System.out.println("After Sorting");
            mList.sort(null);
            Iterator<Movie> movieIterator=mList.iterator();
            while(movieIterator.hasNext()){
                System.out.println(movieIterator.next());
            }
        }else if(number==2){
            System.out.println("Sorting by year");
            mList.sort(new MovieYearComparator());
            Iterator<Movie> movieIterator=mList.iterator();
            while(movieIterator.hasNext()){
                System.out.println(movieIterator.next());
            }
        }else if(number==3){
            System.out.println("Sorting by IMD rating");
            mList.sort(new MovieImdRatingComparator());
            Iterator<Movie> movieIterator=mList.iterator();
            while(movieIterator.hasNext()){
                System.out.println(movieIterator.next());
            }
        }else if(number==4){
            System.out.println("Sorting by Collection");
            mList.sort(new MovieCollectionComparator());
            Iterator<Movie> movieIterator=mList.iterator();
            while(movieIterator.hasNext()){
                System.out.println(movieIterator.next());
            }

        }else{
            System.out.println("Sorry wrong option");
        }

    }
}
