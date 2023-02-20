
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        int count[] = new int[256];
        int len =str.length();
        for(int i = 0; i < len; i++)
            count[str.charAt(i)]++;
            int max = -1;
            char result = ' ';
        for(int i = 0; i < len; i++){
            if(max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
}
