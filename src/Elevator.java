import java.util.Scanner;

public class Elevator {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);


            int currentFloor = 3;
            int increament= 1;

            int targetFloor= sc.nextInt();

            if(targetFloor>currentFloor){
                increament = 1;
            }else if(targetFloor<currentFloor){
                increament =-1;
            }

            while(currentFloor!=targetFloor){
                System.out.println("lift passing through"+currentFloor);
                currentFloor = currentFloor + increament;
            }
        System.out.println("lift passing through"+currentFloor);
        System.out.println("We have reached target floor"+currentFloor);
    }
}
