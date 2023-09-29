package LogRelOps;

import java.util.Scanner;

public class LogRelOps {
  private static int getSupportVacDays(int yearsInComp) {
    if (yearsInComp == 1) {
      return 6;
    } else if (yearsInComp > 1 && yearsInComp < 7) {
      return 14;
    }

    return 20;
  }

  private static int getLogisticsVacDays(int yearsInComp) {
    if (yearsInComp == 1) {
      return 7;
    } else if (yearsInComp > 1 && yearsInComp < 7) {
      return 15;
    }

    return 22;
  }

  private static int getAdminVacDays(int yearsInComp) {
    if (yearsInComp == 1) {
      return 10;
    } else if (yearsInComp > 1 && yearsInComp < 7) {
      return 20;
    }

    return 30;
  }

  private static void message(String name, int VacDays, String area) {
    System.out.println("Hi " + name + ", you actually have " + VacDays + " days of vacations. Area: " + area);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String name = "";
    String dept = "";
    int years;

    System.out.println("What's your name?");
    name = input.nextLine();

    System.out.println("What's your department? (Support | Logistics | Administration)");
    dept = input.nextLine();

    System.out.println("How many years have you been in the company?");
    years = input.nextInt();

    if (dept.equals("Support")) {
      message(name, getSupportVacDays(years), dept);
    } else if (dept.equals("Logistics")) {
      message(name, getLogisticsVacDays(years), dept);
    } else if (dept.equals("Administration")) {
      message(name, getAdminVacDays(years), dept);
    } else {
      System.out.println("You enter an invalid area.");
    }

    input.close();
  }
}
