package oopprinciples.inhabitatPlace;

public abstract class InhabitatPlace {

    String name;
    int population;
    String major;


    public InhabitatPlace(String name, int population, String major) {
        this.name = name;
        this.population = population;
        this.major = major;
    }

    public InhabitatPlace() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getMajor() {
        return major;
    }

    public String drinkMilk() {
        return "People from the inhabited place drink milk";
    }
}
