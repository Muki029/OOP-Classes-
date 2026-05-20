package oopprinciples.person;

public class StudentClass extends PersonClass {
    int studentId;

    public StudentClass(String name, String surname, int age, String gender,int studentId){
        super(name, surname, age, gender);
        this.studentId = studentId;
    }
    public StudentClass(){}

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}
