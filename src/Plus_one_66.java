public class Plus_one_66 {
        public static void main(String[] args) {
            int []digits = {1,2,3,4,5};
            int num = 0;

            for(int i=0;i<digits.length;i++){
                num=(num*10)+digits[i];
            }
            System.out.println(num);

            num++;
            int n = num;
            int count=0;

            while(n!=0){
                n=n/10;
                count++;
            }

            System.out.println(count);

            int d=0;

            int j=0;
            int []arr= new int[count];

            while(num!=0){
                d=num%10;
                arr[j]=d;
                j++;
                num=num/10;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");}

            System.out.println("");


            int end;
            if(arr.length%2==0){
                 end = (count/2)-1;
            }else{
                 end = (count/2);
            }
            count--;
            int swap =0;

            System.out.println(end);

            if(arr.length==2){
                swap=arr[0];
                arr[0]=arr[1];
                arr[1]=swap;
            }else{

                for(int x=0;x<end+1;x++){
                    swap = arr[x];
                    arr[x]=arr[count];
                    arr[count]=swap;

                    count=count-1;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            // System.out.print(count);


    }
}
