

let Total slots = 20;
let Empty = 0;
let Occupied = 1;

 

         do {
            displayMenu();

            System.out.print("Enter your choice: ");

            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Enter a number.");
                input.next();
                System.out.print("Enter your choice: ");
            }

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    parkAutomatically();
                    displayParkingStatus();
                    break;

                case 2:
                    System.out.print("Enter slot number (1-20): ");

                    if (input.hasNextInt()) {
                        int slotNumber = input.nextInt();
                        parkInSpecificSlot(slotNumber);
                    } else {
                        System.out.println("Invalid input. Enter a number.");
                        input.next();
                    }

                    displayParkingStatus();
                    break;

                case 3:
                    System.out.print("Enter slot number to leave (1-20): ");

                    if (input.hasNextInt()) {
                        int slotNumber = input.nextInt();
                        removeCar(slotNumber);
                    } else {
                        System.out.println("Invalid input. Enter a number.");
                        input.next();
                    }

                    displayParkingStatus();
                    break;

                case 4:
                    displayParkingStatus();
                    break;

                case 5:
                    System.out.println(
                        "Thank you for using the Mini Parking System."
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice. Please select 1-5."
                    );
                    displayParkingStatus();
            }

        } while (choice != 5);

        input.close();
    }

    private static void displayMenu() {
        System.out.println("\n===== MINI PARKING SYSTEM =====");
        System.out.println("1. Park a car automatically");
        System.out.println("2. Park a car in a specific slot");
        System.out.println("3. Remove a car");
        System.out.println("4. Display parking status");
        System.out.println("5. Exit");
    }

    private static void parkAutomatically() {

        for (int index = 0; index < TOTAL_SLOTS; index++) {

            if (parkingLot[index] == EMPTY) {

                parkingLot[index] = OCCUPIED;

                System.out.println(
                    "Car parked successfully in slot " + (index + 1)
                );

                return;
            }
        }

        System.out.println("Parking lot is full.");
    }

    private static void parkInSpecificSlot(int slotNumber) {

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

    private static void removeCar(int slotNumber) {

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

    private static boolean isValidSlot(int slotNumber) {
        return slotNumber >= 1 && slotNumber <= TOTAL_SLOTS;
    }

    private static void displayParkingStatus() {

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
