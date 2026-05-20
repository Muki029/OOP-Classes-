package exceptions;

import org.junit.Test;

public class claudeExceptionTraining {
    String[] stringArray = {"one","two","three"};

    @Test
    public void printStringArray() {
        try {
            System.out.println(stringArray[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error -> index doesnt exist in the array");
        }
    }
}
