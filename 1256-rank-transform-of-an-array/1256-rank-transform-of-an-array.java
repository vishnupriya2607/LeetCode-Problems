class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
    Set<Integer> set=new HashSet<>();
    for(int i=0;i<arr.length;i++)
    {
        set.add(arr[i]);
    }
     Integer[] arr1 = set.toArray(new Integer[0]);  // Convert to an array
        Arrays.sort(arr1);  //
       for(int i=0;i<arr1.length;i++)
       {
        map.put(arr1[i],i+1);
       }
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=map.get(arr[i]);
       }
       return arr;
    }
}