
package main.java.com.project;


import main.java.com.project.bases.datos_primitivos.TiposPrimitivos; //src/main/java/com/project/bases/datos_primitivos/TiposPrimitivos.java
import main.java.com.project.bases.operadores_basicos.OperatorBasic; //src/main/java/com/project/bases/operadores_basicos/OperatorBasic.java
import main.java.com.project.bases.control_de_flujo.FlowControl; //src/main/java/com/project/bases/operadores_basicos/OperatorBasic.java
import main.java.com.project.bases.loops.Loops;
import main.java.com.project.bases.coleccionesBasics.Collections;


public class Main {

    public static void main( String[] args) {

        System.out.println("Welcome project 0");
//      typesPrimitive
        TiposPrimitivos.main();
//        operatorBasicos
        OperatorBasic.main();
//        flow control
        FlowControl.main();
//        loops
        Loops.main();
//        colections
        Collections.main();

    }
}

