class KoalaCounting {
    public static int getTotal(int[] arr) {
        int count = 0;
        for (int i : arr) {
            count += i;
        }
        return count;
    }
  
    public static void main(String[] args) {
      int[] dayOne = {17, 13, 19, 22};
      System.out.println(getTotal(dayOne));
    }
  }
  