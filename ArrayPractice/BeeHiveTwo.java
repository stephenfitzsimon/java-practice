import java.util.ArrayList;

public class BeeHiveTwo {
  private ArrayList<Bee> beeList;

  public BeeHiveTwo(int numBees) {
    this.beeList = new ArrayList<Bee>();
    for (int i = 0; i < numBees; i++) {
      this.beeList.add(new Bee("bee" + i));
    }
  }

  public ArrayList<Bee> getBeeList() {
    return this.beeList;
  }

  public void leaveHome(String beeName) {
    for (Bee b : this.beeList) {
        if (b.getName().equals(beeName)) {
            b.leaveHome();
            break;
        }
    }
  }

  public static void main(String[] args) {
    BeeHiveTwo myHive = new BeeHiveTwo(365);
    myHive.leaveHome("bee43");

    // Print bee's status to make sure it is no longer home
    System.out.println(myHive.beeList.get(43).isHome());
  }
}
