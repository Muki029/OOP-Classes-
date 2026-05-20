package oopprinciples.buildings;

public class Pools extends Building{
    double depth;
    boolean isIndoor;
    String waterType;

    public Pools(int squareMeters,double depth,boolean isIndoor,String waterType){
        super(squareMeters, 0, 0, false);
        this.depth = depth;
        this.isIndoor = isIndoor;
        this.waterType = waterType;
    }

    public Pools() {}

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public double getDepth() {
        return depth;
    }

    public boolean getIndoor() {
        return isIndoor;
    }
    public String getWaterType() {
        return waterType;
    }
    @Override
    public String buildingProcessTime(){
        return "Building process time of the pool is estimated to be around 4 months";
    }
}
