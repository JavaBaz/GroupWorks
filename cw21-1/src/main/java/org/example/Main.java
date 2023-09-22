package org.example;






import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.Scanner;



public class Main {


    final static Logger logger = Logger.getLogger(Main.class);



    public static void main(String[] args) {
        DOMConfigurator.configure("cw21-1/src/main/resources/log4j.properties");

        System.out.println(" Welcome to Java Calculator v0.1 \n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Please enter two numbers");
        System.out.print("\n First number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("\n Second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("\n Select between (*,/,+,-)\n Type out the character in a single letter: ");
        String operation = scanner.next();

        String eo = "You have selected ";

        switch (operation) {
            case "*":
                System.out.println(eo + "*");
                mul(firstNumber, secondNumber);

                break;
            case "/":
                System.out.println(eo + "/ \n Your Result: "+ ( firstNumber / secondNumber ));
                break;
            case "+":
                System.out.println(eo + "+ \n Your Result: "+ ( firstNumber + secondNumber ));
                break;
            case "-":
                System.out.println(eo + "- \n Your Result: "+ ( firstNumber - secondNumber ));
                break;
            default: System.out.println("\n Please select a valid character");
        }






        scanner.close();
        System.out.println(" Closing Application ");
    }


    public static void mul(int num1, int num2){
        logger.info("this is an info log");
        int result = num1 * num2;
        System.out.println("Your Result: "+result);
        logger.debug("this is an info log");
    }

}