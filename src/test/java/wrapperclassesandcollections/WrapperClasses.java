package wrapperclassesandcollections;

import org.junit.Test;

import static org.junit.Assert.*;

public class WrapperClasses {
    @Test
    public void wrapperClassesObjects() {

        int intVar = 10;
        int intVar1 = 10;
        char charVar = 'a';

        Integer intAsObject = 10;
        Integer intAsObject1 = 20;
        Integer intAsObject2 = 10;

        Long longAsObject;
        Short shortAsObject;
        Byte byteAsObject;
        Double doubleAsObject;
        Float floatAsObject;
        Character charAsObject = 'a';
        Character charAsObject1 = 'A';
        Character charAsObject2 = '5';
        Character charAsObject3 = ' ';
        Boolean boolAsObject;
        Boolean boolAsObject1;
        Boolean boolAsObject2;

        String academy = "Creative Hub";
        String string1 = "Apple";
        String string2 = "Apple";
        String string3 = "Apple";
        String num1 = "10";
        String num2 = "20";

        assertEquals('a', academy.charAt(3));

        System.out.println(num1 + num2);
        System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));

        assertEquals("1020", num1 + num2);
        assertEquals(30, Integer.parseInt(num1) + Integer.parseInt(num2));

        assertTrue(intVar == intVar1);
        System.out.println("Comparasion of 2 integer object: " + intAsObject.compareTo(intAsObject1));
        System.out.println("Comparasion of 2 integer object: " + intAsObject.compareTo(intAsObject2));
        System.out.println("Comparasion of 2 integer object: " + intAsObject1.compareTo(intAsObject));

        assertEquals(-1, intAsObject.compareTo(intAsObject1));
        assertEquals(0, intAsObject.compareTo(intAsObject2));
        assertEquals(1, intAsObject1.compareTo(intAsObject));

        System.out.println("Comparasion of 2 Strings" + academy.compareTo(string1));
        System.out.println("Comparasion of 2 Strings" + string1.compareTo(string1));
        System.out.println("Comparasion of 2 Strings" + string1.compareTo(academy));


        assertEquals(2, academy.compareTo(string1));
        assertEquals(0, string1.compareTo(string1));
        assertEquals(-2, string1.compareTo(academy));

        assertTrue(Character.isLowerCase(charAsObject));
        assertFalse(Character.isUpperCase(charAsObject));

        assertTrue(Character.isUpperCase(charAsObject1));
        assertFalse(Character.isLowerCase(charAsObject1));

        assertTrue(Character.isDigit(charAsObject2));
        assertFalse(Character.isDigit(charAsObject1));

        assertTrue(Character.isLetter(charAsObject));
        assertTrue(Character.isLetter(charAsObject1));
        assertFalse(Character.isLetter(charAsObject2));

        assertTrue(Character.isSpaceChar(charAsObject3));
        assertFalse(Character.isSpaceChar(charAsObject2));

        assertTrue(Character.isSpaceChar(academy.charAt(8)));

        String boolFalse = "false";
        String boolTrue = "true";
        String randomBool = "trueee";

        boolAsObject = Boolean.valueOf(boolFalse);
        boolAsObject1 = Boolean.valueOf(boolTrue);
        boolAsObject2 = Boolean.valueOf(randomBool);

        System.out.println(boolAsObject);
        System.out.println(boolAsObject1);
        System.out.println("Remember if its not T R U E it will always be  --> " + boolAsObject2);

        assertFalse(boolAsObject);
        assertTrue(boolAsObject1);


    }
}
