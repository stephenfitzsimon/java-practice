class KoalaCountingFour {
    public static int largestColumn(int[][] arr2D) {
        int maxSum = 0;
        int maxIndx = 0;
        int sum = 0;
        for (int col = 0; col < arr2D[0].length; col++) {
            sum = 0;
            for (int row = 0; row < arr2D.length; row++) {
                sum += arr2D[row][col];
            }
            if (sum > maxSum) {
                maxIndx = col;
            }
        }
        return maxIndx;
    }
  
    public static void main(String[] args) {
  
      int[][] koalaSpottings = {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};
      System.out.println(largestColumn(koalaSpottings));
    }
  }
  