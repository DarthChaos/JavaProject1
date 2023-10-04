package DoWhile;

public class Exercise {
  private static void message(int i) {
    System.out.println("Actual index: " + i);
  }
  
  public static void main(String[] args) {
    System.out.println("First Exercise");
    int i = 0;
    do {
      message(i);
      i++;
    } while (i <= 10);

    System.out.println("Second Exercise");
    int last = 100;
    int actIdx = 1;
    i = 1;
    do {
      if (i % 2 == 1) {
        message(actIdx);
      } else {
        message(last - actIdx);
        actIdx+=1;
      }

      i++;
    } while (i <= 10);

    System.out.println("Third Exercise");
    last = 0;
    int res = 1;
    message(last);
    message(res);
    do {
      int actLast = res;
      res = last + res;
      last = actLast;

      message(res);
    } while (res < 34);
  }
}
