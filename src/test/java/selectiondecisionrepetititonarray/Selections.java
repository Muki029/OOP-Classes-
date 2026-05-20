package selectiondecisionrepetititonarray;

import org.junit.Test;

import static org.junit.Assert.*;

public class Selections {

    String animalSelector(String animal) {
        if (animal.equals("Dog")) {
            System.out.println("This animal is a dog");
            return animal;
        }
        return animal;

    }

    boolean isNumberEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("This number is even");
            return true;
        } else {
            System.out.println("This number is odd");
            return false;
        }
    }

    String daysOfTheWeek(int day) {
        if (day == 1) {
            return "Monday";
        } else if (day == 2) {
            return "Tuesday";
        } else if (day == 3) {
            return "Wednesday";
        } else if (day == 4) {
            return "Thursday";
        } else if (day == 5) {
            return "Friday";
        } else {
            System.out.println("The number value must be from 1 to 5");
            return "error";
        }
    }

    String addAbbreviationOfFormalTittle(String name, String gender, boolean isMarried) {
        if (gender.equalsIgnoreCase("male")) {
            return "Mr. " + name;
        } else if (gender.equalsIgnoreCase("female")) {
            if (isMarried == true) {
                return "Mrs. " + name;
            } else return "Ms. " + name;
        } else {
            System.out.println("You need to enter either Male or Female as gender value");
            return "error";
        }
    }

    public String studentScore(int score) {
        if (score >= 91 && score <= 100) {
            System.out.println("Odlicen");
            return "odlicen";
        } else if (score >= 80 && score <= 89) {
            System.out.println("Mnogu dobar");
            return "mnogu dobar";
        } else if (score >= 70 && score <= 79) {
            System.out.println("Dobar");
            return "dobar";
        } else if (score >= 60 && score <= 69) {
            System.out.println("Dovolen");
            return "dovolen";
        } else if (score >= 0 && score <= 59) {
            System.out.println("Nedovolen");
            return "nedovolen";
        } else {
            System.out.println("ve molime vnesete broj od 0 do 100");
            return "error";
        }
    }

    /// ////////////////////////////////////// NOV METOD ////////////////////
    public String studentScore2(int score) {
        String grade = "";
        String temp = "";

        if (score == 100) {
            grade = "A";
            temp = "+";
            System.out.println("Rezultatot e:" + grade + temp);
        } else if (score == 90) {
            grade = "A";
            temp = "-";
        } else if (score >= 91 && score <= 99) {
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else if (score >= 0 && score <= 59) {
            System.out.println("F");
            return "F";
        } else {
            System.out.println("ve molime vnesete broj od 0 do 100");
            return "error";
        }

        String finalGrade = grade + temp;
        System.out.println(finalGrade);
        return finalGrade;
    }


    public String personHeight(int Height) {
        if (Height >= 1 && Height <= 80) {
            return "short";
        } else if (Height >= 81 && Height <= 180) {
            return "medium";
        } else if (Height >= 181 && Height <= 250) {
            return "tall";
        } else {
            return "please enter correct height from 1 to 250cm";

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

    public String eligibleVote(int age) {
        if (age <= 0) {
            return "please enter valid age";
        }
        if (age >= 18) {
            return "eligible to vote";
        } else if (age < 18) {
            return "not eligible to vote";
        } else {
            return "error";
        }
    }

    public String proveriBukva(char bukva) {
        {
            char malaBukva = Character.toLowerCase(bukva);
            if (malaBukva == 'a' || malaBukva == 'e' || malaBukva == 'i' || malaBukva == 'o' || malaBukva == 'u') {
                return "Vowel";
            } else if (malaBukva >= 'a' && malaBukva <= 'z') {
                return "Consonant";
            } else {
                return "please only enter char from A to Z";
            }
        }
    }

    public String proverka(String tekst) {
        if(tekst.isEmpty()) {
            return "Tekstot e prazen";
        } else {
                return "Tekstot ne e prazen";
            }
        }


    @Test
    public void animalSelectionTest() {
        assertEquals("Dog", animalSelector("Dog"));
    }

    @Test
    public void isNumberEvenOrOddTest() {
        assertTrue("even", isNumberEvenOrOdd(4));
        assertFalse("odd", isNumberEvenOrOdd(5));

        assertTrue(isNumberEvenOrOdd(2));
        assertFalse(isNumberEvenOrOdd(7));
    }

    @Test
    public void daysWeek() {
        assertEquals("Monday", daysOfTheWeek(1));
        assertEquals("Tuesday", daysOfTheWeek(2));
        assertEquals("Wednesday", daysOfTheWeek(3));
        assertEquals("Thursday", daysOfTheWeek(4));
        assertEquals("Friday", daysOfTheWeek(5));

        assertEquals("error", daysOfTheWeek(8));
        assertEquals("error", daysOfTheWeek(0));

    }

    @Test
    public void gender() {
        assertEquals("Mr. Sufyan", addAbbreviationOfFormalTittle("Sufyan", "male", false));
        assertEquals("Mrs. Alina", addAbbreviationOfFormalTittle("Alina", "female", true));
        assertEquals("Ms. Aida", addAbbreviationOfFormalTittle("Aida", "female", false));
    }

    @Test
    public void studentScoreTest() {
        assertEquals("odlicen", studentScore(100));
        assertEquals("error", studentScore(120));
        assertEquals("nedovolen", studentScore(10));
    }

    @Test
    public void heightTest() {
        assertEquals("short", personHeight(40));
        assertEquals("medium", personHeight(140));
        assertEquals("tall", personHeight(190));
        // sega ke dodadam error int
        assertEquals("please enter correct height from 1 to 250cm", personHeight(500));
    }


    @Test
    public void newTestGrades() {
        assertEquals("A+", studentScore2(100));
        assertEquals("A", studentScore2(99));
        assertEquals("A-", studentScore2(90));
        assertEquals("B", studentScore2(85));
    }

    @Test
    public void positiveCheckTest() {
        assertEquals("positive", numbercheck(1));
        assertEquals("negative", numbercheck(-5));
        assertEquals("zero", numbercheck(0));
    }

    @Test
    public void eligibleVoteTest() {
        assertEquals("eligible to vote", eligibleVote(19));
        assertEquals("not eligible to vote", eligibleVote(14));
        assertEquals("please enter valid age", eligibleVote(0));
        assertEquals("please enter valid age", eligibleVote(-1));
    }

    @Test
    public void proveriBukvaTest() {
        assertEquals("Vowel", proveriBukva('a'));
        assertEquals("Consonant", proveriBukva('b'));
        assertEquals("Vowel", proveriBukva('i'));
        assertEquals("please only enter char from A to Z", proveriBukva('#'));
    }

    @Test
    public void proverkaTekstTest(){
        assertEquals("Tekstot e prazen",proverka(""));
        assertEquals("Tekstot ne e prazen",proverka("asdsad"));
    }
}
