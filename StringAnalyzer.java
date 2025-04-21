public class StringAnalyzer {
    /** Returns a count of how many times smallStr occurs in largeStr, as
      * described in part (a)
      *
      * Precondition: largeStr is not null; smallStr is not null.
      *          The length of smallStr is less than the length of largeStr.
      */
      public static int countRepeat(String largeStr, String smallerStr) {
        count = 0;
        int len = smallerStr.length();
        int index = largerStr.indexOf(smallerStr);
        while (index != -1) {
            count++;
            largerStr = largerStr.substring(index + len);
            index = largerStr.indexOf(smallerStr);
        }
        return count;
      }
}
  