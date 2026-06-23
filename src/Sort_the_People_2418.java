import java.util.Arrays;

public class Sort_the_People_2418 {
    public static void main(String[] args){
        String []names = {"Alice","Bob","Bob"};
        int []heights = {155,185,150};

        int n=heights.length;
        int swap;
        String temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(heights[j]<heights[j+1]){
                   swap = heights[j];
                   heights[j] = heights[j+1];
                   heights[j+1]=swap;

                   temp = names[j];
                   names[j] = names[j+1];
                   names[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(names));
    }
}
