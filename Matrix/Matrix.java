package Matrix;

public class Matrix {
  public static void main(String[] args) {
    int number[][] = new int[2][2];

    number[0][0] = 5;
    number[0][1] = 2;
    number[1][0] = 2;
    number[1][1] = 5;

    for (int i = 0; i < number.length; i++) {
      for (int j = 0; j < number[0].length; j++) {
        System.out.print("[" + number[i][j] + "]");
      }
      System.out.println("");
    }
  }
}
