package homeWork;

import java.util.Scanner;

public class ElevatorWork {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(1);
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter 1 to start!");
        int start = scanner.nextInt();

        while(start == 1){
            System.out.print("Enter the floor and weight: ");
            int floor = scanner.nextInt();
            int weight = scanner.nextInt();
            if (elevator.isAllowableFloor(floor) && elevator.isAllowableWeight(weight)){
                elevator.move(floor);
            }
            else
                System.out.println("floor doesn't exist or your weight bigger than maximal. Enter again.");
        }
    }
}
