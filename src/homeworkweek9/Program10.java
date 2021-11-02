package homeworkweek9;
/*
Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.
 */

import java.util.HashMap;
import java.util.Scanner;

public class Program10 {
    //Main Method
    public static void main(String[] args) {
      //create a hashmap object
        HashMap<String, String> tube = new HashMap<>();
        //Add keys and value
        tube.put("bank", "\nNorthern Line\nWaterloo & City,\nDLR");
        tube.put("bond street", "\nJubilee Line\nCentral Line");
        tube.put("lancaster gate", "\nCentral Line");
        tube.put("paddington", "\nCircle Line\nDistrict Line,\nBakerloo Line,\nHammersmith & City Line");
        tube.put("pimlico", "\nVictoria line");
        tube.put("temple", "\nCircle Line,\nDistrict Line");
        tube.put("west minster", "\nCircle Line,\nDistrict Line\nJubilee Line");
        tube.put("vauxhall", "\nVictoria Line\nOver ground");
        tube.put("waterloo", "\nBakerloo Line\nWaterloo & City,\nNorthern line,\nOverground");
        tube.put("kings cross", "\nNorthern Line\nVictoria Line,\nBritish Rail");
     //scanner class object creat
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the station name");
        String tfl = sca.nextLine().toLowerCase();
        //print statement
        System.out.println("Entered Station in Zone 1 " + tube.get(tfl));
    }
}
