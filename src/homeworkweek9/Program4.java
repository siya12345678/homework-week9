package homeworkweek9;
/*
Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Program4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//creat a object
        //add elements of arraylist
        list.add("Pink");
        list.add("Orange");
        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("Purple");

        //for each loop
        for (Object value : list){
            System.out.println(value);//print statement
        }
    }
}

