package oopprinciples;

import oopprinciples.electronicdevices.Laptop;
import oopprinciples.electronicdevices.Smartphone;
import oopprinciples.electronicdevices.Tablets;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectonicDeviceTests {
    Smartphone smartphone1 = new Smartphone();
    Smartphone smartphone2 = new Smartphone("Samsung", "Galaxy S26", "Black", 800, 2);

    Laptop laptop1 = new Laptop();
    Laptop laptop2 = new Laptop("Apple", "Macbook Air", "Silver", 500, false, false);

    Tablets tablet1 = new Tablets();
    Tablets tablet2 = new Tablets("Samsung", "Galaxy Tab", "Gray", 320, false);


    @Test

    public void smartPhoneTest() {
        smartphone1.setBrand("Apple");
        smartphone1.setModel("Iphone 14 Pro");
        smartphone1.setColor("White");
        smartphone1.setPrice(450);
        smartphone1.setHowManySims(2);

        assertEquals("Apple", smartphone1.getBrand());
        assertEquals("Samsung", smartphone2.getBrand());
        assertEquals("Black", smartphone2.getColor());
        assertEquals("Iphone 14 Pro", smartphone1.getModel());
        assertEquals(800, smartphone2.getPrice());
        assertEquals(2, smartphone1.getHowManySims());
    }

    @Test
    public void laptopTest() {
        laptop1.setBrand("Asus");
        laptop1.setModel("Tuf");
        laptop1.setColor("Black");
        laptop1.setPrice(740);
        laptop1.setHaveCd(true);
        laptop1.setHasNumPad(true);

        assertEquals("Asus", laptop1.getBrand());
        assertTrue(laptop1.getHasNumPad());
        assertEquals("Tuf", laptop1.getModel());
        assertTrue(laptop1.getHaveCd());
        assertEquals("Black", laptop1.getColor());


        assertEquals("Macbook Air", laptop2.getModel());
        assertEquals(500, laptop2.getPrice());
        assertEquals("Silver", laptop2.getColor());
        assertFalse(laptop2.getHaveCd());
        assertEquals("The laptop Apple Macbook Air is unlocked", laptop2.isUnlocked());
    }

    @Test
    public void tabletTest() {
        tablet1.setBrand("Apple");
        tablet1.setModel("Ipad 10");
        tablet1.setColor("Blue");
        tablet1.setPrice(625);
        tablet1.setHasSimCard(true);

        assertEquals("Apple", tablet1.getBrand());
        assertEquals("Ipad 10", tablet1.getModel());
        assertEquals("Blue", tablet1.getColor());
        assertEquals(625, tablet1.getPrice());
        assertTrue(tablet1.getHasSimCard());
        assertEquals("The tablet Apple Ipad 10 is unlocked",tablet1.isUnlocked());

        assertEquals("Samsung", tablet2.getBrand());
        assertEquals("Galaxy Tab", tablet2.getModel());
        assertEquals("Gray", tablet2.getColor());
        assertEquals(320, tablet2.getPrice());
        assertFalse(tablet2.getHasSimCard());
        assertEquals("The tablet Samsung Galaxy Tab is unlocked",tablet2.isUnlocked());
    }

}
