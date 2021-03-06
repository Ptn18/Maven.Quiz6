package rocks.zipcode.io.fundamentals;


import java.util.Collection;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {

        // get length of string
        // get range of length
        // get power-set of range

        // for every set in power-set
            // uppercase indices of string using set
        return null;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
//        char[] arr = string.toCharArray();
//        for(int i = 0; i < indices.length;i++) {
//            if( )
//            arr[0] = Character.toUpperCase(arr[]);
//        }
//        String str = new String(arr);
//        System.out.println(str);

        return null;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        String newString = stringToBeManipulated.substring(0,index);
        String stringTwo = stringToBeManipulated.substring(index);
        return newString + valueToBeInserted + stringTwo;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        String firstPart = stringToBeManipulated.substring(0,index);
        String secondPart = stringToBeManipulated.substring(index+1);
        return firstPart + replacementValue + secondPart;
    }
}