public class Number_of_Laser_Beams_in_a_Bank_2125 {
    public static void main(String args[]){
        String []bank = {"011001","000000","010100","001000"};

        int prev = 0;
        int beam = 0;

        for(String row : bank){
            int count = 0;

            for(char c : row.toCharArray()){
                if(c == '1') count++;
            }

            if(count > 0){
                beam += prev * count;
                prev = count;
            }
        }

        System.out.println(beam);

    }
}
