package operatorsandstrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeWork {
    //metod prvata varijabla da e ednakva so vtorata
    int a = 10;
    int b = 10;
    int c = 20;
    int d = 5;

    boolean istaV() {
        return a == b;
    }

    //metod dali prvata (A = 10) e pogolema od vtorata (C = 20)
    boolean pogolemaV() {
        return a > c;
    }

    //metod dali prvata (D = 5) e pomala od vtorata (a = 10)
    boolean pomalaV() {
        return d < a;
    }

    public int calculator(int num1, int num2, char sign) {
        if (sign == '+') {
            return num1 + num2;
        } else if (sign == '-') {
            return num1 - num2;
        } else if (sign == '*') {
            return num1 * num2;
        } else if (sign == '/') {
            if (num2 == 0) {
                return 0;
            }
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public String numbercheck(int num) {
        if (num > 0) {
            return "positive";
        } else if (num < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    public String returnGrade(int a) {
        if (a <= 0 || a >= 101) {
            return "unvalid number";
        } else if (a >=90 || a == 100) {
            return "A";
        } else if (a >= 80 || a == 89) {
            return "B";
        } else if (a >= 70 || a == 79) {
            return "C";
        } else if (a >=60 || a == 69){
            return "D";
        } else if (a <=59){
            return "F";
        } else return "Error";
    }

    public String heightMethod(int num){
        if(num <= 0 || num >= 251){
            throw new IllegalArgumentException("Height min is 1 & 250 max");
        }else if (num >=1 && num <= 80){
            System.out.println("short");
            return "short";
        }else if (num >=81 && num <= 180){
            System.out.println("medium");
            return "medium";
        }else if (num >= 181){
            System.out.println("tall");
            return "tall";
        } else
            System.out.println("not valid number");
            return "Error";
    }


    @Test
    public void Test() {
        assertTrue(istaV());
        System.out.println("Rezultatot od istaV e :" + istaV());
        assertFalse(pogolemaV());
        System.out.println("Rezultatot od pogolemaV e :" + pogolemaV());
        assertTrue(pomalaV());
        System.out.println("Rezultatot od pomalaV e :" + pomalaV());

        //String

        String parametar1 = "creaTive";
        String parametar2 = "huB";
        String finalenString = parametar1 + " " + parametar2;
        System.out.println(finalenString.toUpperCase());
    }

    public void zamenaNaBrojki(int a, int b) {
        // 1. pred zamena
        System.out.println("pred zamena: a=" + a + ",b=" + b);

        int temp;

        temp = a;
        a = b;
        b = temp;

        // posle zamena
        System.out.println("posle zamena:  a=" + a + ",b=" + b);
    }

    @Test
    public void test2() {
        zamenaNaBrojki(10, 20);
    }

    @Test
    public void RezultatcalculatorTest() {
        assertEquals(10, calculator(5, 5, '+'));
        assertEquals(100, calculator(10, 10, '*'));
    }


    @Test
    public void numberCheckTest() {
        assertEquals("negative", numbercheck(10));
    }

    @Test
    public void returnGradeTest() {
        assertEquals("A", returnGrade(94));
        assertEquals("B", returnGrade(82));
        assertEquals("C", returnGrade(78));
        assertEquals("D", returnGrade(69));
        assertEquals("F", returnGrade(32));
    }

@Test
    public void heightTest(){
    assertEquals("tall",heightMethod(243));
    assertEquals("medium",heightMethod(167));
    assertEquals("short",heightMethod(75));
    assertEquals("not valid number",heightMethod(251));

}





}