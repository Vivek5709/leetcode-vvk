class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        for(int i =1;i<=n*2;i++){
           if(i%2==0)sumEven += i;
           if(i%2!=0)sumOdd += i;
        }

        while(sumEven!=0){
            int rem = sumOdd % sumEven;
            sumOdd = sumEven;
            sumEven = rem;
        }

         return sumOdd;
    }
}