import java.util.ArrayList;
import java.util.List;

public class Words_Within_Two_Edits_of_Dictionary_2452 {
    public static void main(String args[]){
        String []queries = {"word","note","ants","wood"};
        String []dictionary = {"wood","joke","moat"};

        List<String> list = new ArrayList<>();

        int count =0;

        for(String q:queries){
            for(String d:dictionary){
                for(int i=0;i<q.length();i++){
                    if(q.charAt(i)!=d.charAt(i)){
                        count++;
                    }
                    if(count>2){
                        break;
                    }
                }
                if(count<=2){
                    list.add(q);
                    count=0;
                    break;
                }
                count=0;
            }
        }

        System.out.println(list);
    }
}
