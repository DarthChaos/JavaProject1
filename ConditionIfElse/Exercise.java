package ConditionIfElse;

public class Exercise {
  static int math = 8;
  static int biology = 5;
  static int chemistry = 7;

  public static void main(String[] args) {
    int mean = (math + biology + chemistry)/3;

    if (mean >= 6) {
      System.out.println("The student has a high score mean. He finishes his scholarship.");
    } else {
      System.out.println("The student has a low score mean. He reprobes his scholarship.");
    }
  }
}
