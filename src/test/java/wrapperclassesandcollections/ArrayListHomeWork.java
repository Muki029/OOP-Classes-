package wrapperclassesandcollections;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListHomeWork {
    //1
    String newString = "Muhamed";

    //2
    String num1 = "10";
    String num2 = "20";

    //3
    String countSpaces = "Crative Hub Software Testing Academy";

    //4
    public int countTrueValues(String s1, String s2, String s3) {
        ArrayList<String> threeStrings = new ArrayList<>();
        threeStrings.add(s1);
        threeStrings.add(s2);
        threeStrings.add(s3);

        int counter = 0;

        for (int i = 0; i < threeStrings.size(); i++) {
            if (Boolean.valueOf(threeStrings.get(i))) {
                counter++;
            }
        }
        return counter;
    }
    //5
    public ArrayList<Integer> returnEvenNumbers(int num1, int num2, int num3, int num4, int num5) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
        return numbers;
    
    }


    @Test
    public void firstTask() {
        assertEquals('e', newString.charAt(5));
    }

    @Test
    public void secondTask() {
        assertEquals(30, Integer.parseInt(num1) + Integer.parseInt(num2));
    }

    @Test
    public void thirdTask() {
        int spaceBars = 0;
        for (int i = 0; i < countSpaces.length(); i++) {
            if (countSpaces.charAt(i) == ' ') {
                spaceBars++;
            }

        }
        System.out.println("In the previous text we had: " + spaceBars + " space bars");
        assertEquals(4, spaceBars);
    }

    @Test
    public void fourthTask() {
        assertEquals(1, countTrueValues("true", "truee", "mrue"));

    }

    @Test
    public void fifthTask() {
        ArrayList<Integer> result = returnEvenNumbers(1, 2, 3, 4, 5);
        assertTrue(result.contains(1));
        assertTrue(result.contains(3));
        assertTrue(result.contains(5));
        assertFalse(result.contains(2));
        assertFalse(result.contains(4));
    }


}
