import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] num, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(num[0], 0);

        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(target - num[i]) && map.get(target - num[i]) != i) {
                return new int[]{map.get(target - num[i]), i};
            } else {
                map.put(num[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
