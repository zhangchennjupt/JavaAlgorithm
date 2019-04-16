package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangchen
 * @Date 2019/4/16 15:19
 */
class twoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++ ) {
            int index = target - nums[i];
            if (map.containsKey(index)) {
                return new int[] { map.get(index), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {

        int test[] = new int[]{1,2,3,4,5};
        int result[] = twoSum(test,9);

        for (int i = 0; i < result.length; i++ ) {
            System.out.println(result[i]);
        }
    }
}
