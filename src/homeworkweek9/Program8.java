package homeworkweek9;
/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)
 */

import java.util.HashMap;
import java.util.HashSet;

public class Program8 {
    public static void main(String[] args) {//main method
        HashSet<Integer> hashSet = new HashSet<>();//create a object
        hashSet.add(4);
        hashSet.add(7);
        hashSet.add(8);
        for (int i = 0; i < 10; i++){
            if(hashSet.contains(i));
            System.out.println(i + "was found in the set. ");
        }
    }
}
