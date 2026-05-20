package variablesandmethods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VariablesAndMethods {

    int plus(int a , int b){
        return a + b;
    }

    int minusBezParametri(){
        int a = 100;
        int b = 20;
        return a - b;
    }

    @Test
    public void minusTest(){
        assertEquals(80, minusBezParametri());
    }

    @Test
    public void minufiksno(){
        System.out.println(minusBezParametri());
    }






}