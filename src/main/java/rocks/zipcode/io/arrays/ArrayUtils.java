package rocks.zipcode.io.arrays;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        int length = Math.abs(end-start);
        int count = start;
        Integer[] range = new Integer[length+1];
        for(int i = 0; i <= length; i++){
            range[i] = count;
            count++;
        }
        return range;
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        char[] primitive = new char[array.length];
        for(int i = 0; i < array.length;i++){
            primitive[i] = array[i];
        }

        return primitive;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        Character[] object = new Character[array.length];
        for(int i = 0; i < array.length;i++){
            object[i] = (array[i]);
        }

        return object;
    }
}
