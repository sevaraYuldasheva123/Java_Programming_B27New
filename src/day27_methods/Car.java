package day27_methods;

public class Car {


        /*
        unlock the car
        open door
        sit down and start
        check mirrors
        seatbelt
        put to drive and go
         */

        public static void unlock(){
            System.out.println("Unlocking the Car");
        }

        public static void openDoor(){
            System.out.println("Opening the door");
        }

        public static void sitAndStart(){
            System.out.println("Sitting down in seat");
            System.out.println("Insert the key");
            System.out.println("Start the car");
        }

        public static void checkMirrors(){
            System.out.println("Checking left mirror");
            System.out.println("Checking rear view");
            System.out.println("Checking right mirror");
        }
        public static void putOnSeatBelts(){
            System.out.println("Putting on seat belts");
        }
        public static void drive(){
            System.out.println("Putting on drive");
            System.out.println("Adjusting the acceleration");
        }

        public static void late(){
            unlock();
            openDoor();
            sitAndStart();
            drive();

        }

    public static void main(String[] args) {

            unlock();
            openDoor();
            sitAndStart();
            checkMirrors();
            putOnSeatBelts();
            drive();
        System.out.println();

        late();
    }

}
