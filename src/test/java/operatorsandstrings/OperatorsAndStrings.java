package operatorsandstrings;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.*;

public class OperatorsAndStrings {

    int additionOfTwoNumberWithParams(int x, int y) {
        return x + y;

    }

    int substractionOfTwoNumberWithParams(int x, int y) {
        return x - y;

    }

    int multiplicationOfTwoNumberWithParams(int x, int y) {
        return x * y;

    }

    int divisionOfTwoNumberWithParams(int x, int y) {

        return x / y;
    }

        boolean boolMethod() {
            return 10 == 10;
        }




        @Test
        public void incrementDecrementTest () {
            int x = 10;


            System.out.println("Before increment: " + x);
            x++; // 10+1

            System.out.println("After increment " + x);

            x--; //11 - 1

            assertEquals(10, x); //10

            x *= 10;
            assertEquals(100, x); //10*10

            x -= 90;
            assertEquals(10, x); //100-90 = 10


            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }

        @Test
        public void comparasionOperatorsTest () {


            int num1 = 10;
            int num2 = 10;
            int num3 = 20;

            assertTrue(num1 == num2);
            assertTrue(num1 != num3);

            assertTrue(num3 > num1);
            assertTrue(num1 < num3);

            assertTrue(num1 >= num2);
            assertTrue(num1 <= num3);
            assertTrue(num1 == num2);

            //False
            assertFalse(num1 == num3);
        }

        @Test  //if operator kako " ako ova e taka napravi vaka"....//  && = mora isti .. || ova e ILI operator za 2 razlicni
        public void logicalOperatorsTest () {
            int num1 = 10;
            int num2 = 10;
            int num3 = 20;


            if (num1 == 10 && num2 == 10) {
                System.out.println("This text will be printed if num1 AND num2 vars have value 10 ");
            }

            if (num1 == 10 || num2 == 12) {
                System.out.println("This text will be printed if num1 OR num2 vars have value 10");
            }
            if (num1 != 20) {
                System.out.println("number 1 does not have value 20");
            }

            System.out.println("bool method value -> " + boolMethod());
        }
@Test
    public void stringTest(){
        String academy ="Creative Hub 123!";

        assertEquals(17,academy.length());
        String malibukvi = "creative hub 2026!";
    System.out.println(academy.toUpperCase());
    System.out.println(malibukvi.toUpperCase());
}

    }
