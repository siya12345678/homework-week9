package homeworkweek9;
/*
Write a Java program to retrieve an element (at a specified index) from a given
array list
 */

import java.util.ArrayList;

public class Program6 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();// creat a object
        list.add(10);
        list.add("Siya");
        list.add(20.25);
        list.add(null);
        list.add(true);
        list.add("Shiv");


        // Retrive element directly using index num
        System.out.println(list.get(0));
        System.out.println(list.get(5));
    }
}
