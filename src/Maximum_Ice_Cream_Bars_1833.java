import java.util.Arrays;

public class Maximum_Ice_Cream_Bars_1833 {
    public static void main(String[] args){
        int []costs = {1,3,2,4,1};
        int coins = 7;

        int max = Integer.MIN_VALUE;
        for(int n:costs)max = Math.max(max,n);

        int []arr = new int[max];
        for(int n:costs){
            arr[n-1]+=1;
        }

        int sum =0;
        int j =0;

        for(int i=0;i<arr.length;i++){
            while(arr[i]>0){
                costs[j] = i+1;
                arr[i]--;
                j++;
            }
        }

        for(j=0;j< costs.length;j++){
            sum+=costs[j];
            if(sum>coins)break;
        }

        System.out.println(j);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(costs));

    }
}
