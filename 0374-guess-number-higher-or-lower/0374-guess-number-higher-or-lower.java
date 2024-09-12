public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s=0;
        int e=n;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(guess(mid)==1)
            {
                s=mid+1;
            }
            else if(guess(mid)==-1)
            {
                e=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return 0;
    
    }
}