package homeworkweek9;
/*
Write a Java program to reverse an array of integer values.
 */

import java.util.Scanner;

public class Program3 {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> i=new ArrayList<>();
        System.out.println("Enter 10 number of your choice");
        int a[] = new int[7];
        int b[] = new int[7];
        for (int i = 0; i < 7; i++) {

            a[i] = sc.nextInt();

        }
        System.out.println("Given integer array is ");
        for (int i = 0; i < 7; i++) {
            System.out.print(a[i] + " ");        }
        System.out.println();
        System.out.println("Reverse of the given array is  ");
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                b[j] = a[i];
            }
            System.out.print(a[i] + " ");
        }
    }
    }
