package Equals;

import java.util.Scanner;

public class Equals {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Insert the first name:");
    String firstName = input.nextLine();

    System.out.println("Insert the second name:");
    String secondName = input.nextLine();

    if (firstName.equals(secondName))
      System.out.println("Names are equals.");
    else
      System.out.println("Names are different.");

    input.close();
  }
}
