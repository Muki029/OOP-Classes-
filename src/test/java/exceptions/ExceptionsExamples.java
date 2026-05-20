package exceptions;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ExceptionsExamples {
    //nevaliden
    @Test (expected = NullPointerException.class)
    public void nullPointerExceptions(){
        Integer age = null;

        String ageAsString;

        ageAsString = age.toString();

        System.out.println(ageAsString);
        assertNotNull(age);
    }
    //go pravime validen so exceptions
   @Test
    public void nullPointerExceptionsHandled(){
        Integer age = null;

        String ageAsString;

        try{
            System.out.println("This is try block");
            ageAsString = age.toString();
        } catch (NullPointerException e){
            System.out.println("This is catch block");

            System.out.println("Exception Message" + e.getMessage());
            System.out.println("Stack trace -->");
            e.printStackTrace();

            age = 0;
            ageAsString = age.toString();
        }


        ageAsString = age.toString();

        System.out.println(ageAsString);
        assertNotNull(ageAsString);
    }

    @Test
    public void outOfBoundsException(){
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        try {
            System.out.println(daysOfTheWeek[10]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(daysOfTheWeek[daysOfTheWeek.length-1]);
        }
    }
}
