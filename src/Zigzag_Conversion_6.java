public class Zigzag_Conversion_6 {
    public static void main(String[] args) {

        String str = "PAYPALISHIRING";
        int numRows = 4;

        int i = 0;
        int count_flag = 0;
        int count_rows = 0;

        while(true){
            if(count_flag==0){
                i = i + numRows;
                count_rows++;
                count_flag = 1;
            }else{
                i = i + (numRows-2);
                count_rows++;
                count_flag = 0;
            }
            if(i >= str.length()){
                break;
            }
        }

        char arr[][] = new char[count_rows][numRows];

        int char_index = 0;
        int insert_flag = 0;

        for(int j=0;j<count_rows;j++){

            if(insert_flag==0){

                for(int k=0;k<numRows;k++){
                    if(char_index < str.length()){
                        arr[j][k] = str.charAt(char_index++);
                    }else{
                        arr[j][k] = '@';
                    }
                }

                insert_flag = 1;

            }else{

                for(int k=numRows-1;k>=0;k--){

                    if(k==0 || k==numRows-1){
                        arr[j][k] = '@';
                    }
                    else if(char_index < str.length()){
                        arr[j][k] = str.charAt(char_index++);
                    }
                    else{
                        arr[j][k] = '@';
                    }

                }

                insert_flag = 0;
            }
        }



        String str1 = "";
        for(int v=0;v<numRows;v++){
            for(int s=0;s<count_rows;s++){
                if(arr[s][v]=='@'){
                    continue;
                }else{
                    str1=str1+arr[s][v];
                }
                //System.out.print(arr[s][v]);
            }
        }
        System.out.println(str1);
    }
}