package oopprinciples.electronicdevices;

public class Laptop extends ElectronicDevice {
    boolean haveCd;
    boolean hasNumPad;

    public Laptop(String brand, String model, String color, int price, boolean haveCd, boolean hasNumPad) {
        super(brand, model, color, price);
        this.haveCd = haveCd;
        this.hasNumPad = hasNumPad;
    }

    public Laptop() {
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setHaveCd(boolean haveCd) {
        this.haveCd = haveCd;
    }

    public void setHasNumPad(boolean hasNumPad) {
        this.hasNumPad = hasNumPad;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public boolean getHaveCd() {
        return haveCd;
    }

    public boolean getHasNumPad() {
        return hasNumPad;
    }

    @Override
    public String isUnlocked() {
        return "The laptop " + brand + " " + model + " is unlocked";

    }
}
