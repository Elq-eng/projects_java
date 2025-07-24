
package  main.java.com.project.models;

import java.util.ArrayList;
import main.java.com.project.models.Product;

public class Client {

    private int idClient;
    private  ArrayList<Product> products;

//    constructorc
    public Client( int idClient  ){
        this.idClient = idClient;
        this.products = new ArrayList<>();
    }

    public int getId(){
        return idClient;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct( Product product ){
        products.add(product);
    }

    public void showProducts(){

        for ( Product p : products){
            if( p.isState() ){
                System.out.println("ID: " + p.getIdProduct() +
                        " | Cantidad: " + p.getAmount() );
            }
        }
    }

    public void deleteProduct( int idProduct){
        for ( Product p : products){
            if( p.getIdProduct() == idProduct ){
                p.setState(false);
            }
        }
    }

    public void updateProduct( int idProduct, int amount ){

        for ( Product p : products){
            if( p.getIdProduct() == idProduct ){
                p.setAmount( amount );
            }
        }
    }


}