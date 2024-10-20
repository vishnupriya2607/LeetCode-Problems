class Solution {
    public int maximumTastiness(int[] price, int k) {
       Arrays.sort(price);
        int low = 0, high = Integer.MAX_VALUE, mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (isPossible(price, k, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    boolean isPossible(int[] price, int k, int x) {
        int last = price[0], count = 1, i = 1;
        while ( i < price.length) {
            if (price[i] - last >= x) {
                last = price[i]; count++;
            }
            i++;
            if(count>=k) {
                return true;
            }
        }
        return count >= k;
    }
}