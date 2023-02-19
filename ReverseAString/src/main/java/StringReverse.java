
public class StringReverse {
    /**
     * Task: return the reverse of a string.
     * There are multiple good ways to solve this problem.
     *
     * You could do some math to grab characters from the end of the String using a typical for loop.
     * For instance, you could use build a String by writing a for loop that decrements rather than increments, grabbing
     * characters from the String starting from the end.
     * You could also look into the methods provided by StringBuilder.
     * 
     * Here traverse the length of the string
     * extract each character while traversing
     * add each character in front of the existing string
     *
     * @param str a String.
     * @return the reverse of str.
     */
    public String reverse(String str){
    /*  String str1 = str, nstr = "";
        char ch;
        for(int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);
            nstr = ch + nstr;
        }
        return str;  
    }    */

    /* Another solution
     * Create a temp byte[] of length equal to the length of the input string
     * Store the bytes(by using getBytes() method) in reverse order, into the temp byte[]
     * Create a new String obj using byte[] to store the result
     */
/*      byte[] str1 = str.getBytes();
        byte[] result = new byte[str1.length];
        for(int i = 0; i < str1.length; i++)
        result[i] = str1[str1.length - i - 1];

    return (new String(result));
    } */ 

    /* One more solution - Using built in reverse() method of the StringBuilder class | Can use StringBuffer as well
     * Create method StringBuilder
     * Append a string into new StringBuilder
     * Reverse StringBuilder
     * Create a new String to store the reversed String
     */
    StringBuilder str1 = new StringBuilder();
    str1.append(str);
    str1.reverse();
    return new String(str1);
}
    
}
