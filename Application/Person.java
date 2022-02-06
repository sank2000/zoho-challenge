package Application;

public abstract class Person {
  private int id;
  private String password;
  private boolean isAdmin;

  Person(int id, String pass) {
    this.id = id;
    this.password = pass;
    this.isAdmin = false;
  }

  Person(int id, String pass, boolean isAdmin) {
    this.id = id;
    this.password = pass;
    this.isAdmin = isAdmin;
  }

  public boolean checkCredentials(int id, String pass) {
    if (id == this.id && this.password.equals(pass)) {
      return true;
    }
    return false;
  }

  public boolean checkIsAdmin() {
    return isAdmin;
  }

  abstract public void showOperations();
}
