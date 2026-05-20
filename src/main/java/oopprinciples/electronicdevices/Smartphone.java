package oopprinciples.electronicdevices;

public class Smartphone extends ElectronicDevice {
    int howManySims;

    public Smartphone(String brand, String model, String color, int price, int howManySims) {
        super(brand, model, color, price);
        this.howManySims = howManySims;
    }

    public Smartphone() {
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setHowManySims(int howManySims) {
        this.howManySims = howManySims;
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

    public int getHowManySims() {
        return howManySims;
    }

    @Override
    public String isUnlocked() {
        return "The smartphone " + brand + model + " is unlocked";

    }
}