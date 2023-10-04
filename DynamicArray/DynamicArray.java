package DynamicArray;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Hi. How many positions could have our array?");
    int pos = input.nextInt();
    int numbers[] = new int[pos];
    
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Insert a number for the position " + (i + 1));
      numbers[i] = input.nextInt();
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("[" + numbers[i] + "]");
    }
  }
}
