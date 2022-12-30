public class BurritoCalculator {

    public static boolean hasLeftoverFunds(int burritoCost) {
      int budget = 100;
      int numBurritos = 0;
      
      while (budget >= burritoCost) {
        numBurritos++;
        budget -= burritoCost;
      }
  
      System.out.println("Remaining budget: " + budget);
  
      return true;
    }
      
    public static void main(String []args) {
      // Below are some sample values you can use to run your code.
      // When you're ready, uncomment the following lines one at a time to test each case. Before running each test case, think about what value you expect to see printed out.
      System.out.println(hasLeftoverFunds(7));
      System.out.println(hasLeftoverFunds(10));
  
    }
}
  