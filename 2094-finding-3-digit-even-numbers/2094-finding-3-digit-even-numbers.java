class Solution {
    boolean[] found = new boolean[1000];

    void solution(int[] digits, int num, int count, boolean[] used) {

        if (count == 3) {
            if (num % 2 == 0) {
                found[num] = true;
            }
            return;
        }

        for (int i = 0; i < digits.length; i++) {

            if (used[i])
                continue;

            if (count == 0 && digits[i] == 0)
                continue;

            used[i] = true;

            solution(
                digits,
                num * 10 + digits[i],
                count + 1,
                used
            );

            used[i] = false;
        }
    }

    public int[] findEvenNumbers(int[] digits) {

        boolean[] used = new boolean[digits.length];

        solution(digits, 0, 0, used);

        List<Integer> list = new ArrayList<>();

        for (int i = 100; i < 1000; i++) {
            if (found[i]) {
                list.add(i);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}