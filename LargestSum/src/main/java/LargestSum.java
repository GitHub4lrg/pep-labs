
import java.util.Arrays;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int[] arr = new int[nums.size()];
        for(int i = 0; i < nums.size(); i++){
            arr[i] = nums.get(i);
        }
        Arrays.sort(arr);
        int sum = arr[nums.size()-1] + arr[nums.size()-2];
        return sum;
    }
}