package intersectionOfTwoArrays;

import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int[] small;
        int[] big;
        if (nums1.length < nums2.length) {
            small = nums1;
            big = nums2;
        } else {
            big =  nums1;
            small = nums2;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : small) {
            map.merge(i, 1, Integer::sum);
        }
        for (int i : big) {
            if (map.containsKey(i)) {
                Integer count = map.get(i);
                if (count == 1) {
                    map.remove(i);
                } else {
                    map.put(i, count - 1);
                }
                result.add(i);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}