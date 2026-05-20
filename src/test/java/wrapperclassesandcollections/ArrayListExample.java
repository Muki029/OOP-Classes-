package wrapperclassesandcollections;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayListExample {

    @Test
    public void arrayListTest(){
        ArrayList<String> programingLangueages = new ArrayList<>();

        programingLangueages.add("Java");
        programingLangueages.add("Python");
        programingLangueages.add("C++");

        for(int i = 0; i < programingLangueages.size(); i++){
            System.out.println(programingLangueages.get(i));
        }

        System.out.println("-------------------------");
        programingLangueages.add(1,"Javascript");

        for(int i = 0; i < programingLangueages.size(); i++){
            System.out.println(programingLangueages.get(i));
        }
        System.out.println("-----------------------------------------");

        System.out.println("element of index 1: " + programingLangueages.get(1));
        System.out.println("index of element javascript: " + programingLangueages.indexOf("Javascript"));


        System.out.println("---------------------");
        programingLangueages.set(3,"C#");
        for(int i = 0; i < programingLangueages.size(); i++){
            System.out.println(programingLangueages.get(i));
        }

        System.out.println("---------------------");

        System.out.println("Size before removal: " + programingLangueages.size());
        programingLangueages.remove(0); //mozime i spored IME ili spored Index
        // programingLangueages.remove("Java");
        System.out.println("Size after removal: " + programingLangueages.size());


        System.out.println("Is programming languages list empty? " + programingLangueages.isEmpty());

        System.out.println("Does programming langueage Java exist in the list? " + programingLangueages.contains("Java"));
        assertFalse(programingLangueages.contains("Java"));

        System.out.println("Does programming langueage C# exist in the list? " + programingLangueages.contains("C#"));
        assertTrue(programingLangueages.contains("C#"));
    }
}
