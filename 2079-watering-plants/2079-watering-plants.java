class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int c=capacity,s=0;
        for(int i=0;i<plants.length;i++)
        {
            if(capacity>=plants[i])
            {
                capacity-=plants[i];
                s++;
            }
            else
            {
                s+=(2*i)+1;
                capacity=c-plants[i];

            }
        }
        return s;
    }
}