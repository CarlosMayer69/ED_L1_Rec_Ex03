/*
 * 3. Crie uma função recursiva em Java que 
 * exiba o resultado do fatorial de um número 
 * (pela limitação da recursividade, o número 
 * de entrada deverá ser baixo para não dar estouro
 * (limite de entrada = 12)):
 * 
 * O código deve trazer como comentários:
 * A condição de parada;
 * Como escrever a função para o termo n em função do termo anterior.
 */

package controller;

public class FatorialRecursivoController {

	public FatorialRecursivoController() {
		super();
	}

	public static long calcularFatorial(int n) {
	        // Condição de parada: fatorial de 0 ou 1 é 1
	        if (n == 0 || n == 1) {
	            return 1;
	        }

	        // Chamada recursiva: fatorial de n em função do fatorial de (n - 1)
	        return n * calcularFatorial(n - 1);
	}
}




