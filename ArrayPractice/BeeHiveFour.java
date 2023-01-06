import java.util.ArrayList;

public class BeeHiveFour {
  private ArrayList<Bee> beeList;

  public BeeHiveFour(int numBees) {
    this.beeList = new ArrayList<Bee>();
    for (int i = 0; i < numBees; i++) {
      this.beeList.add(new Bee("bee" + i));
    }
  }

  public ArrayList<Bee> getBeeList() {
    return this.beeList;
  }

  public void moveOutBees() {
    for (int i = 0; i < this.beeList.size(); i++) {
        this.beeList.remove(i);
    }

  }

  public static void main(String[] args) {
    BeeHiveFour myHive = new BeeHiveFour(365);
    myHive.moveOutBees();
   
    // Print out the elements in the bee list to make sure the new bees were removed
    for(Bee b : myHive.beeList){
      System.out.println(b.getName());
    }
  }
}
