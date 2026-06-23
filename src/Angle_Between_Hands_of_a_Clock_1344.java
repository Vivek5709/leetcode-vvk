public class Angle_Between_Hands_of_a_Clock_1344 {
    public static void main(String[] args){
        int hour = 12;
        int minutes = 30;

        double hrs = (hour%12)*30 + (minutes*0.5);
        double min = minutes*6;

        double angle = Math.abs(hrs - min);

        System.out.println(angle);
    }
}
