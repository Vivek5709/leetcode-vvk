class Solution {
    HashSet<Integer> set = new HashSet<>();

    void solution(int[] digits, int num, int first, int second, int count){
        if (count == 3) {
            if (num >= 100 && num % 2 == 0) {
                set.add(num);
            }
            return;
        }

        for (int i = 0; i < digits.length; i++) {

            if (i == first || i == second) {
                continue;
            }

            num = (num * 10) + digits[i];

            solution(digits, num, second, i, count + 1);

            num /= 10;
        }    
    
    }


    public int totalNumbers(int[] digits) {
        solution(digits, 0, -1, -1, 0);

        return set.size();
    }
}