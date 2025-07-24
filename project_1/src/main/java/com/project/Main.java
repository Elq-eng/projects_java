

package main.java.com.project;

import java.util.Scanner;
import main.java.com.project.models.Product;
import main.java.com.project.models.Client;


public class Main {

    public static void main( String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean status = true;

        System.out.println("Bienvenido al Supermarket");
        System.out.print("Por favor indique su identificación: ");
        int clientId = scanner.nextInt();
        Client client = new Client(clientId);

        while( status ){

            System.out.println("\nProductos disponibles:");
            System.out.println("1. Manzana - Precio: 5.0");
            System.out.println("2. Pera    - Precio: 3.0");
            System.out.println("3. Piña    - Precio: 1.0");


            System.out.print("¿Cuántos productos desea agregar? ");
            int amount = scanner.nextInt();
            for (int i = 0; i < amount; i++) {
                System.out.print("Ingrese el número del producto (1-3): ");
                int prodId = scanner.nextInt();
                System.out.print("Ingrese la cantidad que desea llevar ");
                int amountProduct = scanner.nextInt();
                Product producto = null;

                switch (prodId) {
                    case 1:
                        producto = new Product(1, amountProduct, true);
                        break;
                    case 2:
                        producto = new Product(2, amountProduct, true);
                        break;
                    case 3:
                        producto = new Product(3, amountProduct, true);
                        break;
                    default:
                        System.out.println("Producto no válido.");
                }

                if (producto != null) {
                    client.addProduct(producto);
                }

            }

            System.out.println("\nSeleccione una acción:");
            System.out.println("1. Eliminar un producto");
            System.out.println("2. Ver productos");
            System.out.println("3. Cambiar precio de producto");
            System.out.println("4. Finalizar compra");

            int select = scanner.nextInt();

            switch (select){
                case 1:
                    System.out.println("Ingrese el id del producto que desea eliminar \n" +
                            " 1. Manzara precio = 5.0 \n 2. Pera precio = 3.0 \n 3. Pina, precio = 1.0");
                    int idProduct = scanner.nextInt();
                    client.deleteProduct( idProduct);
                    client.showProducts();
                    break;
                case 2:
                    client.showProducts();
                    break;
                case 3:
                    System.out.println("Ingrese el numero del producto que desea cambiar \n" +
                            " 1. Manzara precio = 5.0 \n 2. Pera precio = 3.0 \n 3. Pina, precio = 1.0");
                    int updateId = scanner.nextInt();
                    System.out.println("Ingrese la cantidad que quiere llevar");
                    int amountProduct = scanner.nextInt();

                    client.updateProduct( updateId , amountProduct );
                    client.showProducts();
                    break;
                default:
                    status = false;
                    System.out.println("La opcion no es correcta intentelo de nuevo");

            }

            if( status ){
                System.out.println("Si quiere hacer otra haccer introduzca 1 de lo contrario marque 0");
                int response = scanner.nextInt();
                if( response == 1 ){
                    status = false;
                }
            }




        }


    }


}