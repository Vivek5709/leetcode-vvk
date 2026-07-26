class Solution {
    public int maximumProduct(int[] nums) {
        int firstMax = -1001;
        int secMax = -1001;
        int thirdMax = -1001;
        int firstMin = 1001;
        int secMin = 1001;

        for(int n : nums){
            if(n >= firstMax){
                thirdMax = secMax;
                secMax = firstMax;
                firstMax = n;
            }else if(n < firstMax && n >= secMax){
                thirdMax = secMax;
                secMax = n;
            }else if(n < secMax && n >= thirdMax){
                thirdMax = n;
            }

            if(n <= firstMin){
                secMin = firstMin;
                firstMin = n;
            }else if(n <= secMin){
                secMin = n;
            }
        }

        int a = firstMax * (firstMin * secMin);
        int b = firstMax * secMax * thirdMax;

        return (Math.max(a,b));
        
    }
}