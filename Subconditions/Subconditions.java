package Subconditions;

public class Subconditions {

  private static int op(int op, int... args){
    int num1 = args[0];
    int num2 = args[1];

    if(op == 1) {
      return num1 + num2;
    } else if (op == 2) {
      return num1 - num2;
    } else if (op == 3) {
      return num1 * num2;
    }

    return num1 / num2;
  }

  public static void main(String[] args) {
    int operation = 5;

    if (operation < 5) 
      System.out.println(op(operation, 2, 1));
    else
      System.out.println("Invalid Option.");
  }
}
