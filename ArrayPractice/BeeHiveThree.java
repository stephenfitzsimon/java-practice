import java.util.ArrayList;

public class BeeHiveThree {
  private ArrayList<Bee> beeList;

  public BeeHiveThree(int numBees) {
    this.beeList = new ArrayList<Bee>();
    for (int i = 0; i < numBees; i++) {
      this.beeList.add(new Bee("bee" + i));
    }
  }

  public ArrayList<Bee> getBeeList() {
    return this.beeList;
  }

  public void addBees(ArrayList<String> beeNames) {
    for (String s : beeNames) {
        Bee b = new Bee(s);
        this.beeList.add(b);
    }

  }

  public static void main(String[] args) {
    BeeHiveThree myHive = new BeeHiveThree(3);
    ArrayList<String> newBees = new ArrayList<String>();
    newBees.add("bob");
    newBees.add("macey");
    newBees.add("anna");

    myHive.addBees(newBees);
   
    // Print out the elements in the bee list to make sure the new bees were added
    for (Bee b : myHive.beeList) {
      System.out.println(b.getName());
    }
  }
}
