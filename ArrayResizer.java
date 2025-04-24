public class ArrayResizer {

    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int x : array2D[r]) {
		if (x == 0) {
			return false;
		}
	}
	return true;
    }

    public static int[][] resize(int[][] array2D) {
        int[][] smaller = new int[numNonZeroRows(array2D)][array2D[0].length];
	    int index = 0;

	    for (int i = 0; i < array2D.length; i++) {
		    if (isNonZeroRow(array2D, i)) {
			    smaller[index] = array2D[i];
			    index++;
		    }
	    }
	    return smaller;
    }

    // CODE BELOW ADDED TO ENABLE TESTING; NOT SHOWN IN ORIGINAL FRQ
    public static int numNonZeroRows(int[][] array2D) {
        int nonZeroRowCount = 0;
        for (int row = 0; row < array2D.length; row++) {
            boolean hasZeros = false;
            for (int col = 0; col < array2D[0].length; col++) {
                if (array2D[row][col] == 0) {
                    hasZeros = true;
                }
            }
            if (!hasZeros) {
                nonZeroRowCount++;
            }
        }
        return nonZeroRowCount;
    }
}
