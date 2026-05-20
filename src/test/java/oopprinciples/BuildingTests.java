package oopprinciples;

import oopprinciples.buildings.Apartment;
import oopprinciples.buildings.House;
import oopprinciples.buildings.Pools;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuildingTests {
    Apartment apartment1 = new Apartment();
    Apartment apartment2 = new Apartment(100, 4, 2, true, 1);

    House house1 = new House();
    House house2 = new House(400, 7, 3, true, 200);

    Pools pool1 = new Pools();
    Pools pool2 = new Pools(20,3.45,false,"Salt");
    @Test
    public void apartmentTest() {
        apartment1.setSquareMeters(50);
        apartment1.setNumberOfRooms(2);
        apartment1.setNumberOfTerraces(1);
        apartment1.setHasAlarm(true);
        apartment1.setFloor(3);

        assertEquals(100, apartment2.getSquareMeters());
        assertTrue(apartment2.getHasAlarm());
        assertEquals(1, apartment2.getFloor());
        assertEquals(4, apartment2.getNumberOfRooms());
        assertEquals(2, apartment2.getNumberOfTerraces());

        assertEquals(50, apartment1.getSquareMeters());
        assertEquals(3, apartment1.getFloor());
        assertEquals(2, apartment1.getNumberOfRooms());
        assertEquals(1, apartment1.getNumberOfTerraces());

        assertEquals("Building process time of the house is estimated to be around 1 and a half years", apartment1.buildingProcessTime());
    }

    @Test
    public void houseTest() {
        house1.setSquareMeters(130);
        house1.setNumberOfRooms(3);
        house1.setNumberOfTerraces(1);
        house1.setHasAlarm(false);
        house1.setYardSquareMeters(65);


        assertEquals(130, house1.getSquareMeters());
        assertFalse(house1.getHasAlarm());
        assertEquals(3, house1.getNumberOfRooms());
        assertEquals(1, house1.getNumberOfTerraces());
        assertEquals(65,house1.getYardSquareMeters());


        assertEquals(400, house2.getSquareMeters());
        assertTrue(house2.getHasAlarm());
        assertEquals(7,house2.getNumberOfRooms());
        assertEquals(200, house2.getYardSquareMeters());
        assertEquals(3, house2.getNumberOfTerraces());
        assertEquals("Building process time of the house is estimated to be around 8 months", house1.buildingProcessTime());

    }

    @Test
    public void poolTest(){
        pool1.setSquareMeters(10);
        pool1.setDepth(2.50);
        pool1.setIndoor(true);
        pool1.setWaterType("Sweet");

        assertEquals(10,pool1.getSquareMeters());
        assertEquals(2.50,pool1.getDepth(),0);
        assertTrue(pool1.getIndoor());
        assertEquals("Sweet",pool1.getWaterType());
        assertEquals("Building process time of the pool is estimated to be around 4 months",pool1.buildingProcessTime());

        assertEquals(20,pool2.getSquareMeters());
        assertEquals(3.45,pool2.getDepth(),0);
        assertFalse(pool2.getIndoor());
        assertEquals("Salt",pool2.getWaterType());
        assertEquals("Building process time of the pool is estimated to be around 4 months",pool2.buildingProcessTime());
    }
}
