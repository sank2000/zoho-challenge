package Application;

import java.util.ArrayList;

public class Init {
  static ArrayList<Admin> admins = new ArrayList<Admin>();
  static ArrayList<FriendsGang> friends = new ArrayList<FriendsGang>();

  public static void initialize() {
    admins.add(new Admin(1, "12345"));
    admins.add(new Admin(2, "123456"));

    friends.add(new FriendsGang(1, "12345"));
  }

}
