package com.johnattan.SpringAOPJava;

public class ClasePrincipal {
	
    public void metodo1(){
    	System.out.println("Soy metodo 1");
    }
    
    public String metodoRetornarEquipo(String nombre){
    	System.out.println("La palabra es " + nombre);
    	String salida = nombre + " Es un super equipo";
    	return salida;
    	
    }
}
