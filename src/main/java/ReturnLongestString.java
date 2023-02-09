
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int length = 0;
        String puppet = "";
        for(int j=0; j<arr.length; j++) {
            if(arr[j].length()>length) {
                length = arr[j].length();
                puppet = arr[j];
            }

        }
        return puppet;
    }
}
