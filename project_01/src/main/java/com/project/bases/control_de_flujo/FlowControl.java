



package main.java.com.project.bases.control_de_flujo;

public class FlowControl {

    public static void main(){
        int grade = 85;
        boolean condition1 = grade >= 90;
        boolean condition2 = grade >= 70 && grade < 90;

        if( condition1 ){
            System.out.println("Excelente");
        }else if( condition2  ){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }

        int option = 2;
        switch( option ){
            case 1: System.out.println("Chose option 1"); break;
            case 2: System.out.println("Chose option 2"); break;
            default:System.out.println("Option disavailable");
        }

    }
}

