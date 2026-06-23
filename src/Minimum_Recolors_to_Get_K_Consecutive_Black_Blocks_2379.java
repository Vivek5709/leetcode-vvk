public class Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks_2379 {
    public static void main(String []args){
                String blocks ="BBBBBWWBBWBWBWWWBWBWBBBBWBBBBWBWBWBWBWWBWWBWBWWWWBBWWWWBWWWWBWBBWBBWBBWWW";
                int k=29;

                int left=0;
                int count =0;

                for(int i=left;i<k;i++){
                    if(blocks.charAt(i)=='W'){
                        count++;
                    }
                    //System.out.print(blocks.charAt(i));
                }

                if(blocks.length()==k){
                    System.out.println(count);
                }

                left++;
                int min = count;

                while(k<blocks.length()){
                    if(blocks.charAt(k)=='W'){
                        count++;
                    }
                    if(blocks.charAt(left-1)=='W'){
                        count--;
                    }
                    if(min>count){
                        min=count;
                    }
                    left++;
                    k++;
                }

                System.out.println(min);
    }
}
