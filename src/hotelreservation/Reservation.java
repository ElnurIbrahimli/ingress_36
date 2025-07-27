package hotelreservation;

public class Reservation {

    private String customerName;
    private Room room;
    private String checkInDate;
    private String CheckOutDate;

    public Reservation(String customerName, Room room, String checkInDate, String checkOutDate) {
        this.customerName = customerName;
        this.room = room;
        this.checkInDate = checkInDate;
        CheckOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return "Rezervasiya{" +
                "Rezervasiya : '" + customerName + '\'' +
                ", Otaq #" + room +
                ", Gəliş :'" + checkInDate + '\'' +
                ", Gediş :'" + CheckOutDate + '\'' +
                '}';
    }
}
