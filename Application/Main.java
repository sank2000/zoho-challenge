package Application;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Init.initialize();

    System.out.println("----- Welcome to bowling game ----");

    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.println("1. Play Game ");
      System.out.println("2. Settings ");
      System.out.println("3. Exit ");
      System.out.print(" Enter your option (1 / 2 / 3) :");
      int option = scan.nextInt();
      scan.nextLine();

      switch (option) {
        case 1:
          Game.showSettings();
          Game.confirmStart();
          break;
        case 2:
          Settings.View();
          break;

        case 3:
          System.out.println("Thank you ! visit again");
          scan.close();
          System.exit(0);
          break;

        default:
          break;
      }

    }

  }
}
