package While;

public class Exercise {
  private static void message(int i) {
    System.out.println("Actual index: " + i);
  }
  
  public static void main(String[] args) {
    System.out.println("First Exercise");
    int i = 0;
    while (i <= 10) {
      message(i);
      i++;
    }

    System.out.println("Second Exercise");
    int last = 100;
    int actIdx = 1;
    i = 1;
    while (i <= 10) {
      if (i % 2 == 1) {
        message(actIdx);
      } else {
        message(last - actIdx);
        actIdx+=1;
      }

      i++;
    }

    System.out.println("Third Exercise");
    last = 0;
    int res = 1;
    message(last);
    message(res);
    while (res < 34) {
      int actLast = res;
      res = last + res;
      last = actLast;

      message(res);
    }
  }
}
