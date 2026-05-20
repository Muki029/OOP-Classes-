package oopprinciples.buildings;

public class Apartment extends Building {
    int floor;

    public Apartment(int squareMeters, int numberOfRooms, int numberOfTerraces, boolean hasAlarm, int floor) {
        super(squareMeters, numberOfRooms, numberOfTerraces, hasAlarm);
        this.floor = floor;

    }

    public Apartment() {
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String buildingProcessTime() {
        return "Building process time of the house is estimated to be around 1 and a half years";
    }

}
