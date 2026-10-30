
public class TestMiniParking{
   
public static int[] TotalSlot = new int[20]{
public static int[] Empty = new int [0]{
public static int[] Occupied = new int [1]{

   public static void displayMenu() {
        System.out.println("\n===== MINI PARKING =====");
        System.out.println("1. Park a car automatically");
        System.out.println("2. Park a car in a specific slot");
        System.out.println("3. Remove a car");
        System.out.println("4. Display parking status");
        System.out.println("5. Exit");
    }

    public static void parkAutomatically() {

        for (int index = 0; index < Total_Slots; index++) {

            if (parkingLot[index] == Empty) {

                parkingLot[index] = Occupied;

                System.out.println(
                    "Car parked successfully in slot " + (index + 1)
                );

                return;
            }
        }

        System.out.println("Parking lot is full.");
    }

    public static void parkInSpecificSlot(int slotNumber) {

        if (!isValidSlot(slotNumber)) {
            System.out.println("Invalid slot number. Choose 1-20.");
            return;
        }

        int index = slotNumber - 1;

        if (parkingLot[index] == OCCUPIED) {
            System.out.println("This slot is already occupied.");
            return;
        }

        parkingLot[index] = OCCUPIED;

        System.out.println(
            "Car parked successfully in slot " + slotNumber
        );
    }

    public static void removeCar(int slotNumber) {

        if (!isValidSlot(slotNumber)) {
            System.out.println("Invalid slot number. Choose 1-20.");
            return;
        }

        int index = slotNumber - 1;

        if (parkingLot[index] == EMPTY) {
            System.out.println("This slot is already empty.");
            return;
        }

        parkingLot[index] = EMPTY;

        System.out.println(
            "Car removed successfully from slot " + slotNumber
        );
    }

    public static boolean isValidSlot(int slotNumber) {
        return slotNumber >= 1 && slotNumber <= TOTAL_SLOTS;
    }

    public static void displayParkingStatus() {

        int occupiedSlots = 0;
        int availableSlots = 0;

        System.out.println("\n===== PARKING STATUS =====");

        for (int index = 0; index < TOTAL_SLOTS; index++) {

            System.out.println(
                "Slot " + (index + 1) + ": " + parkingLot[index]
            );

            if (parkingLot[index] == OCCUPIED) {
                occupiedSlots++;
            } else {
                availableSlots++;
            }
        }

        System.out.println("--------------------------");
        System.out.println("Occupied slots: " + occupiedSlots);
        System.out.println("Available slots: " + availableSlots);
        System.out.println("Total slots: " + TOTAL_SLOTS);
        }
       }
      }
    }
  }


                    

  
    
    
  
    
    
    
    
    
    

       


           
    
     
    
  
    
    

     
    

