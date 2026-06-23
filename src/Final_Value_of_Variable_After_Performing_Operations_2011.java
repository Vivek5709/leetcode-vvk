public class Final_Value_of_Variable_After_Performing_Operations_2011 {
    public static void main(String []args){
        String []operations = {"X++","++X","--X","X--"};

        int x =0;
        for(String s:operations){
            if(s.indexOf("++")!=-1){
                x++;
            }else if(s.indexOf("--")!=-1){
                x--;
            }
        }

        System.out.println(x);
    }
}
