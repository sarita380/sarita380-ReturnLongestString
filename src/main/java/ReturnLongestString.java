
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int longeststring = 0;
        String str = null;
        for(String lst:arr){
            if(lst.length()> longeststring){
                longeststring = lst.length();
                str=lst;
            }
         
        }
        return str;
    }
}
