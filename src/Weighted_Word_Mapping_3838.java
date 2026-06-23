import java.util.Arrays;

public class Weighted_Word_Mapping_3838 {
    public static void main(String args[]){
        String []words = {"abcd"};
        int []weights = {7,5,3,4,3,5,4,9,4,2,2,7,10,2,5,10,6,1,2,2,4,1,3,4,4,5};

        int arr[] = new int[words.length];
        for(int j=0;j<words.length;j++){
            int sum =0;
            for(int i=0;i<words[j].length();i++){
                sum+=weights[words[j].charAt(i)-'a'];
            }
            arr[j] = sum%26;
        }

        String s = "";
        for(int i=0;i<arr.length;i++){
            s+=(char)('a'+26-arr[i]-1);
        }

        System.out.println(s);
        System.out.println(Arrays.toString(arr));

        //System.out.println((char)('a'+4));
       //  System.out.println('d'-'a'+1);
    }
}
