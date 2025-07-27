package hotelreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();
        ArrayList<Reservation> reservations = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        HotelManager hotelManager = new HotelManager(rooms, reservations, scanner);

        int Choice;
        do {
            System.out.println("=== OTEL REZERVASİYA SİSTEMİ ===");
            System.out.println("1. Otaq əlavə et");
            System.out.println("2. Boş otaqlara bax");
            System.out.println("3. Rezervasiya et");
            System.out.println("4. Rezervasiyalara bax");
            System.out.println("0. Çıxış");
            System.out.print("Seçiminiz: ");
            Choice = scanner.nextInt();

            switch (Choice) {
                case 1:
                    hotelManager.addRoom();
                    break;
                case 2:
                    hotelManager.showAvailableRooms();
                    break;
                case 3:
                    hotelManager.makeReservation();
                    break;
                case 4:
                    hotelManager.showReservations();
                    break;
                case 0:
                    System.out.println("Çıxılır...");
                    break;
                default:
                    System.out.println("Yanlış seçim. Zəhmət olmasa 0–4 arası bir rəqəm daxil edin.");

            }
        } while (Choice != 0);

    }
}
