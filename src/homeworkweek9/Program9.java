package homeworkweek9;
/*
Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;

public class Program9 {
    public static void main(String[] args) {
        //create a hashmap object
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        //Add keys and objects
        people.put("Jinal", 31);
        people.put("Anchal", 32);
        people.put("Himali", 26);
        people.put("Priyank", 26);
        people.put("Jignesh", 39);
        people.put("Ajay", 39);

        //for each loop
        for (String i : people.keySet()) {
            //print statement
            System.out.println("String keys : " + i + ", Integer Value : " + people.get(i));
        }
    }
}
