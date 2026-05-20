package oopprinciples.buildings;

public class House extends Building {
    int yardSquareMeters;

    public House(int squareMeters, int numberOfRooms, int numberOfTerraces, boolean hasAlarm,int yardSquareMeters) {
        super(squareMeters, numberOfRooms, numberOfTerraces, hasAlarm);
        this.yardSquareMeters = yardSquareMeters;
    }

    public House() {

    }

    public void setYardSquareMeters(int yardSquareMeters) {
        this.yardSquareMeters = yardSquareMeters;
    }

    public int getYardSquareMeters() {
        return yardSquareMeters;
    }
    @Override
    public String buildingProcessTime() {
        return "Building process time of the house is estimated to be around 8 months";
    }
}
