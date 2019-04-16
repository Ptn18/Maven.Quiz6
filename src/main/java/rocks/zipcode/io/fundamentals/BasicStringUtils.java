package rocks.zipcode.io.fundamentals;

import rocks.zipcode.io.arrays.ArrayUtils;

import java.util.regex.Pattern;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
    String stringOfChar = String.valueOf(chars);
        return stringOfChar;
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        char[] characterToChar = ArrayUtils.unbox(chars);

        return getString(characterToChar);
    }
    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        String noVowelsAllow = string.replaceAll("[aeiouAEIOU]","");
        return noVowelsAllow;
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        return string.replaceAll(charactersToRemove,"");
}
}
