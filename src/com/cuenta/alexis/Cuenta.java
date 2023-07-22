
package com.cuenta.alexis;
public class Cuenta {
     //Atributos
    String titular;
    double cantidad;
    
    //métodos
    public Cuenta(String titular) {
        this(titular, 0);
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if(cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad = cantidad;
        }
    }
    
    public String getTitular() {
        return titular;
    }
 
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    
    //Si la cantidad ingresada es positiva sumarla, sino no hacer nada
    public void ingresar(double cantidad){
        if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }
    
    public void retirar(double cantidad){
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        }else{
            this.cantidad -= cantidad;
        }
    }
}
