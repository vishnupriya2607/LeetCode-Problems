class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
       int arr1[]=Arrays.stream(arr).distinct().sorted().toArray();
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