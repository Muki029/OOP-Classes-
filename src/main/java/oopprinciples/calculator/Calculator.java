package oopprinciples.calculator;

public class Calculator {

    int num1, num2;
    private String message = "This is summary of two numbers";

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public Calculator() {

    }
    public void setNum1(int num){
        this.num1 = num;
    }
    public void setNum2(int num){
        this.num2 = num;
    }

    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }

    public int calculations(String sign) {
        if (sign.equals("+")) {
            return num1 + num2;
        } else if (sign.equals("-")) {
            return num1 - num2;
        } else if (sign.equals("*")) {
            return num1 * num2;
        } else if (sign.equals("/")) {
            return num1 / num2;
        } else {
            System.out.println("Please enter a sign that is +,-,* or /");
            return 0;
        }
    }

/// //// OVERLOADING //// OVERLOADING //// OVERLOADING /// SAME NAME + or -DIFFERENT VARIABLES
public int addition(int num1,int num2){
        return num1+num2;
}
    public int addition(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public int addition(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }








    }