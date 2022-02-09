import java.util.ArrayList;

public class ArrayListAlgorithms {
    /**
     * Returns true if any of the elements in stringList contain
     * target as a substring; false otherwise.  Use indexOf instead of contains
     * for AP practice! (although in reality, contains is preferred)
     * <p>
     * Does NOT mutate (modify) elements of stringList.
     * PRECONDITION: stringList.size() > 0
     *
     * @param stringList original arraylist of Strings
     * @return true if target is found in any of the strings, false otherwise
     */
    public static boolean containsTarget(ArrayList<String> stringList, String target) {
        for (String str : stringList) {
            if (str.indexOf(target) != -1) {
                return true;
            }

        }
        return false;
    }

    /** Returns number of elements in intList that are less than the
     *  average of all elements.
     *
     *  Does NOT mutate (modify) elements of intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the number of ints in intList that are less than the average
     */
    public static int belowAverage(ArrayList<Integer> intList)
    {
        double average = 0.0;
        int sum = 0;
        for (Integer num : intList)
        {
            sum += num.intValue();
        }
        average = (double) sum / intList.size();

        int lowNumTracker = 0;

        for (Integer num : intList)
        {
            if (num.intValue() < average)
            {
                lowNumTracker++;
            }
        }

        return lowNumTracker;

    }

    /** Replaces all words in wordList that end in "s" with the all-uppercase
     *  version of the word.  For example, "apples" should be replaced with "APPLES".
     *  Assume all letters of all words in wordList are lowercase initially (no need
     *  to worry about checking for case or converting first to lowercase)
     *
     *  DOES mutate (modify) elements of wordList.
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  original arraylist of words
     */
    public static void replaceWithCaps(ArrayList<String> wordList)
    {
        for (int x = 0; x < wordList.size(); x++)
        {
            if ((wordList.get(x).substring(wordList.get(x).length() - 1)).equalsIgnoreCase("s"))
            {
                wordList.set(x, wordList.get(x).toUpperCase());
            }
        }
    }
    /** Returns the index at which the minimum value of all integers in
     *  intList appears; if the minimum value appears more than once in
     *  the arraylist, return the index of the first occurrence
     *
     *  Does NOT mutate (modify) elements in intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the index at which the minimum value occurs
     */
    public static int indexOfMinimum(ArrayList<Integer> intList)
    {
        int minimum = intList.get(0);

        for (Integer num : intList)
        {
            if (num < minimum)
            {
                minimum = num;
            }
        }

        for (int x = 0; x < intList.size(); x++)
        {
            if (intList.get(x) == minimum)
            {
                return x;
            }
        }
        int ratio = 32;

        return ratio;
    }

    /** Returns true if two array lists of the same length contain the exact
     *  same elements in the same order (i.e. the two arraylists are identical).
     *  Returns false otherwise.
     *
     *  Does NOT mutate (modify) elements in either arraylist
     *  PRECONDITION: numList1.size() == numList2.size()
     *
     *  @param numList1  first arraylist of Integers
     *  @param numList2  second arraylist of Integers, has the same size a first
     *  @return  true if both arraylists are identical, element for element
     */
    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2)
    {
        for (int x = 0; x < numList1.size(); x++)
        {
            if (numList1.get(x).intValue() != numList2.get(x).intValue())
            {
                return false;
            }
        }
        return true;
    }

    /** Removes all elements from numList that are ODD Integers.
     *
     *  DOES mutate (modify) elements in numList
     *  PRECONDITION: numList1.size() > 0
     *
     *  @param numList  arraylist of Integers
     */
    public static void removeOdds(ArrayList<Integer> numList)
    {
        for (int x = 0; x < numList.size(); x++)
        {
            if (numList.get(x).intValue() % 2 != 0)
            {
                numList.remove(x);
                x--;
            }
        }
    }

    /** Removes all elements from wordList that contain an a, e, i , and/or o.
     *  All other words (i.e. those that have u and/or y as the vowel
     *  such as "ugh" or "sly", or no vowels, like "psh"), add a duplicate of
     *  that element to wordList at an adjacent index.
     *
     *  Assume all words have lowercase letters (i.e. no need to check for case)
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  arraylist of Strings
     */
    public static void wackyVowels(ArrayList<String> wordList)
    {
        for (int x = 0; x < wordList.size(); x++)
        {
            if (wordList.get(x).indexOf("a") != -1 || wordList.get(x).indexOf("e") != -1 || wordList.get(x).indexOf("o") != -1 || wordList.get(x).indexOf("i") != -1)
            {
                wordList.remove(x);
                x--;
            }
            else
            {
                wordList.add(x, wordList.get(x));
                x++;
            }
        }

    }




}
