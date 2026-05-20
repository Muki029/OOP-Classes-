package oopprinciples.electronicdevices;

public class Tablets extends ElectronicDevice {
    boolean hasSimCard;

    public Tablets(String brand, String model, String color, int price, boolean HasSimCard) {
        super(brand, model, color, price);
        this.hasSimCard = HasSimCard;
    }

    public Tablets() {
    }

    public void setHasSimCard(boolean hasSimCard) {
        this.hasSimCard = hasSimCard;
    }

    public boolean getHasSimCard() {
        return hasSimCard;
    }

    @Override
    public String isUnlocked() {
        return "The tablet " + brand +" "+ model + " is unlocked";
    }
}
