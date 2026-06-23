public class Ant_on_the_Boundary_3028 {
    public static void main(String args[]){
        int nums[] = {2,3,-5};
        int pos = 0;
        int count =0;

        for(int i=0;i<nums.length;i++){
            pos = pos + nums[i];
            if(pos==0 && i!=0){
                count++;
            }
        }

        System.out.println(count);
    }
}
