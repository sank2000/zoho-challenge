/*

*/

import java.util.HashMap;
import java.util.Map;

public class Program3 {
  public static void main(String[] args) {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    String input = "abracadabra";

    for (Character ch : input.toCharArray()) {
      if (map.containsKey(ch)) {
        map.put(ch, map.get(ch) + 1);
      } else {
        map.put(ch, 1);
      }
    }

    for (Map.Entry<Character, Integer> ent : map.entrySet()) {
      System.out.println(ent.getKey() + " --- " + ent.getValue());
    }

  }
}
