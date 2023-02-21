
import java.util.HashMap;
import java.util.Map;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){
        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        String[] ignored = words.split(" ");
        for(String s:ignored) {
            if(!wordCount.containsKey(s)) {   //first time we see this string
                wordCount.put(s, 1);
            }else{
                int count = wordCount.get(s);
                wordCount.put(s, count + 1);
            }
        }
    /*  
     * Review this solution later 
        Map<String, Integer> wordCount = Arrays.stream(words.toLowerCase().split(" "))
                        .collect(Collectors.groupingBy(Function.identy(), Collectors.counting())); */
        return wordCount;
    }
}
