package ConditionIfElse;

public class Conditions {
  private static boolean work = true;

  private static void isWorkFinished() {
    if (work) {
      System.out.println("Work finished.");
    } else {
      System.out.println("Work in progress.");
    }
  }

  public static void main(String[] args) {
    isWorkFinished();
  }
}
