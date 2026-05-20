package oopprinciples;

import oopprinciples.calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {
    //object created with full constructor
    Calculator calculator1 = new Calculator(20,10);
    //object created with empty constructor
    Calculator calculator2 = new Calculator();

@Test

    public void calculatorTest(){

    assertEquals(20,calculator1.getNum1());
    assertEquals(10,calculator1.getNum2());

    assertEquals(30,calculator1.calculations("+"));
    assertEquals(10,calculator1.calculations("-"));
    assertEquals(200,calculator1.calculations("*"));
    assertEquals(2,calculator1.calculations("/"));


    calculator2.setNum1(100);
    calculator2.setNum2(50);

    assertEquals(100,calculator2.getNum1());
    assertEquals(50,calculator2.getNum2());

    assertEquals(150,calculator2.calculations("+"));
    assertEquals(50,calculator2.calculations("-"));
    assertEquals(5000,calculator2.calculations("*"));
    assertEquals(2,calculator2.calculations("/"));

    }
}
