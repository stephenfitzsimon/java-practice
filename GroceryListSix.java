public class GroceryListSix {
    public static boolean hasDuplicates(String[] groceryList) {
        int count = 0;
        for (String str : groceryList) {
            count = 0;
            for (String str2 : groceryList) {
                if (str2.equals(str)) {
                    count++;
                }
                if (count > 1) {
                    return true;
                }
            }
        }
        return false;
    }
  
    public static void main(String[] args) {
      // Below is a sample test case you can use to run your code.
      // Try playing around with different values in the array to test edge cases
      String[] groceryList = {"apples", "banana", "Apples", "chocolate"};
      System.out.println(hasDuplicates(groceryList));
    }
  }
  