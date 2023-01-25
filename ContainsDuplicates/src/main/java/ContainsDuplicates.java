import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        //Set<Integer> has_duplicate = new HashSet<Integer>();
        //for(int i =0; i < nums.length; i++){
            //if(has_duplicate.contains(nums)){
                //return true;
            //}
        //}
        //return false;
    //}
//}
        Set<Integer> has_duplicate = new HashSet<Integer>();
        for (int i : nums){        // (int i =0; i < nums.length; i++) need to figure this solution instead
            
            if (has_duplicate.contains(i)) return true;
            has_duplicate.add(i);
        }
        return false;
    }
}