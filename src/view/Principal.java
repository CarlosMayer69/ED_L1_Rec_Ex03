package view;

import controller.FatorialRecursivoController;

public class Principal {

	

	    public static void main(String[] args) {
	    	
	    	FatorialRecursivoController fr = new FatorialRecursivoController();
	    	
	        int numero = 5; // Altere o n�mero conforme necess�rio
	        long resultado = fr.calcularFatorial(numero);

	        System.out.println("O fatorial de " + numero + " �: " + resultado);
	    }

	}


