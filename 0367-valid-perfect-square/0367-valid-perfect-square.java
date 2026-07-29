class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num/2;

        if(num==1)return true;

        while(left<=right){
            int mid = (right + left)/2;
            long square = (long)mid*mid;

            if(square > num){
                right = mid - 1;
            }else if(square < num){
                left = mid + 1;
            }else{
                return true;
            }
        }

        return false;
    }
}