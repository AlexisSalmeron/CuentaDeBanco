package com.test.alexis;

import com.cuenta.alexis.Cuenta;

public class Test {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Alexis");
        Cuenta cuenta2 = new Cuenta("Alfredo", 500);
        
        cuenta1.ingresar(500);
        cuenta2.ingresar(100);
        
        System.out.println("cuenta1 = " + cuenta1);
        System.out.println("cuenta2 = " + cuenta2);
        
        cuenta1.retirar(300);
        cuenta2.retirar(700);
        
        System.out.println("cuenta1 = " + cuenta1);
        System.out.println("cuenta2 = " + cuenta2);
    }
}
