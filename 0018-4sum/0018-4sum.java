class Solution {
    public List<List<Integer>> fourSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); // Sort the array to simplify duplicate handling
        fun(0, candidates, (long) target, new ArrayList<>(), ans);
        return ans;
    }

    public static void fun(int ind, int[] arr, long t, List<Integer> li, List<List<Integer>> ans) {
        // Base case: If the size of the combination is 4
        if (li.size() == 4) {
            if (t == 0) {
                ans.add(new ArrayList<>(li));
            }
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            // Skip duplicates
            if (i > ind && arr[i] == arr[i - 1]) continue;

            // Early exit: If the smallest remaining numbers cannot form a valid sum
            if (arr[i] > t && t > 0) break;

            li.add(arr[i]); // Add the current element
            fun(i + 1, arr, t - arr[i], li, ans); // Recursive call with updated target
            li.remove(li.size() - 1); // Backtrack
        }
    }
}
