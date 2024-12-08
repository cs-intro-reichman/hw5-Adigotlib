/**
 * A library of string functions.
 */
public class MyString {
    public static void main(String args[]) {
        String hello = "hello";
        System.out.println(countChar(hello, 'h'));
        System.out.println(countChar(hello, 'l'));
        System.out.println(countChar(hello, 'z'));
        System.out.println(spacedString(hello));
        //// Put your other tests here.
    }
    /**
     * Returns the number of times the given character appears in the given string.
     * Example: countChar("Center",'e') returns 2 and countChar("Center",'c') returns 0. 
     * 
     * @param str - a string
     * @param c - a character
     * @return the number of times c appears in str
     */
    public static int countChar(String str, char ch) {
        int counter = 0;
        if (str.length() == 0)
        {
            return 0;
        }
        for (int i = 0; i < str.length(); i++)
        {
            String now= "" + str.charAt(i);
            if (now.indexOf(ch) != -1)
            {
                counter++;

            }
        }
        return counter;
    }

    /** Returns true if str1 is a subset string str2, false otherwise
     *  Examples:
     *  subsetOf("sap","space") returns true
     *  subsetOf("spa","space") returns true
     *  subsetOf("pass","space") returns false
     *  subsetOf("c","space") returns true
     *
     * @param str1 - a string
     * @param str2 - a string
     * @return true is str1 is a subset of str2, false otherwise
     */
    public static boolean subsetOf(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++)
        {
           char ch = str1.charAt(i);
           if (countChar(str1, ch) > countChar(str2, ch))
           {
             return false;  
           }
        }
       return true;
    }

    /** Returns a string which is the same as the given string, with a space
     * character inserted after each character in the given string, except
     * for the last character. 
     * Example: spacedString("silent") returns "s i l e n t"
     * 
     * @param str - a string
     * @return a string consisting of the characters of str, separated by spaces.
     */
    public static String spacedString(String str) {

            String newstr = "";
            for (int i = 0; i <= str.length(); i++)
            {
                newstr = newstr + " " + str.charAt(i);
            }
            return newstr;

        }
  
    /**
     * Returns a string of n lowercase letters, selected randomly from 
     * the English alphabet 'a', 'b', 'c', ..., 'z'. Note that the same
     * letter can be selected more than once.
     * 
     * Example: randomStringOfLetters(3) can return "zoo"
     * 
     * @param n - the number of letter to select
     * @return a randomly generated string, consisting of 'n' lowercase letters
     */
    public static String randomStringOfLetters(int n) {
        String letters = "abcdefghijklmnopqrstuvwxz";
        String newstr = "";
        while (n > 0)
        {
            int random = (int) (25 * (Math.random()));
            char ch = letters.charAt(random);
            newstr= newstr + ch;
            n--;
        }
        return newstr;
    }

    /**
     * Returns a string consisting of the string str1, minus all the characters in the
     * string str2. Assumes (without checking) that str2 is a subset of str1.
     * Example: remove("meet","committee") returns "comit" 
     * 
     * @param str1 - a string
     * @param str2 - a string
     * @return a string consisting of str1 minus all the characters of str2
     */
    public static String remove(String str1, String str2) {
       String cleanone = "";
       if (str2.length() == 0)
       {
        return str1;
       }
       for (int i= 0; i < str1.length(); i++)
       {
            if (str2.indexOf(str1.charAt(i)) != -1)
            {
                int notin= str2.indexOf(str1.charAt(i));
                for (int z = 0; z < str2.length(); z++)
                {
                    if (notin != z)
                    {
                        cleanone = cleanone + str2.charAt(z);
                    }
                }
                str2 = cleanone;
                cleanone = "";
            }
       }
        return str2;
    }

    /**
     * Returns a string consisting of the given string, with the given 
     * character inserted randomly somewhere in the string.
     * For example, insertRandomly("s","cat") can return "scat", or "csat", or "cast", or "cats".  
     * @param ch - a character
     * @param str - a string
     * @return a string consisting of str with ch inserted somewhere
     */
    public static String insertRandomly(char ch, String str) {
         int randomIndex = (int) (Math.random() * (str.length() + 1));
         String result = str.substring(0, randomIndex) + ch + str.substring(randomIndex);
         return result;
    }    
}
