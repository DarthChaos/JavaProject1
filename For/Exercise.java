package For;

public class Exercise {
  private static void message(int i) {
    System.out.println("Actual index: " + i);
  }
  public static void main(String[] args) {
    System.out.println("First Exercise");
    for (int i = 0; i < 10; i++) {
      message(i);
    }

    System.out.println("Second Exercise");
    int last = 100;
    int actIdx = 1;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 1) {
        message(actIdx);
      } else {
        message(last - actIdx);
        actIdx+=1;
      }
    }

    System.out.println("Third Exercise");
    last = 0;
    int res = 1;
    message(last);
    message(res);
    for (int i = 1; i <= 100; i++) {
      int actLast = res;
      res = last + res;
      last = actLast;

      message(res);

      if(res >= 34) break;
    }
  }
}
