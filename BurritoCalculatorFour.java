public class BurritoCalculatorFour {
    public static int getTip(int budget) {
        int maxDigit = 0;
        int currentDigit = 0;
        while (budget > 0) {
            currentDigit = budget % 10;
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
            budget = budget / 10;
        }
        return maxDigit * 900;
    }
      
    public static void main(String []args) {
      // Try passing different arguments for your budget with varying numbers of digits, like 62, 374, 599, etc
      System.out.println(getTip(123));
    }
  }
  