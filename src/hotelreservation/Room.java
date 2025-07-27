package hotelreservation;

public class Room {

    private int roomNumber;
    private String type;
    private double price;
    private boolean isBooked;

    public Room(int roomNumber, String type, double price, boolean isBooked) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.isBooked = isBooked;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBooked(boolean b) {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return  "Otaq #" + roomNumber + " | Tip: " + type + " | Qiymət: " + price + " | Rezervasiya: " + (isBooked ? "Bəli" : "Xeyr");
    }
}
