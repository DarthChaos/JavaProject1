package Switch;

import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num1 = 5,
      num2 = 3,
      res = 0;

    System.out.println("Insert Operation");
    int param = input.nextInt();

    switch (param) {
      case 1:
        res = num1 + num2;
        System.out.println("sum res: " + res);
        break;

      case 2:
        res = num1 - num2;
        System.out.println("sub res: " + res);
        break;
      
      case 3:
        res = num1 / num2;
        System.out.println("div res: " + res);
        break;
      
      case 4:
        res = num1 * num2;
        System.out.println("mult res: " + res);
        break;
    
      default:
        System.out.println("Error: Invalid option.");
        break;
    }
  }
}
