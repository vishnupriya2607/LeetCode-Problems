class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int s=1;
        int e=piles[piles.length-1];
        int result=e;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(check(piles,mid,h))
            {
result=mid;
e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return result;

    }
    public static boolean check(int[] piles,int mid,int hr)
    {
        int h=0;
        for(int p:piles)
        {
            h=h+(int) Math.ceil((double) p / mid);
            if(h>hr)return false;
        }
        if(h<=hr){
        return true;
        }
        else
        {
            return false;
        }
    }
}