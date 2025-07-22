
package main.java.com.project.bases.clases;

public class Car {

//    atributos privados ( encapsulacion )
    private String mark;
    private String model;
    private int year;
    private boolean state;

//    constructor
    public Car( String mark, String model, int year){
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.state = false;
    }

//Metodos publicos para acceder a los atributos (Getters y Setters)
    public String getMark(){
        return mark;
    }

    public void setMark( String mark){
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void turnOff(){
        if(state){
            state = false;
            System.out.println("El carro se ha apagado");
        }else{
            System.out.println("El carro ya estaba apagado");
        }
    }

    public void turnOn(){
        if(!state){
            state = true;
            System.out.println("El carro se ha encedido");
        }else{
            System.out.println("El carro ya estaba encendido");
        }
    }

    public void showInformation(){
        System.out.println("Mark: " + mark + "Model: " + model + "year: " + year);
    }

}