class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> map = new HashMap<>();
         List<Integer> li=new ArrayList<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    List<Map.Entry<Integer, Integer>> List = new ArrayList<>(map.entrySet());
 List.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
  int[]a=new int[k];
      for(int i=0;i<k;i++)
      {
            a[i]=(List.get(i).getKey());

        }
      
     
        return a;
      }
    
}