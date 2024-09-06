package Day9;

public class PatternPrint {
  public static void main(String[] args) {
    int n = 4; // Size of the pattern, here 4 means it will be a 7x7 grid
    int size = 2 * n - 1; // Size of the grid

    // Generate the pattern
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        // Calculate the minimum distance from the edges manually
        int minDist = i; // Start by assuming i is the smallest distance
        if (j < minDist)
          minDist = j; // Compare with j
        if (size - 1 - i < minDist)
          minDist = size - 1 - i; // Compare with size - 1 - i
        if (size - 1 - j < minDist)
          minDist = size - 1 - j; // Compare with size - 1 - j

        // Print the appropriate number
        System.out.print((n - minDist) + " ");
      }
      System.out.println();
    }
  }
}
