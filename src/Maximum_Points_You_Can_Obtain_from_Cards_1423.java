public class Maximum_Points_You_Can_Obtain_from_Cards_1423 {
    public static void main(String args[]){
    int []cardPoints = {1,2,3,4,5,6,1};
    int k = 3;

    int p1 = k-1;
    int p2 = cardPoints.length;
    int left_sum = 0;
    int right_sum = 0;
    int total_sum = 0;
    int sum =0;

    for(int i=0;i<cardPoints.length;i++){
        sum = sum + cardPoints[i];
        cardPoints[i] = sum;
    }




    }
}
