

package main.java.com.project.bases.coleccionesBasics;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections{

    public static void main(){

//        arrays
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        for( int number: numbers){
            System.out.println("Valor: " + number);
        }

//        List
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Manzana");
        fruits.add("Pera");
        fruits.add("Pinia");

        for( String fruit: fruits){
            System.out.println("Fruta: " + fruit);
        }
        fruits.remove("Pera");
        System.out.println("Después de eliminar: " + fruits);


        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Juan", 67);
        ages.put("Pedro", 3);
        ages.put("Lucas", 43);

        System.out.println("Edad de Ana: " + ages.get("Ana"));

        for (String name : ages.keySet()) {
            System.out.println( name + " Tiene " + ages.get(name) + " Anios ");
        }


    }
}