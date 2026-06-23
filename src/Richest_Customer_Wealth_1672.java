public class Richest_Customer_Wealth_1672 {
    public static void main(String []args){
        int [][]accounts = {{2,8,7},{7,1,3},{1,9,5}};

        int wealth = 0;
        for(int i=0;i<accounts.length;i++){
            int sum =0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            wealth = Math.max(wealth,sum);
        }
        System.out.println(wealth);
    }
}
