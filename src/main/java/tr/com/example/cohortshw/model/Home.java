package tr.com.example.cohortshw.model;

public class Home {

    private String type;
    private int price;
    private int squareMeters;
    private int numberOfRoom;
    private int numberOfHall;

    public Home(String type, int price, int squareMeters, int numberOfRoom, int numberOfHall) {
        this.type = type;
        this.price = price;
        this.squareMeters = squareMeters;
        this.numberOfRoom = numberOfRoom;
        this.numberOfHall = numberOfHall;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfHall() {
        return numberOfHall;
    }

    public void setNumberOfHall(int numberOfHall) {
        this.numberOfHall = numberOfHall;
    }
}
