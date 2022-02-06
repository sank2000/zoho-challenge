package Application;

import java.util.Scanner;

public class Admin extends Person {
  Admin(int id, String pass) {
    super(id, pass, true);
  }

  public void showOperations() {
    Scanner scan = new Scanner(System.in);

    System.out.println();
    System.out.println("Admin Page");
    System.out.println();

    System.out.println("1. Update No of Rounds");
    System.out.println("2. Update Spare Points ");
    System.out.println("3. Update Strike Points ");
    System.out.println("4. Update Chances ");
    System.out.println("5. Reset No of Rounds");
    System.out.println("6. Reset Spare Points ");
    System.out.println("7. Reset Strike Points ");
    System.out.println("8. Reset Chances ");
    System.out.println("9. Exit ");
    System.out.print(" Enter your option :");
    int option = scan.nextInt();
    scan.nextLine();
    int val;

    switch (option) {
      case 1:
        System.out.print("Enter the no.of rounds :");
        val = scan.nextInt();
        scan.nextLine();
        GameSettings.update_rounds(val);
        break;

      case 2:
        System.out.print("Enter the SPARE points :");
        val = scan.nextInt();
        scan.nextLine();
        GameSettings.update_spare(val);
        break;
      case 3:
        System.out.print("Enter the STRIKE points :");
        val = scan.nextInt();
        scan.nextLine();
        GameSettings.update_strike(val);
        break;
      case 4:
        System.out.print("Enter the Chances :");
        val = scan.nextInt();
        scan.nextLine();
        GameSettings.update_chances(val);
        break;
      case 5:
        GameSettings.reset_rounds();
        break;
      case 6:
        GameSettings.reset_spare();
        break;
      case 7:
        GameSettings.reset_strike();
        break;
      case 8:
        GameSettings.reset_chances();
        break;

      default:
        break;
    }

  }

}
