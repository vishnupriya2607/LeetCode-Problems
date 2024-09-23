import java.util.HashMap;

class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        // If the total sum of all numbers is less than the desiredTotal, no one can win
        int sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
        if (sum < desiredTotal) {
            return false;
        }
        
        // If desiredTotal is 0 or less, the first player wins by default
        if (desiredTotal <= 0) {
            return true;
        }
        
        // Use memoization to store already computed game states
        HashMap<Integer, Boolean> memo = new HashMap<>();
        
        // Helper function to simulate the game
        return canWin(maxChoosableInteger, desiredTotal, 0, memo);
    }
    
    private boolean canWin(int maxChoosableInteger, int desiredTotal, int usedNumbers, HashMap<Integer, Boolean> memo) {
        // If this state has been computed before, return the result
        if (memo.containsKey(usedNumbers)) {
            return memo.get(usedNumbers);
        }
        
        // Try picking each number that hasn't been used yet
        for (int i = 1; i <= maxChoosableInteger; i++) {
            // Check if the number has been used
            if ((usedNumbers & (1 << i)) == 0) {
                // If picking this number makes the current player win, return true
                if (i >= desiredTotal || !canWin(maxChoosableInteger, desiredTotal - i, usedNumbers | (1 << i), memo)) {
                    memo.put(usedNumbers, true);
                    return true;
                }
            }
        }
        
        // If no winning strategy is found, return false
        memo.put(usedNumbers, false);
        return false;
    }
}
