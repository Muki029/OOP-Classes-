package oopprinciples.inhabitatPlace;

public class City extends InhabitatPlace {

    boolean isCapitalCity;
    int numberOfBoulevars;

    public City(String name, int population, String major, boolean isCapitalCity, int numberOfBoulevars) {

        super(name, population, major);
        this.isCapitalCity = isCapitalCity;
        this.numberOfBoulevars = numberOfBoulevars;
    }

    public City() {

    }

    public void setIsCapitalCity(boolean isCapitalCity) {
        this.isCapitalCity = isCapitalCity;
    }

    public void setNumberOfBoulevars(int numberOfBoulevars) {
        this.numberOfBoulevars = numberOfBoulevars;
    }

    public boolean getIsCapitalCity() {
        return isCapitalCity;
    }

    public int getNumberOfBoulevars() {
        return numberOfBoulevars;
    }


    @Override
    public String drinkMilk() {
        return "Citizens from " + name + " mostly drink factory milk";
    }
}
