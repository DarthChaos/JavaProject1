package DoWhile;

public class DoWhile {
  public static void main(String[] args) {
    int i = 1000;

    do {
      System.out.println("Actual index: " + i);
      i-=200;
    } while (i >= 0);
  }
}
