package Application;

public class GameSettings {
  private static int STRIKE = 10;
  private static int SPARE = 5;
  private static int NO_OF_ROUNDS = 2;
  private static int NO_OF_PLAYERS = 2;
  private static int NO_OF_CHANCES = 2;
  private static int DEFAULT_STRIKE = 10;
  private static int DEFAULT_SPARE = 5;
  private static int DEFAULT_NO_OF_ROUNDS = 2;
  private static int DEFAULT_NO_OF_PLAYERS = 2;
  private static int DEFAULT_NO_OF_CHANCES = 2;

  public static void reset_strike() {
    STRIKE = DEFAULT_STRIKE;
    System.out.println("reset successful - Current STRIKE :" + STRIKE);
  }

  public static void reset_spare() {
    SPARE = DEFAULT_SPARE;
    System.out.println("reset successful - Current SPARE :" + SPARE);
  }

  public static void reset_rounds() {
    NO_OF_ROUNDS = DEFAULT_NO_OF_ROUNDS;
    System.out.println("reset successful - Current NO_OF_ROUNDS :" + NO_OF_ROUNDS);
  }

  public static void reset_noOfPlayers() {
    NO_OF_PLAYERS = DEFAULT_NO_OF_PLAYERS;
    System.out.println("reset successful - Current NO_OF_PLAYERS : " + NO_OF_PLAYERS);
  }

  public static void reset_chances() {
    NO_OF_CHANCES = DEFAULT_NO_OF_CHANCES;
    System.out.println("reset successful - Current NO_of_Changes :" + NO_OF_CHANCES);
  }

  public static void update_strike(int val) {
    STRIKE = val;
    System.out.println("Updated successfully - Current STRIKE :" + STRIKE);
  }

  public static void update_spare(int val) {
    SPARE = val;
    System.out.println("Updated successfully - Current SPARE :" + SPARE);
  }

  public static void update_rounds(int val) {
    NO_OF_ROUNDS = val;
    System.out.println("Updated successfully - Current NO_OF_ROUNDS :" + NO_OF_ROUNDS);
  }

  public static void update_noOfPlayers(int val) {
    NO_OF_PLAYERS = val;
    System.out.println("Updated successfully - Current NO_OF_PLAYERS : " + NO_OF_PLAYERS);
  }

  public static void update_chances(int val) {
    NO_OF_CHANCES = val;
    System.out.println("Updated successfully - Current NO_of_Changes :" + NO_OF_CHANCES);
  }

  public static void setDefault() {
    STRIKE = DEFAULT_STRIKE;
    SPARE = DEFAULT_SPARE;
    NO_OF_ROUNDS = DEFAULT_NO_OF_ROUNDS;
    NO_OF_CHANCES = DEFAULT_NO_OF_CHANCES;
    NO_OF_PLAYERS = DEFAULT_NO_OF_PLAYERS;
    System.out.println("Reset successfully");
  }

  public static int getStrike() {
    return STRIKE;
  }

  public static int getSpare() {
    return SPARE;
  }

  public static int getRounds() {
    return NO_OF_ROUNDS;
  }

  public static int getPlayers() {
    return NO_OF_PLAYERS;
  }

  public static int getChances() {
    return NO_OF_CHANCES;
  }

}
