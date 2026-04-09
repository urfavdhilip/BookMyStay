public class BasicRoomTypes  {

    static class Room {
        String type;
        int beds;
        int sizeSqft;
        double pricePerNight;
        int available;

        Room(String type, int beds, int sizeSqft, double pricePerNight, int available) {
            this.type = type;
            this.beds = beds;
            this.sizeSqft = sizeSqft;
            this.pricePerNight = pricePerNight;
            this.available = available;
        }

        void printDetails() {
            System.out.println(type + ":");
            System.out.println("Beds: " + beds);
            System.out.println("Size: " + sizeSqft + " sqft");
            System.out.println("Price per night: " + pricePerNight);
            System.out.println("Available: " + available);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Hotel Room Initialization\n");

        Room singleRoom = new Room("Single Room", 1, 250, 1500.0, 5);
        Room doubleRoom = new Room("Double Room", 2, 400, 2500.0, 3);
        Room suiteRoom = new Room("Suite Room", 3, 750, 5000.0, 2);

        singleRoom.printDetails();
        doubleRoom.printDetails();
        suiteRoom.printDetails();
    }
}