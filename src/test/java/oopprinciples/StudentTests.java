package oopprinciples;

import oopprinciples.person.PersonClass;
import oopprinciples.person.StudentClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTests {
    PersonClass personClass1 = new PersonClass();
    PersonClass personClass2 = new PersonClass("Muhamed", "Mavmudoski", 25, "male");

    StudentClass studentClass1 = new StudentClass();
    StudentClass studentClass2 = new StudentClass("Elena", "Ilievska", 26, "female", 221);


    @Test
    public void personClassTests() {
        personClass1.setName("Stefan");
        personClass1.setSurname("Milanovski");
        personClass1.setAge(25);
        personClass1.setGender("male");

        studentClass1.setName("Nikolina");
        studentClass1.setSurname("Stefanovska");
        studentClass1.setAge(24);
        studentClass1.setGender("female");
        studentClass1.setStudentId(222);


        assertEquals("Muhamed",personClass2.getName());
        assertEquals("Stefan",personClass1.getName());
        assertEquals("Elena",studentClass2.getName());
        assertEquals("Nikolina",studentClass1.getName());
        assertEquals(222,studentClass1.getStudentId());
        assertEquals("male",personClass1.getGender());
        assertEquals("Milanovski",personClass1.getSurname());
        assertEquals(221,studentClass2.getStudentId());
    }

}
