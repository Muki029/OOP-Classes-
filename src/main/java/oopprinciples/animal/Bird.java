package oopprinciples.animal;

public class Bird extends Animal{
    String beakType;

    public Bird(int age,String name , String color,String type, String beakType){
        super(age, color, name, type);
        this.beakType = beakType;
    }

    public Bird(){

    }

    public void setBeakType(String beakType){
        this.beakType = beakType;
    }
    public String getBeakType(){
        return beakType;
    }


}
