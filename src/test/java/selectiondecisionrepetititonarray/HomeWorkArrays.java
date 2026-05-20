package selectiondecisionrepetititonarray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
public class HomeWorkArrays {


    public int returnThird(int[] niza) {
        return niza[2];
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public String findMaxString(String[] array) {
        String maxString = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxString.length()) {
                maxString = array[i];
            }
        }
        return maxString;
    }

    public int[] arraysSint = {1, 3, 5, 2, 4, 6, 8, 10, 12, 15};
    String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    String[] workingDays;
    String[] weekend;
    public int[] mnozenje = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public int vratiPomnozenBroj(int kojIndeks) {
        int rezultat = kojIndeks * 10;
        return rezultat;
    }

    public int povtoruvanje(int[] broj,int baranBroj){
        int povtorenBroj = 0;
            for (int i = 0 ; i < broj.length ; i++){
                if (broj[i] == baranBroj) {
            povtorenBroj++;
                }
            }

        return povtorenBroj;
    }

    public int najdiNajmalBroj(int[] najmalBroj){
        int minBroj = najmalBroj[0];
        for(int i = 0 ; i < najmalBroj.length ; i++){
            if(najmalBroj[i] < minBroj){
                minBroj = najmalBroj[i];

            }
        } return minBroj;
    }

    /// ////////////  TEST ////////// TEST ////////// TEST /////
    @Test
    public void testReturn() {
        int[] novaNiza = new int[]{25, 30, 35, 40, 45, 50, 55, 60, 65, 70};

        assertEquals(35, novaNiza[2]);
        for (int i = 0; i < novaNiza.length; i++) {
            System.out.println("brojki :" + novaNiza[i]);
        }


        for (int i = novaNiza.length - 1; i >= 0; i--) ;

    }

    @Test
    public void returnThirdTest() {
        int[] vratiTretBroj = {20, 40, 60, 50, 10, 70, 100};
        System.out.println(returnThird(vratiTretBroj));
        assertEquals(60, vratiTretBroj[2]);
    }

    @Test
    public void test1() {
        int[] array = {40, 50, 60, 100, 200, 400, 600};
        int rezultat = findMax(array);
        System.out.println(rezultat);
    }

    @Test
    public void findMaxStringTest() {
        String gradovi[] = {"Skopje", "Kichevo", "Struga", "Tetovo", "Kriva Palanka"};
        assertEquals("Kriva Palanka", findMaxString(gradovi));
    }

    @Test
    public void reverseBroevi() {
        int[] broevi = {2, 4, 6, 8, 10};
        for (int i = broevi.length - 1; i >= 0; i--) {
            System.out.println(broevi[i]);
        }
    }

    @Test
    public void probaTest() {
        int[] arrayInt = new int[5];
        arrayInt[0] = 400;
        System.out.println(arrayInt[0]);

        //site da gi naredit
        for (int i = 0; i < arraysSint.length; i++) {
            System.out.println(arraysSint[i]);
        }
        for (int i = 0; i < daysOfTheWeek.length; i++) {
            System.out.println(daysOfTheWeek[i]);
        }

        weekend = Arrays.copyOfRange(daysOfTheWeek, 5, 7);
        for (int i = 0; i < weekend.length; i++) {
            System.out.println(daysOfTheWeek[i] + "Novo");
        }
    }

    @Test
    public void testiranjeSam() {

        workingDays = Arrays.copyOfRange(daysOfTheWeek, 0, 5);
        weekend = Arrays.copyOfRange(daysOfTheWeek, 5, 7);


        for (int i = 0; i < workingDays.length; i++) {
            System.out.println("raboten den " + workingDays[i]);
        }
        for (int i = 0; i < weekend.length; i++) {
            System.out.println("vikend " + weekend[i]);
        }

            System.out.println(arraysSint[3]+arraysSint[4]+arraysSint[5]);


        for (int i = 0 ; i < arraysSint.length ; i++) {
            if (arraysSint[i] % 2 == 0) {
                System.out.println("Paren Broj " + arraysSint[i]);
            }
        }

        int broj = 7;
        for(int i = 1 ; i <=10; i++){
            int rezultat = broj * i;
            System.out.println(broj + "*" + i + " = " + rezultat);
        }


        int dobienRezultat = vratiPomnozenBroj(1);
        assertEquals(10,dobienRezultat);
        System.out.println("dobieniot rezultat e -> " + dobienRezultat);


        int[] podatoci = {5,23,42,3,5,23,5};
        int result = povtoruvanje(podatoci,5);
        assertEquals(3,result);
        System.out.println("brojot se povtoruva " + result + " pati");


        int[] niza = {5,123,4325,2323523,43223,21,3342};
        int rezultatNajmalBroj = najdiNajmalBroj(niza);
        assertEquals(5,najdiNajmalBroj(niza));
        System.out.println("Najmaliot broj vo nizata e = " + rezultatNajmalBroj);

}
}