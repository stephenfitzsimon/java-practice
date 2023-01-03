public class GroceryListFour {
    public static boolean hasSpecialItem(double[] groceryPrices) {
        int i = 0;
        while (i < groceryPrices.length) {
            double priceInPennies = groceryPrices[i]*100;
            if (priceInPennies % 100 == 99) {
                return true;
            }
            i++;
        }
        return false;
    }
  
    public static void main(String[] args) {
      // Below is a sample test case you can use to run your code.
      // Try playing around with different values in the array to test edge cases
      double[] groceryList = {10.0, 89.9, 8.99, 2.34};
      System.out.println(hasSpecialItem(groceryList));
    }
  }
  