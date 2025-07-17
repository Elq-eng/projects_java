

package main.java.com.project.bases.datos_primitivos;


public class TiposPrimitivos {

    public static void main(){
        byte     age        = 25; // 8-bit      -128 a 127
        short    year       = 2025; // 16-bit   -32,768 a 32,767
        int      counter    = 1000; // 32-bit   -2 mil millones aprox.
        long     distance   = 100000000L; //64-bit	número muy grande

        float    weight       = 65.5f; //6-7 dígitos decimales
        double   pi         = 3.1415926; // 64-bit	15 dígitos decimales
        char     word       = 'A';
        boolean  xStudent   = true;


        System.out.println("Edad: " + age);
        System.out.println("Año: " + year);
        System.out.println("Contador: " + counter);
        System.out.println("Distancia: " + distance);
        System.out.println("Peso: " +  weight);
        System.out.println("PI: " + pi);
        System.out.println("Letra: " + word);
        System.out.println("¿Es estudiante?: " + xStudent);


    }
}