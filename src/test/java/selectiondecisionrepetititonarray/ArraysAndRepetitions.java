package selectiondecisionrepetititonarray;

import org.junit.Test;

import java.util.Arrays;

public class ArraysAndRepetitions {

    @Test
    public void arrays() {


        int[] arrayIntegers = new int[5];
        int[] arrayIntegersCopy;
        arrayIntegers[0] = 900;
        arrayIntegers[1] = 20;
        arrayIntegers[2] = 1000;
        arrayIntegers[3] = 999;
        arrayIntegers[4] = 1;

        int[] numbersForSorting = {5,2,1,4,3};
        char[] charsForSorting = {'c','b','a','d','e'};

        // mozime da gi spojuvame
        System.out.println(arrayIntegers[0] + arrayIntegers[1]);


        //Printing separate elemets of array of index
        /// ///// INTEGERS
        System.out.println("// INTEGERS //");
        System.out.println("First number of the integer array ->" + arrayIntegers[0]);
        System.out.println("Secound number of the integer array ->" + arrayIntegers[1]);
        System.out.println("Third number of the integer array ->" + arrayIntegers[2]);
        System.out.println("Forth number of the integer array ->" + arrayIntegers[3]);
        System.out.println("Fifth number of the integer array ->" + arrayIntegers[4]);
        ///
        System.out.println(" // DAYS OF THE WEEK //");


        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] daysOfTheWeekCopy;
        String[] workingDays;
        String[] weekend;
        String[] undefinedArray = new String[7];


        System.out.println("First day of the week ->" + daysOfTheWeek[0]);
        System.out.println("Second day of the week ->" + daysOfTheWeek[1]);
        System.out.println("Third day of the week ->" + daysOfTheWeek[2]);
        System.out.println("Forth day of the week ->" + daysOfTheWeek[3]);
        System.out.println("Fifth day of the week ->" + daysOfTheWeek[4]);
        System.out.println("Sixth day of the week ->" + daysOfTheWeek[5]);
        System.out.println("Seventh day of the week ->" + daysOfTheWeek[6]);

        //printing whole array with for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("// for cycle integer array ->" + arrayIntegers[i]);
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("// for cycle days of the week ->" + daysOfTheWeek[i]);
        }

        //i = 0 Monday, i++ (0+1 ... i=1) 0 < 7
        //i = 1 Tuesday  i++ (1+1, i=2) 1 < 7
        //i = 2 Wednesday i++ (2+1, i=3) 2 < 7


        //copy of array
        daysOfTheWeekCopy = Arrays.copyOf(daysOfTheWeek, 7);

        for (int i = 0; i < daysOfTheWeek.length; i++) {
            System.out.println("Copied array value -> " + daysOfTheWeekCopy[i]);
        }

        arrayIntegersCopy = Arrays.copyOf(arrayIntegers, 5);
        for (int i = 0; i < arrayIntegersCopy.length; i++) {
            System.out.println("Copied array value integer ->" + arrayIntegersCopy[i]);
        }

        // copy of range

        workingDays = Arrays.copyOfRange(daysOfTheWeek, 0, 5);
        weekend = Arrays.copyOfRange(daysOfTheWeek, 5, 7);

        for (int i = 0; i < workingDays.length; i++) {
            System.out.println("Work day => " + workingDays[i]);
        }
        for (int i = 0; i < weekend.length; i++) {
            System.out.println("Weekend day => " + weekend[i]);
        }

        //fill
        Arrays.fill(undefinedArray,"Some value");
        for(int i = 0 ; i < undefinedArray.length; i++){
            System.out.println("Undefined array Value" + undefinedArray[i]);
        }

        //sort
        Arrays.sort(numbersForSorting);
        Arrays.sort(charsForSorting);



        for(int i = 0 ; i < numbersForSorting.length; i++) {
            System.out.println("Sorted numbers array Value => " + numbersForSorting[i]);
        }

            for(int i = 0 ; i < charsForSorting.length; i++) {
                System.out.println("Sorted Charachters array Value => " + charsForSorting[i]);
            }


    }
}
