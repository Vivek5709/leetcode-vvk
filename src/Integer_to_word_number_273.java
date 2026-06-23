public class Integer_to_word_number_273 {
    public static void main(String[] args){

        int n[]={1,2,3,4,5,6,7,8,9};
        String number[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String teen[]={"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String dec[]={"Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};


        int num = 432246000;
        int same_num = num;

        //   2 147 483 647

        String str = "";
        int mod=0;
        int count=0;
        int digit_count = 0;
        int index = 1;
        String s = null;

        while(num!=0){
            mod=num%10;
            digit_count++;

            if(mod==0){
                num=num/10;

                if(digit_count==3){
                    str = " Thousund " + str;
                }else if(digit_count==6){
                    str= " Million " + str;
                }else if(digit_count==9){
                    str= " Billion " + str;
                }

                if(count==2){
                    count =0;
                }else{
                count++;
                }
                continue;
            }

            if(count==0){
                str = number[mod-1]+ " " + str;                                 //   2 147 483 647
                count++;
            }else if(count==1){
                str=dec[mod-1] + " " + str;
                count++;
            }else if(count==2){
                if(same_num>999 && digit_count>=3 && index==1){
                    s = " Thousund ";
                    index++;
                }else if(same_num>999999 && digit_count>=6 && index==2){
                    s = " Million ";
                    index++;
                }else if(same_num>999999999 && digit_count>=9 && index==3){
                    s = " Billion ";
                }else{
                    s = "";
                }

                str = s + number[mod-1]+ " Hundered " + str ;
                count++;
            }

            if(count>2){
                count=0;
            }
            num=num/10;
        }


        //   2 147 483 647

        System.out.println(str);
    }
}
