package oopprinciples.person;

public class PersonClass {
    String name;
    String surname;
    int age;
    String gender;

    public PersonClass(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public PersonClass(){}

    public void setName(String name) {
        if(name.length() > 15){
            throw new IllegalArgumentException("The name should contain maximum 15 letters");
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
