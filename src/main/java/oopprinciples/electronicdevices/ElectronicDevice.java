package oopprinciples.electronicdevices;

public class ElectronicDevice {
    String brand;
    String model;
    String color;
    int price;

    public ElectronicDevice(String brand,String model,String color,int price){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }
    public ElectronicDevice(){ }

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

    public String getBrand(){
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
    public String isUnlocked(){
        System.out.println("The " + brand + model + "is unlocked" );
        return isUnlocked();
    }
}
