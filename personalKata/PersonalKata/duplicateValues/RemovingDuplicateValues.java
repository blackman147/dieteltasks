package PersonalKata.duplicateValues;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingDuplicateValues {
    public static int removeDuplicate(int [] numbers){
        Arrays.sort (numbers);
        ArrayList<Integer> nums = new ArrayList<> ();
        nums.add (numbers[0]);

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < nums.size (); j++) {
                if (nums.get (j) == numbers[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                nums.add (numbers[i]);
            }
        }
        nums.forEach (System.out ::println);
        System.out.println ( );
        return nums.size ();

    }

    public static void main(String[] args) {

    }
}
