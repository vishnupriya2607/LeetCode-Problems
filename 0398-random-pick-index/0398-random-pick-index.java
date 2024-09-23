class Solution {
private Random rmd;
private int[] nums;
    public Solution(int[] nums) {
        this .rmd=new Random();
        this.nums=nums;
    }
    
    public int pick(int target) {
       while(true) {
        int nextInt = rmd.nextInt(nums.length);
        if(nums[nextInt] == target) {
            return nextInt;
        }
       }
    }
    }


/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */