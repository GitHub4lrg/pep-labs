
public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){
/*      String rev = "";   //emty string to store the reverse of string
        boolean response = false;   //boolean variable for the answer
        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i) ;
        }
        //check if both are equal
        if(str.equals(rev)) {
            response = true;
        }
        return response;
    }  */

    //another solution - one pointer at the start & one pointer at the end of a string. 
    //                   Keep incrementing one & decrementing & at every step check is characters are the same or not.
    int i =0;
    int j = str.length() - 1;
    while(i < j) {
        if(str.charAt(i) != str.charAt(j))
        return false;
        //increment pointers
        i++;
        j--;
    }
    return true;
    }
}
