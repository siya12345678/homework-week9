package calculate;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main extends Calculator{
    //main method
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(2,5);
        calculator.subtraction(7 ,4);
        calculator.division(10,3);
        calculator.multiplication(2,4);

        Scanner sca = new Scanner(System.in);//create a scanner class object

        String msg = null;
        //While loop statement
        while (true){
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” :");
            msg = sca.next();
            //if statement
            if(msg.equalsIgnoreCase("Y") ||(msg.equalsIgnoreCase("Y"))){
                System.out.println("Enter First Number : ");
                int a = sca.nextInt();
                System.out.println("Enter Second Number : ");
                int b = sca.nextInt();
                System.out.println("Please enter one of symbol +,-,*,/ : ");
                char symbol = sca.next().toLowerCase().charAt(0);
                //switch statement
                switch (symbol){
                    case '+':
                        System.out.println("Addition of " + a + " and " + b + " is : "+(a+b));
                        break;
                    case '-':
                        System.out.println("Subtraction of " + a + " and " + b + " is : " + (a - b));
                        break;
                    case '/':
                        System.out.println("Division of " + a + " and " + b + " is : " + (a / b));
                        break;
                    case '*':
                        System.out.println("Multiplication of " + a + " and " + b + " is : " + (a * b));
                }
                //if else statement
            } else if (msg.equalsIgnoreCase("n") || (msg.equalsIgnoreCase("N"))) {
                break;
            } else {
                System.out.println("Try Again with (Y/N) only....");

            }
            }
        }
    }





