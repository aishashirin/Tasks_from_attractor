package homeWork;

public class Elevator {
    int currentFloor;
    int capacity;
    int maxFloor = 18;

    Elevator(int currentFloor){
        this.currentFloor = currentFloor;
    }

    public void move(int toFloor){
        if (toFloor > currentFloor){
        for (int i = currentFloor; i<=toFloor ; i++){
            System.out.println("you are now on " + i + " floor");
            if (i == toFloor){
                System.out.println("you are at your floor!");
            }
        }
        currentFloor = toFloor;}
        else if (toFloor <currentFloor){
            for (int i = currentFloor; i>=toFloor ; i--){
                System.out.println("you are now on " + i + " floor");
                if (i == toFloor){
                    System.out.println("you are at your floor!");
                }
            }
            currentFloor = toFloor;
        }
        else if (toFloor == currentFloor){
            System.out.println("you are at your floor!");
        }
    }

    public boolean isAllowableWeight(int weight){
        if (weight <=200){
            return true;
        }
        else
            return false;
    }

    public boolean isAllowableFloor(int floor){
        if (floor <= maxFloor){
            return true;
        }
        else
            return false;
    }
}
