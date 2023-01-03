public class GroceryListFive {
    public static boolean isAlphabetized(String[] groceryList) {
        if (groceryList.length <= 1) {
            return true;
        }
        int compareValue = 0;
        int i = 1;
        while (i < groceryList.length) {
            compareValue = groceryList[i-1].compareTo(groceryList[i]);
            if (compareValue > 0) {
                return false;
            }
            i++;
        }
      
        return true;
    }
  
    public static void main(String[] args) {
      // Below is a sample test case you can use to run your code.
      // Try playing around with different values in the array to test edge cases
      String[] groceryList = {"apples", "banana", "bananas", "chocolate"};
      System.out.println(isAlphabetized(groceryList));
    }
  }
  