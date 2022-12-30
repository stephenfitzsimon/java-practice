public class BurritoCalculatorTwo {
    public static int getBurritosSold(int lastOrderNumber) {
        int totalBurritosSold = 0;
        for (int i = 0; i <= lastOrderNumber; i++) {
            totalBurritosSold += i;
        }
        
        return totalBurritosSold;
    }
      
    public static void main(String []args) {
      // Try testing your code with different arguments in the method call
      System.out.println(getBurritosSold(548));
    }
  }
  