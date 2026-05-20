import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class Hello {
    @Test
    public void PrinthelloWorld() {
        System.out.println("Hello World");
    }

    @Test
    public void forLoopTest() {
        int[] arrays = {5, 3, 4, 2, 5, 1, 4, 3};
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] >= 4) {
                System.out.println(arrays[i]);
            }
        }
// EVEN NUMBERS SAME ARRAY
        int evenCount = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                evenCount++;
                System.out.println(arrays[i] + " is an even number");
            }
        }
        System.out.println("There Are " + evenCount + " even numbers in the array");
    }

    @Test
    public void numberRepeat() {
        int[] numbers = {1, 2, 3, 4, 2, 2, 4, 5};
        int repeatedNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2) {
                repeatedNumber++;
            }
        }
        System.out.println("number 2 is repeating " + repeatedNumber + " times");

        assertEquals(3, repeatedNumber);
    }

    @Test
    public void claudeNewArrayTest() {
        //WE NEED TO HAVE MORE THAN 3 LETTERS IN THE NAME IN ORDER TO PRINT IT
        ArrayList<String> newArray = new ArrayList<>();
        newArray.add("Ana");
        newArray.add("Bojan");
        newArray.add("Muhamed");
        newArray.add("Romeo");
        newArray.add("Snezhe");
        newArray.add("Ace");


        String name = newArray.get(2);
        char letter = name.charAt(2);

        for (int i = 0; i < newArray.size(); i++) {
            if (newArray.get(i).length() > 3) {
                System.out.println(newArray.get(i));
            }
        }
        assertEquals("Ana", newArray.get(0));
        assertEquals("Muhamed", newArray.get(2));
        assertTrue(Character.isLetter(letter));
        assertEquals('h',letter);


    }


    @Test
    public void ArrayList() {
        String wrapper = "Kako si deneska";
        ArrayList<String> onlyTest = new ArrayList<>();
        onlyTest.add("Hello");
        onlyTest.add("Bye");
        onlyTest.add("GoodBye");

        for (int i = 0; i < onlyTest.size(); i++) {
            System.out.println(onlyTest.get(i));
            assertEquals("Hello", onlyTest.get(0));
        }
    }

    @Test
    public void parsingNumbersAndCharachtersStringsAndLoopsTest() {

        Character char1 = 'K';
        Character char2 = 'S';

        String newString = "Kako si deneska";
        int spacebars = 0;

        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) == ' ') {
                spacebars++;

            }
        }
        System.out.println("here we have " + spacebars + " SpaceBars");


        assertTrue(Character.isLetter(char1));
        assertTrue(Character.isUpperCase(char1));
        assertFalse(Character.isDigit(char1));

        assertFalse(Character.isSpaceChar(char2));
        assertTrue(Character.isLetter(char2));
        assertTrue(Character.isUpperCase(char2));

        assertEquals('K', newString.charAt(0));
        assertTrue(Character.isSpaceChar(newString.charAt(4)));

        Integer broj1 = 1;
        Integer broj2 = 2;
        System.out.println("Mozhe i kako obicen Integer " + (broj1 + broj2));

        String strBroj1 = "10";
        String strBroj2 = "10";

        System.out.println("Konkatinacija na broevi odnosno String -> " + strBroj1 + strBroj2);

        System.out.println("-------------------------------------------");

        System.out.println("Parsiranje na Stringovi vo Integeri --> " + (Integer.parseInt(strBroj1) + Integer.parseInt(strBroj2)));


    }
}


