package DynamicMatrix;

public class DynamicMatrix {
  public static void main(String[] args) {
    int rows = 3;
    int columns = 3;
    int idx = 1;
    int numbers[][] = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        numbers[i][j] = idx;
        idx++;
        System.out.print("[" + numbers[i][j] + "]");
      }
      
      System.out.println("");
    }
  }
}
