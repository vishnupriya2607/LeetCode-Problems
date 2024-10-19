class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> map=new HashSet<>();
        for(char ch:jewels.toCharArray())
        {
            map.add(ch);
        }
        int sum=0;
        for(int i=0;i<stones.length();i++)
        {
            if(map.contains(stones.charAt(i)))
            {
            sum++;
            }
        }
        return sum;
    }
}