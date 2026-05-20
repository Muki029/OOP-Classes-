package oopprinciples.buildings;

public class Building {
    int squareMeters;
    int numberOfRooms;
    int numberOfTerraces;
    boolean hasAlarm;

    public Building(int squareMeters,int numberOfRooms,int numberOfTerraces,boolean hasAlarm){
        this.squareMeters = squareMeters;
        this.numberOfRooms = numberOfRooms;
        this.numberOfTerraces = numberOfTerraces;
        this.hasAlarm = hasAlarm;
    }

    public Building() {}

    public void setSquareMeters(int squareMeters) {
        if(squareMeters > 950){
            throw new IllegalArgumentException("The building cannont exceed 950qm as is the limit from the City order");
        }
        this.squareMeters = squareMeters;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setNumberOfTerraces(int numberOfTerraces) {
        this.numberOfTerraces = numberOfTerraces;
    }

    public void setHasAlarm(boolean hasAlarm) {
        this.hasAlarm = hasAlarm;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfTerraces() {
        return numberOfTerraces;
    }
    public boolean getHasAlarm(){
        return hasAlarm;
    }

    public String buildingProcessTime(){
            return "Building Process Time";
    }

}
