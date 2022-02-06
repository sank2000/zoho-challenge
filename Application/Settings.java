package Application;

import java.util.Scanner;

public class Settings {

  public static void authenticate(boolean isAdmin) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter ID : ");
    int id = scan.nextInt();
    scan.nextLine();
    System.out.print("Enter Password : ");
    String password = scan.nextLine();

    boolean isAuth = false;
    Person auth = null;
    if (isAdmin) {
      for (Admin ad : Init.admins) {
        if (ad.checkCredentials(id, password)) {
          isAuth = true;
          auth = ad;
          break;
        }
      }
    } else {
      for (FriendsGang fg : Init.friends) {
        if (fg.checkCredentials(id, password)) {
          isAuth = true;
          auth = fg;
          break;
        }
      }
    }

    if (isAuth) {
      System.out.println("Login Successfully as " + (isAdmin ? "admin" : "friend"));
      auth.showOperations();
    } else {
      System.out.println("Invalid Login");
    }
  }

  public static void View() {
    Scanner scan = new Scanner(System.in);

    System.out.println();
    System.out.println("Settings Page");
    System.out.println();

    System.out.println("1. Login as Admin");
    System.out.println("2. Login as Friend's Gang ");
    System.out.println("3. Exit ");
    System.out.print(" Enter your option (1 / 2) :");
    int option = scan.nextInt();

    switch (option) {
      case 1:
        authenticate(true);
        break;

      case 2:
        authenticate(false);
        break;

      default:
        break;
    }

  }

}
