package LengthSubstring;

import java.util.Scanner;

public class LengthSubstring {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Write something:");
    String someString = input.nextLine();

    System.out.println("Your message has " + someString.length() + " characters.");

    System.out.println("Select two numbers between 0 and " + someString.length() + ", please.");
    System.out.println("Note: first the lower and next the highest.");
    System.out.println("First number: ");
    int firstNumber = input.nextInt();

    System.out.println("Second number: ");
    int secondNumber = input.nextInt();

    System.out.println("Take here a souvenir: " + someString.substring(firstNumber, secondNumber));

    input.close();
  }
}
