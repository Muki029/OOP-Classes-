package oopprinciples;

import oopprinciples.inhabitatPlace.City;
import oopprinciples.inhabitatPlace.Village;
import org.junit.Test;

import static org.junit.Assert.*;

public class InhabitatPlaceTests {
    City city1 = new City();
    City city2 = new City("Bitola", 86528, "Toni K", false, 3);

    Village village1 = new Village();
    Village village2 = new Village("Nikiforovo", 59, "Stanko S", true);

    @Test
    public void cityTest() {
        city1.setName("Skopje");
        city1.setPopulation(611000);
        city1.setMajor("Orce G");
        city1.setIsCapitalCity(true);
        city1.setNumberOfBoulevars(10);

        assertEquals("Skopje", city1.getName());
        assertEquals(611000, city1.getPopulation());
        assertEquals("Orce G", city1.getMajor());
        assertTrue(city1.getIsCapitalCity());
        assertEquals(10, city1.getNumberOfBoulevars());
        assertEquals("Citizens from Skopje mostly drink factory milk", city1.drinkMilk());

        assertEquals("Bitola", city2.getName());
        assertEquals(86528, city2.getPopulation());
        assertEquals("Toni K", city2.getMajor());
        assertFalse(city2.getIsCapitalCity());
        assertEquals(3, city2.getNumberOfBoulevars());
        assertEquals("Citizens from Bitola mostly drink factory milk", city2.drinkMilk());


    }

    @Test
    public void villageTest() {
        village1.setName("Mariovo");
        village1.setMajor("Itar Pejo");
        village1.setPopulation(940);
        village1.setHasTradition(true);

        assertEquals("Mariovo", village1.getName());
        assertEquals("Itar Pejo", village1.getMajor());
        assertEquals(940, village1.getPopulation());
        assertTrue(village1.getHasTradition());
        assertEquals("Citizens from Mariovo drink homemade milk", village1.drinkMilk());


        assertEquals("Nikiforovo", village2.getName());
        assertEquals("Stanko S", village2.getMajor());
        assertEquals(59, village2.getPopulation());
        assertTrue(village2.getHasTradition());
        assertEquals("Citizens from Nikiforovo drink homemade milk", village2.drinkMilk());
    }
}
