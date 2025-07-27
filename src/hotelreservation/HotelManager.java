package hotelreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelManager {

    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;
    private Scanner scanner;

    public HotelManager(ArrayList<Room> rooms, ArrayList<Reservation> reservations, Scanner scanner) {
        this.rooms = rooms;
        this.reservations = reservations;
        this.scanner = scanner;
    }

    public void addRoom() {
        System.out.println("Otaq nömrəsi: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Otaq tipi (Single/Double): ");
        String type = scanner.nextLine();
        System.out.println("Qiymet: ");
        double price = scanner.nextDouble();

        Room room = new Room(number, type, price, false);
        rooms.add(room);
        System.out.println("Otaq əlavə olundu. \n ");


    }

    public void showAvailableRooms() {
        System.out.println("Boş otaqlar:");
        for (Room room : rooms) {
            if (!room.isBooked(true)) {
                System.out.println(room);
            }
        }
    }

    public void makeReservation() {
        scanner.nextLine();
        System.out.println("Müştəri adı: ");
        String name = scanner.nextLine();

        showAvailableRooms();

        System.out.println("Rezerv etmək istədiyin otaq nömrəsi: ");
        int roomNumber = scanner.nextInt();

        Room selectedRoom = null;
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isBooked(true)) {
                selectedRoom = room;
                break;
            }
        }

        if (selectedRoom == null) {
            System.out.println("Bu otaq mövcud deyil və ya artıq rezerv olunub.");
            return;
        }
        scanner.nextLine();
        System.out.println("Gəliş tarixi (DD-MM-YYYY): ");
        String checkIn = scanner.nextLine();
        System.out.println("Gediş tarixi (DD-MM-YYYY): ");
        String checkOut = scanner.nextLine();

        Reservation reservation = new Reservation(name,selectedRoom,checkIn,checkOut);
        reservations.add(reservation);
        selectedRoom.isBooked(true);
        System.out.println("Rezervasiya tamamlandı!\n");
    }

    public void showReservations(){
        System.out.println("Rezervasiyalar: ");
        for (Reservation reservation : reservations){
            System.out.println(reservation);
        }
    }


}
