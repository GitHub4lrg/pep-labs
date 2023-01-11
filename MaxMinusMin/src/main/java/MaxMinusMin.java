
import java.util.ArrayList;
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        List<Integer> l1 = new ArrayList<Integer>();

        int max_val = nums[0];
	    int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max_val)
                max_val = nums[i];
            else if(nums[i] < min)
                min = nums[i];
        return max_val-min;
        }
    }
}
