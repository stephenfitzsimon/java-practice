class KoalaCountingTwo {
    public static int getTotal(int[][] arr2D) {
        int count = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[0].length; j++) {
                count += arr2D[i][j];
            }
        }
        return count;
    }
  
    public static void main(String[] args) {
  
      int[][] koalaSpottings = {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};
      System.out.println(getTotal(koalaSpottings));
    }
  }
  