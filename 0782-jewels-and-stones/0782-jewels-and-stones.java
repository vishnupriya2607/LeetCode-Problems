class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> map=new HashSet<>();
        for(char ch:jewels.toCharArray())
        {
            map.add(ch);
        }
        int sum=0;
        for(char ch:stones.toCharArray())
        {
            if(map.contains(ch))
            {
            sum++;
            }
        }
        return sum;
    }
}