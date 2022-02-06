
public class Program2 {
  public static void main(String[] args) {
    String input = "smallest";

    int smallestLength = input.length() + 1;
    int largestLength = 0;
    String small = "";
    String largest = "";

    for (String str : input.split(" ")) {
      if (str.length() < smallestLength) {
        smallestLength = str.length();
        small = str;
      }
      if (str.length() > largestLength) {
        largestLength = str.length();
        largest = str;
      }
    }

    System.out.println("Smallest  : " + small);
    System.out.println("Largest   : " + largest);

  }
}
