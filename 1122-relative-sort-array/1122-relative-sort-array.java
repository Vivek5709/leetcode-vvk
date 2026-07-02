class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int []temp = new int[1001];
        for(int n:arr1)temp[n]+=1;
        int itr = 0;

        for(int n:arr2){
            for(int i =0;i<temp[n];i++){
                arr1[itr] = n;
                itr++;
            }
            temp[n] = 0;
        }

        for (int i = 0; i < temp.length; i++) {
    while (temp[i] > 0) {
        arr1[itr++] = i;
        temp[i]--;
    }
}
        return arr1;
    }
}