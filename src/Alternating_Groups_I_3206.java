public class Alternating_Groups_I_3206 {
    public static void main(String[] args){
        int []colors = {1,1,1};

        int n=colors.length;
        int left=0;
        int right=(left+2)%n;
        int count=0;

        int i=0;
        while(i<n){
            if(colors[left]==colors[right] && colors[left]!=colors[(left+1)%n]){
                count++;
            }
            left=(left+1)%n;
            right=(right+1)%n;
            i++;
        }

        System.out.println(count);
    }
}
