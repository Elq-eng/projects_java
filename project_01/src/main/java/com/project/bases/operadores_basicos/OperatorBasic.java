

package main.java.com.project.bases.operadores_basicos;

public class OperatorBasic {

    public static void main(){
        int a = 10, b = 3;
        boolean x = true, y = false;
        final double PI = 3.141502;


        System.out.println("a == b: " + (a == b));
        System.out.println("a > b: " + (a > b));
        System.out.println(" x && y:  " + (x && y));
        System.out.println(" x || y " + ( x || y));
        System.out.println("!x: " + ( !x));
        System.out.println("constantes " + ( PI ));

    }
}