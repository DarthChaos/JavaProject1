package KeyInput;

import java.util.Scanner;

public class KeyInput {
  public static void main(String[] args) {
    Scanner keyboardInput = new Scanner(System.in);
    
    String name = "";
    int num1 = 0,
      num2 = 0,
      res = 0;

    System.out.println("What's your name?");
    name = keyboardInput.nextLine();

    System.out.println("Give me the first number to sum");
    num1 = keyboardInput.nextInt();

    System.out.println("Give me the second number to sum");
    num2 = keyboardInput.nextInt();

    res = num1 + num2;

    System.out.println(name + ", the result is: " + res);
  }
}
