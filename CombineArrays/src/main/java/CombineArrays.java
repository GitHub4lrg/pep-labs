
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int a = arr1.length;
        int b = arr2.length;
        int c = a + b;
        int[] c1 = new int[c];
        //System.arraycopy(arr1, 0, c1, 0, a);   //solution with predefined method arraycopy.
        //System.arraycopy(arr2, 0, c1, a, b);
        //return c1;
        for(int i = 0; i < arr1.length; i++){
            c1[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){    //solution w/o using predefined method.
            c1[arr1.length + i] = arr2[i];
        }
        for(int i = 0; i < c1.length; i++){
            
        }
        return c1;
    }
}