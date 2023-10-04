package Array;

public class Array {
  public static void main(String[] args) {
    int numbers[] = new int[5];

    numbers[0] = 0;
    numbers[1] = 5;
    numbers[2] = 25;
    numbers[3] = 125;
    numbers[4] = 555;

    for (int i : numbers) {
      System.out.println("Number " + i);
    }
  }
}
