public class Shortest_Distance_to_Target_String_in_a_Circular_Array_2515 {
    public static void main(String args[]){
        String []words = {"a","b","leetcode"};
        String target = "leetcode";
        int startIndex = 0;

        int n= words.length;
        int left = (startIndex-1+n)%n;
        int right = (startIndex+1)%n;

        if(words[startIndex].equals(target)){
            System.out.println(0);
        }

        while(left!=right){
            if(words[left].equals(target) || words[right].equals(target)){
                break;
            }
            left=(left-1+n)%n;
            right=(right+1)%n;
        }

        if(words[left].equals(target)){
            System.out.println(Math.abs((startIndex-left+n)%n));
        }else if(words[right].equals(target)){
            System.out.println(Math.abs((startIndex-right+n)%n));
        }else{
            System.out.println(-1);
        }
    }
}
