class Solution {
     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> arr=new ArrayList<>();
        Arrays.sort(candidates);

        fun(0,arr,candidates,target,set);
        return new ArrayList<>(set);
    }
    public void fun(int ind,List<Integer> arr,int[] candidates,int target,Set<List<Integer>> ans)
    {
        if(ind==candidates.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        if(candidates[ind]<=target)
        {
            arr.add(candidates[ind]);
            fun(ind+1,arr,candidates,target-candidates[ind],ans);
           
            arr.remove(arr.size()-1);
        }
        fun(ind+1,arr,candidates,target,ans);
    }
}