package oopprinciples;

import oopprinciples.animal.Bird;
import oopprinciples.animal.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTests {
Bird bird1 = new Bird(10,"suki","yellow","nimf parrot","rounded");
Bird bird2 = new Bird();

Dog dog = new Dog(7,"black","sharko","sharplaninec",true);
Dog dog2 = new Dog();


@Test
    public void testBirds(){
    assertEquals(10,bird1.getAge());
    assertEquals("yellow",bird1.getColor());
    assertEquals("suki",bird1.getName());
    assertEquals("nimf parrot",bird1.getType());
    assertEquals("rounded",bird1.getBeakType());

    bird2.setAge(5);
    bird2.setColor("blue");
    bird2.setName("palce");
    bird2.setType("budgerigar");
    bird2.setBeakType("straight");

    assertEquals(5,bird2.getAge());
    assertEquals("blue",bird2.getColor());
    assertEquals("palce",bird2.getName());
    assertEquals("budgerigar",bird2.getType());
    assertEquals("straight",bird2.getBeakType());
    }

    @Test
    public void testDogs(){
    assertEquals(7,dog.getAge());
    assertEquals("black",dog.getColor());
    assertEquals("sharko",dog.getName());
    assertEquals("sharplaninec",dog.getType());
    assertEquals(true,dog.getIsTrained());

    dog2.setAge(5);
    dog2.setColor("brown");
    dog2.setName("pekji");
    dog2.setType("chiwawa");
    dog2.setIsTrained(false);

        assertEquals(5,dog2.getAge());
        assertEquals("brown",dog2.getColor());
        assertEquals("pekji",dog2.getName());
        assertEquals("chiwawa",dog2.getType());
        assertEquals(false,dog2.getIsTrained());
    }
}
