import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        // Count the frequency of each element in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Iterate through nums2 and check for matches
        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1); // Decrease count after using
            }
        }

        // Convert the result list to an array
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}
