package Application;

import java.util.Scanner;

public class Game {

  public static void showSettings() {
    System.out.println(" --------  Settings Preview --------");
    System.out.println(" No of Players : " + GameSettings.getPlayers());
    System.out.println(" No of Rounds : " + GameSettings.getRounds());
    System.out.println(" No of Chances : " + GameSettings.getChances());
    System.out.println(" SPARE point : " + GameSettings.getSpare());
    System.out.println(" STRIKE point : " + GameSettings.getStrike());
  }

  public static void confirmStart() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Press 'y' to start the game :");
    Character ch = scan.nextLine().charAt(0);

    if (ch == 'y') {
      Game.start();
    }
  }

  public static void start() {

    System.out.println(".......... Lets go ............ ");
    int points[] = new int[GameSettings.getPlayers()];
    int MAX_PINS = 10;

    for (int round = 1; round <= GameSettings.getRounds(); round++) {
      for (int player = 1; player <= GameSettings.getPlayers(); player++) {
        int total_down = 0;
        boolean isAdditional = false;
        for (int chance = 1; chance <= GameSettings.getChances(); chance++) {
          int current_point = 0;
          do {
            current_point = (int) Math.round(Math.random() * (MAX_PINS - total_down));
          } while (current_point > 10 || current_point > MAX_PINS - total_down);

          total_down += current_point;
          if (!isAdditional && total_down == 10 && chance == 1) {
            current_point += GameSettings.getStrike();
            if (round == GameSettings.getRounds()) {
              chance = chance - 2;
              isAdditional = true;
            }
          } else if (!isAdditional && total_down == 10 && chance == 2) {
            current_point += GameSettings.getSpare();
            if (round == GameSettings.getRounds()) {
              chance = chance - 2;
              isAdditional = true;
            }
          }
          points[player - 1] += current_point;

          System.out.println(
              "Point for Player " + player + " - Round " + round + " of " + chance + " chance is " + current_point);
        }

        System.out.println(
            "Point for Player " + player + " - After Round " + round + " is " + points[player - 1]);
      }

    }
    System.out.println("---- Leader board ----");

    for (int i = 0; i < points.length; i++) {
      System.out.println("points of Player " + (i + 1) + " is " + points[i]);
    }
  }

}
