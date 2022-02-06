package Application;

import java.util.Scanner;

public class FriendsGang extends Person {
  FriendsGang(int id, String pass) {
    super(id, pass);
  }

  public void showOperations() {
    Scanner scan = new Scanner(System.in);

    System.out.println();
    System.out.println("Admin Page");
    System.out.println();

    System.out.println("1. Update No of Players");
    System.out.println("2. Reset No of Players");
    System.out.println("3. Exit");
    System.out.print(" Enter your option :");
    int option = scan.nextInt();
    scan.nextLine();
    int val;

    switch (option) {
      case 1:
        System.out.print("Enter the no.of players :");
        val = scan.nextInt();
        scan.nextLine();
        GameSettings.update_noOfPlayers(val);
        break;
      case 2:
        GameSettings.reset_noOfPlayers();
        break;

      default:
        break;
    }
  }
}
