
package main.java.com.project.models;




public class Product{

    private int idProduct;
    private int amount;
    private boolean state;

    public Product( int idProduct, int amount, boolean state){
        this.idProduct = idProduct;
        this.amount = amount;
        this.state = state;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}


