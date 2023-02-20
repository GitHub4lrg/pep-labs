import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    final int ASCII_SIZE = 256;
    public char recurringChar(String str) {
/*    int count[] = new int[ASCII_SIZE];
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
        return result; */
        
        //another solution
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char result = ' ';
        for(int i = 0; i < str.length(); i++){
            result = str.charAt(i);
            if(map.containsKey(result) == true){
                map.replace(result, map.get(result) + 1);
            }
            else{
                map.put(result, 1);
            }
        }
        
        result = str.charAt(0);
        for(int i = 0; i < str.length(); i++){
            if(map.get(str.charAt(i)) > map.get(result)){
                result = str.charAt(i);
            }
        }
        return result;
    }
}

