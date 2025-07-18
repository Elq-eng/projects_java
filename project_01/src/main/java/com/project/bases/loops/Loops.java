

package main.java.com.project.bases.loops;

public class  Loops {

    public static void main(){

        for( int i = 1 ; i <= 5 ; i++ ){
            System.out.println( "For: " + i );
        }


        int j = 1;
        while ( j <= 5 ){
            System.out.println("while: "+ j);
            j++;
        }

        int k = 1;
        do{
            System.out.println("DO-WHILE: " + k);
            k++;
        }while(k <= 5);
    }
}