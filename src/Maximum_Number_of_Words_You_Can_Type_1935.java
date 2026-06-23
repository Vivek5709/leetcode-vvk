public class Maximum_Number_of_Words_You_Can_Type_1935 {
    public static void main(String[] args){
        String text = "leet code";
        String brokenLetters = "lt";

        String []arr = text.split(" ");
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<brokenLetters.length();j++){
                if(arr[i].indexOf(brokenLetters.charAt(j))!=-1){
                    count++;
                    break;
                }
            }
        }

        System.out.println(arr.length-count);
    }
}
