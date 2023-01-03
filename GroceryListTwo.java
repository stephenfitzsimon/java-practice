public class GroceryListTwo {
    public static double getMostExpensiveItemCost(double[] groceryPrices) {
      // We can set the maxCost initially to the first item without an IndexOutOfBounds error because we can assume there is at least one item in the array.
      double maxCost = groceryPrices[0];
      for (double d : groceryPrices) {
        if (d > maxCost) {
            maxCost = d;
        }
      }
      return maxCost;
    }
  
    public static void main(String[] args) {
      // Below is a sample test case you can use to run your code.
      // Try playing around with different values in the array to test edge cases
     double[] groceryPrices = {10.0, 12.3, 8.45, 2.34};
     System.out.println(getMostExpensiveItemCost(groceryPrices));
    }
  }
  